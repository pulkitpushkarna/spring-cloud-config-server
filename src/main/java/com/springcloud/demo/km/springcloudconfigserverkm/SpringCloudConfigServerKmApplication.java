package com.springcloud.demo.km.springcloudconfigserverkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerKmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerKmApplication.class, args);
	}
}
