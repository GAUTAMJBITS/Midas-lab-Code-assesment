// package com.midas.app;
//
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.midas.app.module.CustomerData;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.http.MediaType;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.ResultActions;
//
// @SpringBootTest
// @AutoConfigureMockMvc
// public class StripeIntegrationTest {
//
//  @Autowired private MockMvc mockMvc;
//  ObjectMapper objectMapper;
//
//  @Test
//  public void testStripeIntegration() throws Exception {
//
//    // Set test data
//    CustomerData testData = new CustomerData().getCustomerId();
//    testData.setName("John Doe");
//    testData.setEmail("john.doe@example.com");
//
//    // Call the Stripe integration method
//    ResultActions resultActions =
//        mockMvc
//            .perform(
//                post("/api/createCustomer")
//                    .content("{ \"name\": \"John Doe\", \"email\": \"john.doe@example.com\" }")
//                    .contentType(MediaType.APPLICATION_JSON))
//            .andExpect(status().isOk());
//
//    // Verify the results
//    String responseBody = resultActions.andReturn().getResponse().getContentAsString();
//    CustomerData responseCustomerData = objectMapper.readValue(responseBody, CustomerData.class);
//
//    // Assert against the expected result
//    assertEquals(
//        "ExpectedResult",
//        responseCustomerData
//            .getCustomerId()); // Change 'getSomeProperty' to the actual property you want to
// assert
//  }
// }
