package com.midas.app;

import com.midas.app.module.CustomerData;
import com.midas.app.provider.ProviderType;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StripePaymentControllerApi {

  @RequestMapping("/createCustomer")
  public CustomerData createCustomer(@RequestBody CustomerData data) throws StripeException {
    Stripe.apiKey =
        "sk_test_51OgAp8SDQJKHuMU4U25R3VSIFkEqafZVJbnGGoktEPIGvNTlPfKlyzc3AHHb09tFIN61EirGCEml27LrNiL7PVYr00WpHh09to";

    // Create a new customer using the Stripe SDK
    Map<String, Object> param = new HashMap<>();
    param.put("name", data.getName());
    param.put("email", data.getEmail());
    Customer customer = Customer.create(param);

    // Update CustomerData with Stripe information
    data.setCustomerId(customer.getId());
    data.setProviderType(ProviderType.STRIPE);
    data.setProviderId(customer.getId());

    return data;
  }
}
