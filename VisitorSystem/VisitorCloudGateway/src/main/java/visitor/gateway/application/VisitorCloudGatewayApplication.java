package visitor.gateway.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VisitorCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisitorCloudGatewayApplication.class, args);
		
		System.out.println("inside the main application file of visitor cloud gatewway");
	}

}
