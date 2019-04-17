package com.gonuclei.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callme")
public class CallmeController {

  private static final Logger LOGGER = LoggerFactory.getLogger(CallmeController.class);

  @GetMapping("/ping")
  public String ping() {
    LOGGER.info("Ping: name={}, version={}", "callme", "v1");
    return "callme" + ":" + "v1";
  }

}
