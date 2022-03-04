package com.lt.crs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CrsLtEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsLtEurekaServerApplication.class, args);
	}

}
