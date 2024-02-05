// package com.midas.app;
//
// import static org.mockito.Mockito.when;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
// import com.midas.app.cont.AccountController;
// import com.midas.app.module.CustomerData;
// import com.midas.app.provider.ProviderType;
// import com.stripe.service.AccountService;
// import java.util.List;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.mockito.stubbing.OngoingStubbing;
// import org.springframework.http.MediaType;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.ResultActions;
// import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
// public class AccountControllerTest {
//
//  private MockMvc mockMvc;
//
//  @Mock private AccountService accountService;
//
//  @InjectMocks private AccountController accountController;
//
//  @BeforeEach
//  public void setUp() {
//    MockitoAnnotations.openMocks(this);
//    mockMvc = MockMvcBuilders.standaloneSetup(accountController).build();
//  }
//
//  @Test
//  public void testGetAccounts() throws Exception {
//    // Set up mock data
//    List<CustomerData> mockAccounts =
//        List.of(
//            new CustomerData(
//                "John", "john@example.com", "customerId1", ProviderType.STRIPE, "stripeId1"),
//            new CustomerData(
//                "Alice", "alice@example.com", "customerId2", ProviderType.STRIPE, "stripeId2"));
//
//    // Mocking the service response
//    OngoingStubbing<T> tOngoingStubbing;
//    tOngoingStubbing = when(accountService.getAllAccounts()).thenReturn(mockAccounts);
//
//    // Perform GET request to /accounts endpoint
//    ResultActions resultActions =
//        mockMvc.perform(get("/accounts").contentType(MediaType.APPLICATION_JSON));
//
//    // Verify the HTTP response status is OK
//    resultActions.andExpect(status().isOk());
//
//    // Verify the response JSON structure and values
//    resultActions.andExpect(jsonPath("$[0].name").value("John"));
//    resultActions.andExpect(jsonPath("$[0].email").value("john@example.com"));
//    resultActions.andExpect(jsonPath("$[1].name").value("Alice"));
//    resultActions.andExpect(jsonPath("$[1].email").value("alice@example.com"));
//  }
// }
