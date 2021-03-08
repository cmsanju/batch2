package com.cts.irctc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice()
public class ReservationExceptionAdvice {
	@ExceptionHandler(ReservationException.class)
	public String handleException(ReservationException error, Model model) {
		model.addAttribute("error", error.getMessage());
		return "index";
	}
}
