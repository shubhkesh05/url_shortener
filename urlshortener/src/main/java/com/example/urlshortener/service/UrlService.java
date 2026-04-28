package com.example.urlshortener.service;

import com.example.urlshortener.model.Url;
import com.example.urlshortener.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UrlService {

    @Autowired
    private UrlRepository repository;

    private final String BASE_URL = "http://localhost:8080/";

    public String generateShortUrl(String originalUrl) {
        String shortCode = getRandomString(6);

        Url url = new Url();
        url.setOriginalUrl(originalUrl);
        url.setShortUrl(shortCode);

        repository.save(url);

        return BASE_URL + shortCode;
    }

    public String getOriginalUrl(String shortCode) {
        return repository.findByShortUrl(shortCode)
                .map(Url::getOriginalUrl)
                .orElse(null);
    }

    private String getRandomString(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
