package com.example.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageService {
    List<String> getImagesBase64(List<String> imagePaths);
}
