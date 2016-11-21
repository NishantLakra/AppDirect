package com.appdirect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Nishant.Lakra
 *
 */
@Controller
@RequestMapping("/api/user")
public class UserController {

  @RequestMapping(value = "/assignment/{eventUrl}", method = RequestMethod.POST)
  @ResponseBody
  public void assignment(){
    
  }
  
  @RequestMapping(value = "/unassignment/{eventUrl}", method = RequestMethod.PUT)
  @ResponseBody
  public void unassignment(){
    
  }
  
  
}
