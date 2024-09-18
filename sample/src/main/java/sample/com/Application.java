package sample.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Backend API'S",description = "This is Crud Operation For Demo Project "))
public class Application {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
	}
	

	
	
}
