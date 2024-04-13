package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    private ConcurrentMap<String, String> documents = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public String getDocument(@PathVariable String id) {
        return documents.getOrDefault(id, "Document not found");
    }

    @PostMapping
    public String addDocument(@RequestParam String id, @RequestParam String content) {
        documents.put(id, content);
        return "Document added successfully";
    }
}
