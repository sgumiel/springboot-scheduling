package com.kairosds.cursospb2.scheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Instant;

@EnableScheduling
@SpringBootApplication
public class SchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingApplication.class, args);
	}

	@Scheduled(cron = "* 22 9 * * *")
	void printTime() throws InterruptedException {
		System.out.println(Instant.now());
	}
}
