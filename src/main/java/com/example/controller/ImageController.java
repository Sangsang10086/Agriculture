package com.example.controller;

import com.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    // 根据图片路径数组获取图片的 Base64 编码列表
    @GetMapping("/images")
    public List<String> getImages(@RequestParam("paths") List<String> imagePaths) {
        return imageService.getImagesBase64(imagePaths);
    }
}