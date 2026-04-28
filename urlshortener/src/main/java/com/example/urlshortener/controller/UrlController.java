package com.example.urlshortener.controller;

import com.example.urlshortener.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class UrlController {

    @Autowired
    private UrlService service;

    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam String url) {
        return service.generateShortUrl(url);
    }

    @GetMapping("/{shortCode:^(?!(?:error|shorten)$)[A-Za-z0-9_-]+$}")
    public void redirect(@PathVariable String shortCode, HttpServletResponse response) throws IOException {
        String originalUrl = service.getOriginalUrl(shortCode);

        if (originalUrl != null) {
            response.sendRedirect(originalUrl);
        } else {
            response.sendError(404, "URL not found");
        }
    }
}
