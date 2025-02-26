package com.example.service;

import java.util.concurrent.TimeUnit;

// 定义一个通用的缓存服务接口
public interface CacheService<T> {
    /**
     * 存储数据到缓存
     * @param key 缓存的键
     * @param value 缓存的值
     * @param timeout 缓存过期时间
     * @param unit 时间单位
     */
    void save(String key, T value, long timeout, TimeUnit unit);

    /**
     * 从缓存中获取数据
     * @param key 缓存的键
     * @return 缓存的值，如果不存在则返回 null
     */
    T get(String key);

    /**
     * 从缓存中删除数据
     * @param key 缓存的键
     */
    void delete(String key);
}