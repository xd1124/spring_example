package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Spring 객체임을 등록, Spring bean 등록
public class Lesson01Ex01Controller_del {
	
	// 요청 URL : http://localhost:8080/lesson01/ex01/1
	@ResponseBody // 리턴되는 문자열을 response body에 담아 보낸다
	@RequestMapping("/lesson01/ex01/9999") // 주소 Mapping
	public String ex01_9999() {
		String text="<h1>문자열을 response body로 보내는 예제</h1>";
		return text;
	}
	
	// 요청 URL : http://localhost:8080/lesson01/ex01/2
	@RequestMapping("/lesson01/ex01/999")
	@ResponseBody
	public Map<String, Object> ex01_999() {
		Map<String, Object> map = new HashMap<>();
		map.put("apple", 4);
		map.put("banana", 53);
		map.put("orange", 124);
		map.put("grape", 62);
		return map;
	}
}
