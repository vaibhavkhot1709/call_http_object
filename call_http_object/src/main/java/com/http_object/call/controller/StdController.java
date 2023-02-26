package com.http_object.call.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.http_object.call.model.Student;
import com.http_object.call.service.StdService;

@RestController
@RequestMapping("/object/calling")
public class StdController {

	@Autowired
	StdService service;
	
	@PostMapping("/student")
	public Student postStudent(@RequestBody Student student) throws RestClientException, URISyntaxException {
		
		return service.postStudent(student);
	}
}
