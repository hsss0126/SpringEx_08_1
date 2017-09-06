package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("nhs")
public class ApplicationConfig_nhs {

	@Bean
	public Profiles profile() {
		Profiles profile = new Profiles();
		profile.setName("노현숙");
		profile.setAge(25);
		return profile;
	}
}
