package com.example.icici.sharepoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SharepointApplication {

	@Autowired
	private final Tata tata = null;

	public void m2()
	{
		tata.m1();
	}
	public static void main(String[] args) {
		SpringApplication.run(SharepointApplication.class, args);
		System.out.print("Hii");
	}

}
