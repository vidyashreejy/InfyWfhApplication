package com.Infosys.WFH;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EntityScan(basePackages = "com.Infosys.WFH.models")
@EnableJpaRepositories(basePackages = "com.Infosys.WFH.repository")
public class WfhApplication {

	public static void main(String[] args) {
		SpringApplication.run(WfhApplication.class, args);
	}

}
