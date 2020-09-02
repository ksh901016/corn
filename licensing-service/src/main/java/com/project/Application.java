package com.project;

import com.project.licenses.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class Application implements ApplicationRunner {
	@Autowired
	ServiceConfig serviceConfig;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("########################");
		System.out.println(serviceConfig.getExampleProperty());
		System.out.println("########################");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
