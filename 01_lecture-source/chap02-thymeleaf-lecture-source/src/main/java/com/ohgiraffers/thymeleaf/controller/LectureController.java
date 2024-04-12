package com.ohgiraffers.thymeleaf.controller;

import com.ohgiraffers.thymeleaf.model.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class LectureController {

    @GetMapping("/lecture/expression")
    public ModelAndView expression(ModelAndView mv) {

        /* ModelAndView 이 친구는 Spring-Web-MVC 파트에서 깊게 다룰 예정이다.
         *  따라서 지금은 단순히 내가 보여줄 동적인 페이지와 정보들을 담을 클래스 라고
         *  생각을 해보자
         *  */

        mv.addObject("member", new MemberDTO("조평훈",20,'남', "경기도 수원시"));

        mv.addObject("hello", "hello <h3> thymeleaf!!</h3>");

        mv.setViewName("/lecture/expression");  // 보내줄 페이지를 (가로)안에 정하는 것!(setViewName)


        return mv;
    }

//    @GetMapping("/lecture/conditional")
    @GetMapping("/conditional")
    public ModelAndView conditional(ModelAndView mv) {

        mv.addObject("num",1);
        mv.addObject("str","바나나");

        return mv;
    }
}