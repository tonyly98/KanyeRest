package KanyeRest.demo;

import javax.security.auth.login.LoginException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import KanyeRest.demo.jda.KanyeRest;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws LoginException {
		KanyeRest kanyeRest = new KanyeRest();
		kanyeRest.setActivity("Kim Kardashian");
		kanyeRest.online();
		SpringApplication.run(DemoApplication.class, args);
	}

}
