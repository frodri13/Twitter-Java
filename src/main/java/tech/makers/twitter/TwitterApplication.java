package tech.makers.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TwitterApplication {

	// This is our main method.
	// Run it to start the server.
	public static void main(String[] args) {
		SpringApplication.run(TwitterApplication.class, args);
	}

}
