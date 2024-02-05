package com.midas.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StripePaymentController {

  String stripeKey;

  @RequestMapping("/")
  public String index() {
    return "hello" + stripeKey;
  }
}
