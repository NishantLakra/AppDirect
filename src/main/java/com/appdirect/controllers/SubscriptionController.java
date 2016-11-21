package com.appdirect.controllers;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.appdirect.dto.SubscriptionEventOrderDTO;
import com.appdirect.models.Creator;
import com.appdirect.service.RestClient;
import com.appdirect.service.SubscriptionService;
import com.appdirect.service.UserService;

/**
 * @author Nishant.Lakra
 *
 */
@Controller
@RequestMapping("/api/subscription")
public class SubscriptionController {

  private final static Logger LOG = getLogger(SubscriptionController.class);


  @Autowired
  RestClient restClient;
  
  @Autowired
  RestTemplate restTemplate;
  
  @Autowired
  UserService userService;

  @Autowired
  SubscriptionService SubscriptionService;

  @RequestMapping(value = "/create/{eventUrl}", produces = "application/json",
      consumes = "application/json", method = RequestMethod.GET)
  @ResponseBody
  public void create(@PathVariable("eventUrl") String eventUrl) {

    try {
      
     SubscriptionEventOrderDTO orderDTO = restTemplate.getForObject(eventUrl, SubscriptionEventOrderDTO.class);
     Creator creator = userService.addUser(orderDTO.getCreator());
     

    } catch (Exception e) {
    }


  }

  @RequestMapping(value = "/change/{eventUrl}", produces = "application/json",
      consumes = "application/json", method = RequestMethod.GET)
  @ResponseBody
  public void change(@PathVariable("eventUrl") String eventUrl) {

  }

  @RequestMapping(value = "/cancel/{eventUrl}", produces = "application/json",
      consumes = "application/json", method = RequestMethod.GET)
  @ResponseBody
  public void cancel(@PathVariable("eventUrl") String eventUrl) {

  }

  @RequestMapping(value = "/status/{eventUrl}", produces = "application/json",
      consumes = "application/json", method = RequestMethod.GET)
  @ResponseBody
  public void status(@PathVariable("eventUrl") String eventUrl) {

  }


}
