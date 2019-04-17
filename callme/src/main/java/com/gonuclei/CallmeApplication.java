package com.gonuclei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Starter file to configure spring container.
 */
@SpringBootApplication
public class CallmeApplication extends SpringBootServletInitializer {

  /**
   * Main method to start spring container.
   * @param args array of environment parameters.
   */
  public static void main(final String[] args) {
    SpringApplication.run(CallmeApplication.class, args);
  }

  /**
   * Configures the application to be deployed to native tomcat server.
   *
   * @param builder {@link SpringApplicationBuilder}
   * @return {@link SpringApplicationBuilder}
   */
  @Override
  protected SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
    return builder.sources(CallmeApplication.class);
  }
}
