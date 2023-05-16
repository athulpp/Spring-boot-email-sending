package com.example.app4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app4.resources.EmailMessage;
import com.example.app4.service.EmailSenderService;

@RestController
public class EmailController {
	@Autowired
	private final EmailSenderService emailSenderService;
	
	public EmailController(EmailSenderService emailSenderService) {
		this.emailSenderService=emailSenderService;
	}
	
	@PostMapping("/send")
	public ResponseEntity<String> sendEmail(@RequestBody EmailMessage emailMessage){
		this.emailSenderService.sendEmail(emailMessage.getTo(),emailMessage.getSubject(), emailMessage.getMessage());
		return ResponseEntity.ok("Success");
	}

}
