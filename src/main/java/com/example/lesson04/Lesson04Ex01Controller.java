package com.example.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/lesson04/ex01")
@Controller // jsp로 보낼 때는 @responsebody가 없어야 함
public class Lesson04Ex01Controller {
	
	// 회원가입 페이지
	// http://localhost/lesson04/ex01/sign-up-view
	@RequestMapping(path = "/sign-up-view", method = RequestMethod.GET)
	public String SignUpview() {
		return "lesson04/signUp";
	}
	
}
