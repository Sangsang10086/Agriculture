package com.example.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping
public class FileUpdataController {

    // 注入文件存储路径
    @Value("${file.upload-dir}")
    private String uploadDir;
    @PostMapping("/upload")
    public String uploadProduct(@RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return "请选择文件";
        }

        // 生成唯一文件名
        String originalFilename = file.getOriginalFilename();
        String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
        String uniqueFileName = UUID.randomUUID().toString() + fileExtension;

        // 保存文件到服务器指定目录，这里假设为 uploads 目录
        File dest = new File(uploadDir + uniqueFileName);
        file.transferTo(dest);

        // 返回文件的存储路径给前端
        return "/uploads/" + uniqueFileName;

    }
    @PostMapping("/uploadDelete")
    public String uploadDelete(@RequestParam("file") String filePath) throws IOException {

        // 提取文件名
        String fileName = filePath.substring(filePath.lastIndexOf("/") + 1);

        // 构建文件路径
        File fileToDelete = new File(uploadDir + fileName);

        // 检查文件是否存在并删除
        if (fileToDelete.exists() && fileToDelete.delete()) {
            return "删除成功";
        } else {
            return "删除失败，文件不存在或无法删除";
        }
    }
}