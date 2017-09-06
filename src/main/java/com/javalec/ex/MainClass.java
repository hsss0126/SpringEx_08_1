package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String profile = null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = sc.nextInt();
			if(num==0) {
				profile = "shs";
			} else if(num==1) {
				profile = "nhs";
			} else {
				System.out.println("종료");
				break;
			}

//			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//			ctx.getEnvironment().setActiveProfiles(profile);
//			ctx.load("classpath:applicationCTX_shs.xml", "classpath:applicationCTX_nhs.xml");
//			ctx.refresh();

			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
			ctx.getEnvironment().setActiveProfiles(profile);
			ctx.register(ApplicationConfig_shs.class, ApplicationConfig_nhs.class);
			ctx.refresh();

			Profiles myProfile = ctx.getBean("profile", Profiles.class);
			System.out.println("이름: "+myProfile.getName());
			System.out.println("나이: "+myProfile.getAge());

			ctx.close();
		}
		sc.close();



	}

}
