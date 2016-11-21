package com.appdirect.service.impl;

import static org.slf4j.LoggerFactory.getLogger;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;

import com.appdirect.controllers.SubscriptionController;
import com.appdirect.models.Creator;
import com.appdirect.service.UserService;

public class UserServiceImpl implements UserService {

  private final static Logger LOG = getLogger(SubscriptionController.class);

  @Override
  public Creator addUser(Creator creator) {
    LOG.info("Added a new user and return accountIdentifier key");
    creator.setAccountIdentifier(RandomStringUtils.randomAlphanumeric(7).toUpperCase());
    return creator;
  }
}
