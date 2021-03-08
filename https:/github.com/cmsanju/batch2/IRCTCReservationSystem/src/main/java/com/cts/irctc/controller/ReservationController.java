package com.cts.irctc.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.irctc.model.Reservation;
import com.cts.irctc.service.IRCTCService;



@Controller
public class ReservationController {
	
	@GetMapping("/home")
	public String showHomepage() {
		
		return "index";
	}

	@GetMapping("/bookingForm")
	public String bookingForm(Model model, Reservation res) 
	{
		Reservation resreq = IRCTCService.reservationRequest(res);
		
		model.addAttribute("reservation", resreq);

		return "reservation-page";
	}

	@PostMapping("/submitForm")
	public String submitForm(@Valid @ModelAttribute("reservation") Reservation res,
			BindingResult bindingResult, Model model) {
		
		
		if (bindingResult.hasErrors()) {
			
			model.addAttribute("reservation", res);			
			return "reservation-page";
		}
		
		boolean check = IRCTCService.validateFromToCity(res);
		if(check)
		{
			String msg = "Please check your source and destination city";
			model.addAttribute("reservation", msg);
			return "error";
		}
		else {
		return "confirmation-form";
		}
	}
}
