package org.example.bootfileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "파일을 업로드해봅시다!");
        return "index";
    }
}