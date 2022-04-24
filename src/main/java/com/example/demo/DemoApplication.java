package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Livre;
import com.example.demo.repositories.LivreRepo;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	LivreRepo livreRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	    Date date1=new SimpleDateFormat("yyyy/MM/dd").parse("1989/12/02");  
	    Date date2=new SimpleDateFormat("yyyy/MM/dd").parse("2022/01/16");  

		livreRepo.save(new Livre(null,"Giving Reasons","Hackett Publishing Company","David R. Morrow",93,"9781624666230",true,date1,date2));
		livreRepo.save(new Livre(null,"The Basic Political Writings","Hackett Publishing Company","Sharon Bailin",148,"9781624664793",true,date1,date2));
		
	}


}
