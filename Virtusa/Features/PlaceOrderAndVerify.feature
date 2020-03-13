Feature: Testing Dummy Website for Virtusa

Scenario: Ordering a SThirt and Verifying the order in Order Details

Given Open the Chrome Browser and launch the Dummy Testing Website URL		
When I Click on Sign In Link in HomePage
And Enter the Username in Email Address Text Box and Password in Password Text Box
And Click on Sign In Button
Then Verify user has successfully logged in
When I Click on T-shirts 
And Add a T-shirt to cart from the results
And Click on Proceed to Checkout from the Popup
And Verify Product Details and click on Proceed to Checkout in Product Summary Page
And Click on Proceed to Checkout in Address Page
And Check the terms and conditions check box and clcik on Proceed to Checkout in Shipping Page
And Choose the payment payment method and click on confirm payment
Then TShirt Order should be successfully completed
And Verify in Order history



 











