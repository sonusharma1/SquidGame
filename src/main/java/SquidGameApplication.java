package com.squidgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SquidGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquidGameApplication.class, args);
		System.out.println("SquidGame is Running...");
	}

}
