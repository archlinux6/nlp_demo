package com.example.demo.controller;

import com.example.demo.utils.AIutils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class AIcontroller {
    @RequestMapping(value = "/pic", method = RequestMethod.POST)
    public  String PicToWord(@RequestParam("file") MultipartFile file) throws IOException {
        String res = AIutils.picToWords(file);
        System.out.println(res);
        return res;
    }
}
