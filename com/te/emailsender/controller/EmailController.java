package com.te.emailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.emailsender.service.SendEmailService;

@RestController
public class EmailController {

	
	@Autowired
	private SendEmailService sendEmailService;
	
	@GetMapping("/sendEmail")
	public String sendEmail() {
		sendEmailService.sendEmail("shubham9096760224@gmail.com", "body--> i want to go somewhere with my Gf plz give 2 days holiday", "Subject---> Holiday for 2 days");
	
		return "sent successfully";
	}
}
