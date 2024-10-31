package com.koreait.assignment_24_10.service;

import com.koreait.assignment_24_10.repository.FAQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FAQService {

    @Autowired
    FAQRepository faqRepository;

    public String questions(String str) {

        String str2 = "";
        if(str.contains("회원가입")) str2 = "회원가입";
        else if(str.contains("비밀번호")) str2 = "비밀번호";
        else if(str.contains("규칙")) str2 = "규칙";
        else if(str.contains("게시") && str.contains("신고")) str2 = "게시글신고";
        else if(str.contains("게시") && (str.contains("수정") || str.contains("삭제"))) str2 = "게시글수정";
        else if(str.contains("댓글") && str.contains("신고")) str2 = "댓글신고";
        else if(str.contains("게시")) str2 = "게시";
        else if(str.contains("댓글")) str2 = "댓글";
        else if(str.contains("프로필")||str.contains("닉네임")) str2 = "내정보";
        else if(str.contains("탈퇴")) str2 = "탈퇴";

        String answer = faqRepository.questions(str2);

        if (answer == null || answer.length() <= 0) {
            return "해당 질문에 대한 답변이 없습니다";
        }

        return answer;
    }
}
