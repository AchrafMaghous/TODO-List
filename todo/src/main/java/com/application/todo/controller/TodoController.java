package com.application.todo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	@GetMapping("/sngt")
	@ResponseBody()
	public ResponseEntity<Object> index() {
		Map<String, String> data = new HashMap<>();
		data.put("data", "hello sngt");

		return new ResponseEntity<>(data, HttpStatus.OK);
	}
}
