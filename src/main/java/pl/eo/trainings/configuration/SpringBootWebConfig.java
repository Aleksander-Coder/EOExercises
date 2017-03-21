package pl.eo.trainings.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "pl.eo.trainings")
public class SpringBootWebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("/").setCachePeriod(1);
	}

	@Bean
	public ServletContextTemplateResolver templateResolver() {
		ServletContextTemplateResolver servletResolver = new ServletContextTemplateResolver();
		servletResolver.setPrefix("/");
		servletResolver.setSuffix(".html");
		servletResolver.setTemplateMode("HTML5");
		servletResolver.setOrder(1);
		servletResolver.setCacheable(false);
		return servletResolver;
	}

}
