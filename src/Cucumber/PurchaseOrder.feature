
@tag
Feature: Purchase the order for E-commerce website
  I want to use this template for my feature file

Background:
Given I landed on Ecommerce page

  @OrderDataTransfer
  Scenario Outline: Positive Test of submitting the order
  
    Given Logged in with username <name> and Password <password>
    When I add product <productName> from cart
    And CHeckout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on confirmationpage


    Examples: 
      | name  								| password 				| productName  |
      | rahulshetty@gmail.com |     IamKing@000 | ZARA COAT 3	 |
      
   @OrderDataDirectTransfer
   Scenario: Test data submit using scenario
   
   Given I Logged in with username "rahulshetty@gmail.com" and Password "IamKing@000"
   When Add product "ZARA COAT 3" from cart
   And Checkout "ZARA COAT 3" to submit the order
   Then "THANKYOU FOR THE ORDER." message displayed on confirmationpage
   
