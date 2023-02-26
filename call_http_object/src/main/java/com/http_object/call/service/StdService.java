package com.http_object.call.service;

import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.http_object.call.model.Student;

@Service
public class StdService {

	RestTemplate restTemplate = new RestTemplate();

	@Value("${baseUrl}")
	String uri;

	public Student postStudent(Student student) throws RestClientException, URISyntaxException {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		Student std = restTemplate.postForObject(uri, headers, Student.class);
		return std;
	}

}
