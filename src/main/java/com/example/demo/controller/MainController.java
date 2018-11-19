package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;

@RestController
public class MainController {
	
	@RequestMapping("/rest")
	public Usuario greeting() {
		return new Usuario("Angelo Ravello", true);
	}
}
