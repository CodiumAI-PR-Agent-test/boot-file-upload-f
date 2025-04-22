package org.example.bootfileupload.controller;

import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/file")
@Log
public class FileController {
    @PostMapping(consumes = "multipart/form-data")
    public ResponseEntity<Void> upload(@RequestParam("files") MultipartFile[] files) {
        for (MultipartFile file : files) {
            log.info(file.getOriginalFilename());
        }
        return ResponseEntity.ok().build();
    }
}
