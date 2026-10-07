package com.endtoend.base.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Manejo global de errores. Responde en formato Problem Details (RFC 9457).
 * Los errores de Spring MVC (400, 404, 405, etc.) ya salen con ese formato
 * gracias a {@code spring.mvc.problemdetails.enabled}.
 */
@RestControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ProblemDetail manejarErrorInesperado(Exception ex) {
		return ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, "Error interno del servidor");
	}

}
