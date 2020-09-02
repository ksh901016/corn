package com.project.cornservice;

import com.project.cornservice.licenses.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class CornServiceApplication implements ApplicationRunner {
	@Autowired
	ServiceConfig serviceConfig;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("########################");
		System.out.println(serviceConfig.getDecryptedUserName());
		System.out.println("########################");
	}

	public static void main(String[] args) {
		SpringApplication.run(CornServiceApplication.class, args);
	}
}
