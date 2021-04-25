package com.kmend.techtest;

import com.kmend.techtest.domain.User;
import com.kmend.techtest.repository.UserRepository;
import com.kmend.techtest.utility.Region;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class TechTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechTestApplication.class, args);

	}

	/**
	 * Application runner that runs on startup to generate user records
	 * @param repository
	 * @return
	 */
	@Bean
	ApplicationRunner init(UserRepository repository) {
		return args -> {
			// generate 900 user records
			IntStream.range(0, 900).forEach(
					birthday -> {
						User user = new User();
						user.setBirthday(
								// generate a random number from 1 to 12
								new Random().nextInt(12) + 1);

						user.setSpend(
								// generate a random number from 0 to 5000
								new Random().nextInt(5001));

								// generate a region from the region enum and pass its label i.e value to the db
						user.setRegion(
								(Region.values()[new Random().nextInt(3)]).label);
						repository.save(user);
					});
			repository.findAll().forEach(System.out::println);
		};
	}


}
