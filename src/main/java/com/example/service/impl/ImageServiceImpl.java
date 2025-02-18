package com.example.service.impl;

import com.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;
@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    // 根据图片路径数组获取图片的 Base64 编码列表
    public List<String> getImagesBase64(List<String> imagePaths) {
        List<String> base64Images = new ArrayList<>();
        for (String imagePath : imagePaths) {
            String key = "image:" + imagePath;
            String base64Image = redisTemplate.opsForValue().get(key);
            if (base64Image == null) {
                try {
                    File file = new File(imagePath);
                    if (file.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        byte[] bytes = new byte[(int) file.length()];
                        fileInputStream.read(bytes);
                        base64Image = Base64.getEncoder().encodeToString(bytes);
                        // 将图片的 Base64 编码存入 Redis 缓存，设置过期时间为 1 小时
                        redisTemplate.opsForValue().set(key, base64Image, 1, TimeUnit.HOURS);
                        fileInputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    base64Image = null; // 若读取失败，设置为 null
                }
            }
            base64Images.add(base64Image);
        }
        return base64Images;
    }
}
