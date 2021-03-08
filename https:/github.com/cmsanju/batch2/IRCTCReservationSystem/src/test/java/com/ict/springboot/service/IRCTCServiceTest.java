
package com.ict.springboot.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cts.irctc.model.Reservation;

import com.cts.irctc.service.IRCTCService;

@RunWith(SpringJUnit4ClassRunner.class)
public class IRCTCServiceTest {
	
	@InjectMocks
	static Reservation res;
	
	static
	{
		
		String[] food = {"breakFast", "lunch", "food"};
		String[] seat = {"M1", "M2", "L1","L2","U1","U2"};
		res = new Reservation("Rock", "finch", "male",food, "Bangolore", "Hyderabad",seat, "21/10/2020");
	}
	
	@Test
	public void testreservationRequest() {
		
		Reservation res1 = IRCTCService.reservationRequest(res);
		assertNotNull(res1);
	
	}
	
	@Test
	public void testreservationRequestFail() {
		Reservation res = new Reservation();
		Reservation res1 = IRCTCService.reservationRequest(res);
		assertNull(res1.getFirstName());
	
	}
	
	@Test
	public void testvalidateFromToCity() {
		
		boolean rb = IRCTCService.validateFromToCity(res);
		assertEquals(false, rb);
	
	}
	
}
