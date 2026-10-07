package com.endtoend.base.controller;

import com.endtoend.base.dto.HolaResponse;
import com.endtoend.base.service.HolaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hola")
public class HolaController {

	private final HolaService holaService;

	public HolaController(HolaService holaService) {
		this.holaService = holaService;
	}

	@GetMapping
	public HolaResponse saludar() {
		return holaService.saludar();
	}

}
