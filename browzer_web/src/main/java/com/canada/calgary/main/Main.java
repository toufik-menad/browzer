/**
 * 
 */
package com.canada.calgary.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author MENAD
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.canada"})
@EnableJpaRepositories({"com.canada"})
@EntityScan({"com.canada"})
@PropertySource(value = "classpath:application.properties")
public class Main extends org.springframework.boot.context.web.SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Main.class);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}

}
