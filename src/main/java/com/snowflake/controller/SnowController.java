package com.snowflake.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.snowflake.modal.Student;
import com.snowflake.repo.SnowRepo;
import com.snowflake.service.SnowService;

@RestController
public class SnowController {

	@Autowired
	SnowService snowService;

	@GetMapping(value = "/student",produces = {"application/json"})
	public List<Student> studentdata() {
		return snowService.findByAll();
	}

	
	
}
