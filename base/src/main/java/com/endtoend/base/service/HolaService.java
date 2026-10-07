package com.endtoend.base.service;

import com.endtoend.base.dto.HolaResponse;
import org.springframework.stereotype.Service;

@Service
public class HolaService {

	public HolaResponse saludar() {
		return new HolaResponse("Hola mundo");
	}

}
