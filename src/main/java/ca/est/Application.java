package ca.est;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.slf4j.Logger;
/**
 * @author Estevam
 */
@SpringBootApplication
@EnableConfigurationProperties(User.class)
public class Application implements CommandLineRunner {

	private final User configuration;

	public Application(User configuration) {
		this.configuration = configuration;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {

		Logger logger = LoggerFactory.getLogger(Application.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties from vault");
		logger.info("   example.username is {}", configuration.getUsername());
		logger.info("   example.password is {}", configuration.getPassword());
		logger.info("----------------------------------------");
	}

}
