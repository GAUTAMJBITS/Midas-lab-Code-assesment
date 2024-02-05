// package com.midas.app.api;
//
// import com.stripe.Stripe;
// import com.stripe.exception.StripeException;
// import com.stripe.model.Customer;
// import com.stripe.param.CustomerCreateParams;
//
// public class server {
//
//    Stripe.apiKey =
// "sk_test_51OgAp8SDQJKHuMU4U25R3VSIFkEqafZVJbnGGoktEPIGvNTlPfKlyzc3AHHb09tFIN61EirGCEml27LrNiL7PVYr00WpHh09to";
//
//    CustomerCreateParams params =
//            CustomerCreateParams.builder()
//                    .setEmail("jenny.rosen@example.com")
//                    .setPaymentMethod("pm_card_visa")
//                    .setInvoiceSettings(
//                            CustomerCreateParams.InvoiceSettings.builder()
//                                    .setDefaultPaymentMethod("pm_card_visa")
//                                    .build()
//                    )
//                    .build();
//
//    Customer customer = Customer.create(params);
//
//    public server() throws StripeException {
//    }
// }
