package com.cts.irctc.service;


import java.util.ArrayList;

import java.util.List;

import com.cts.irctc.model.Reservation;



public class IRCTCService {
	
	private static List<Reservation> resData = new ArrayList<Reservation>();
	static {
		String[] food = {"breakFast", "lunch", "food"};
		String[] seat = {"M1", "M2", "L1","L2","U1","U2"};
		
		resData.add(new Reservation("Rock", "finch", "male",food, "Bangolore", "Hyderabad",seat,"21/10/2020"));
	}

	public static Reservation reservationRequest(Reservation res) {
		
		resData.add(res);		
		
		return res;
	}
	
	public static boolean validateFromToCity(Reservation res)
	{
		boolean ft = res.validate(res.getCityFrom(), res.getCityTo());
		
		return ft;
	}
	
}
