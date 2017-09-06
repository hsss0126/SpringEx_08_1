package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("shs")
public class ApplicationConfig_shs {

	@Bean
	public Profiles profile() {
		Profiles profile = new Profiles();
		profile.setName("성현석");
		profile.setAge(24);
		return profile;
	}
}
