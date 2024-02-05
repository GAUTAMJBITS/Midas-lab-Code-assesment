// package com.midas.app.cont;
//
// import com.midas.app.module.CustomerData;
// import com.stripe.service.financialconnections.AccountService;
// import java.util.List;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
//
// @RestController
// @RequestMapping("/accounts")
// public class AccountController {
//  private final AccountService accountService;
//
//  List<CustomerData> getAllAccounts() {
//    return List.of(new CustomerData());
//  }
//
//  public AccountController(AccountService accountService) {
//    this.accountService = accountService;
//  }
//
//  @GetMapping
//  public ResponseEntity<List<CustomerData>> getAccounts() {
//    List<CustomerData> accounts = accountService.getAllAccounts();
//    return new ResponseEntity<>(accounts, HttpStatus.OK);
//  }
// }
