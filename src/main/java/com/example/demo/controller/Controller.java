package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Money;
import com.example.demo.model.ResponseFormat;
import com.example.demo.services.RobService;


@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class Controller {
	
	@Autowired
	RobService robService;
	
	@PostMapping("/rob")
	public ResponseEntity<ResponseFormat> rob(@RequestBody Money money) {
		List<Integer> nums = money.getMoney();
		ResponseFormat result = robService.rob(nums);
		return new ResponseEntity<ResponseFormat>(result, HttpStatus.OK);
	}
	
	
}
