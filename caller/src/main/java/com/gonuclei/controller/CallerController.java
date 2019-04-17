package com.gonuclei.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/caller")
public class CallerController {

  private static final Logger LOGGER = LoggerFactory.getLogger(CallerController.class);

  @Autowired
  RestTemplate restTemplate;

  @GetMapping("/ping")
  public String ping() {
    LOGGER.info("Ping: name={}, version={}", "caller", "v1");
    String response = restTemplate.getForObject("http://callme-service:8091/callme/ping",
        String.class);
    LOGGER.info("Calling: response={}", response);
    return "caller" + ":" + "v1" + ". Calling... " + response;
    // For caller-service-v2 ->
    // return "caller" + ":" + "v2" + ". Calling... " + response;
  }

}
