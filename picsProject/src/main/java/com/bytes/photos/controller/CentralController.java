package com.bytes.photos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class CentralController {
    @GetMapping("/")
    public String index() {
        return "uploadfile";
    }
}
