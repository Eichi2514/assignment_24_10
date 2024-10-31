package com.koreait.assignment_24_10.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FAQRepository {
    @Select("""
           SELECT answer
           FROM FAQ
           WHERE str = #{str2}
           """)
    String questions(String str2);
}

