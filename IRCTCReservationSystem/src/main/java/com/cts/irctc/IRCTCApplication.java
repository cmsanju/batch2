package com.cts.irctc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.irctc.skeleton.SkeletonValidator;

@SpringBootApplication
public class IRCTCApplication {

	public static void main(String[] args) {
		SpringApplication.run(IRCTCApplication.class, args);
		new SkeletonValidator();
	}
}
