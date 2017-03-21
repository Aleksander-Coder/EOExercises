package pl.eo.trainings.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "pl.eo.trainings")
@PropertySource(value = { "classpath:application.properties" })
public class SpringBootWebMain extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(SpringBootWebMain.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMain.class, args);
	}

}
