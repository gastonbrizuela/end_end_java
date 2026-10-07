package com.endtoend.base.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class HolaControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void saludarDevuelveHolaMundo() throws Exception {
		mockMvc.perform(get("/api/v1/hola"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.mensaje").value("Hola mundo"));
	}

}
