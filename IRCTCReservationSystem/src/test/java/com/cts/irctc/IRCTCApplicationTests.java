package com.cts.irctc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.irctc.controller.ReservationController;

@SpringBootTest
class IRCTCApplicationTests {
	
	@Autowired
	private ReservationController rcontroller;

	@Test
	void contextLoads() {
		
		assertThat(rcontroller).isNotNull();
	}

}
