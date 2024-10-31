package com.koreait.assignment_24_10.controller;

import com.koreait.assignment_24_10.service.FAQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsrFAQController {

    @Autowired
    private FAQService faqService;

    @PostMapping("/usr/FAQ/questions")
    public ResponseEntity<String> questions(@RequestParam String str) {
        String answer = faqService.questions(str);
        return ResponseEntity.ok(answer); // 직접 문자열 반환
    }
}