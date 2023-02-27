package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(CustomerRepository repository) {

    return args -> {
      log.info("Preloading database...");
      repository.save(new Customer("Taylor", "Duvall", "12", "123 Sesame Street", "", "New York", "New York", "12345"));
      repository.save(new Customer("Megan", "Holiday", "6", "17 Main Street", "Apt C", "Portland", "Oregon", "52342"));
      repository.save(new Customer("Arnold", "Schwarz", "2", "The Moon", "", "Outer Space", "Oklahoma", "77840"));
      repository.save(new Customer("Ronald", "McDonald", "Unknown", "12 Russellville Road", "", "Bowling Green", "KY", "42101"));
    };
  }
}