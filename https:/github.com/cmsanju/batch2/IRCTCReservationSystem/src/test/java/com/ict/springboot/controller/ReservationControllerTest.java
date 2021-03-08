package com.ict.springboot.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.support.BindingAwareModelMap;

import com.cts.irctc.IRCTCApplication;
import com.cts.irctc.controller.ReservationController;
import com.cts.irctc.exception.ReservationException;
import com.cts.irctc.model.Reservation;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = IRCTCApplication.class, loader = AnnotationConfigContextLoader.class)
public class ReservationControllerTest {

	@Autowired
	private ReservationController resController;
	
	@InjectMocks
	static Reservation res;
	
	
	
	@Before
	public void setUp()
	{
		String[] food = {"breakFast", "lunch", "food"};
		String[] seat = {"M1", "M2", "L1","L2","U1","U2"};
		res = new Reservation("Rock", "finch", "male",food, "Bangolore", "Hyderabad",seat, "21/10/2020");
		
	
	}
	@After
	public void setDown()
	{
		resController = null;
		res = null;
	}
	
	@Test
	public void showHomePageView()
	{
		String viewName = resController.showHomepage();
		
		assertEquals("index", viewName);
	}

	@Test
	public void testbookingForm() {		
		
			Model model = new BindingAwareModelMap();
			String viewName = null;
			viewName = resController.bookingForm(model,res);
			assertEquals("reservation-page", viewName);	
	}
	
	@Test
	public void testsubmitForm()
	{
		Model model = new BindingAwareModelMap();
		BindingResult br = mock(BindingResult.class);
		String viewName;
		viewName = resController.submitForm(res, br, model);
		assertEquals("confirmation-form", viewName);	
	}
	
}
