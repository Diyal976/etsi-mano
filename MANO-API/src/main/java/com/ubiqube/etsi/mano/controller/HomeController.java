package com.ubiqube.etsi.mano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class HomeController {
	@RequestMapping(value = "/")
	public String index() {
		System.out.println("swagger-ui.html");
		return "redirect:swagger-ui.html";
	}
}