package com.gitlab.modaslam.simpleservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping
	public ResponseEntity<String> getSimpleResponse() {
		return new ResponseEntity<String>("Request received!", HttpStatus.OK);
	}
}
