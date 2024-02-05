package com.midas.app.module;

import com.midas.app.provider.ProviderType;

public class CustomerData {
  private String name;

  public CustomerData(
      String alice, String mail, String customerId2, ProviderType providerType, String stripeId2) {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public ProviderType getProviderType() {
    return providerType;
  }

  public void setProviderType(ProviderType providerType) {
    this.providerType = providerType;
  }

  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  private String email;
  private String customerId;
  private ProviderType providerType; // New field
  private String providerId; // New field
}
