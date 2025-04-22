package org.example.bootfileupload.service;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Log
public class StorageService {
    @Value("${supabase.url}")
    private String url;
    @Value("${supabase.access-key}")
    private String accessKey;
    @Value("${supabase.pdf-bucket-name}")
    private String pdfBucketName;
    @Value("${supabase.img-bucket-name}")
    private String imgBucketName;
    @Value("${supabase.sheet-bucket-name}")
    private String sheetBucketName;

    public String upload(MultipartFile file) throws Exception {
        return "";
    }
}
