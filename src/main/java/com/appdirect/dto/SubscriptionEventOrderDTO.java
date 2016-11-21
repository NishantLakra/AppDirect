package com.appdirect.dto;

import com.appdirect.models.Creator;
import com.appdirect.models.Payload;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionEventOrderDTO {

  private SubsctiptionType type;
  private Creator creator;
  private Payload payload;


  public static enum SubsctiptionType {
    SUBSCRIPTION_ORDER, SUBSCRIPTION_CHANGE, SUBSCRIPTION_CANCEL
  }

  public SubsctiptionType getType() {
    return type;
  }

  public void setType(SubsctiptionType type) {
    this.type = type;
  }

  public Creator getCreator() {
    return creator;
  }

  public void setCreator(Creator creator) {
    this.creator = creator;
  }

  public Payload getPayload() {
    return payload;
  }

  public void setPayload(Payload payload) {
    this.payload = payload;
  }

}
