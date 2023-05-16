Feature: Electronics Page
  As a user I want to check Electronics page functionality

  @sanity @regression
  Scenario: Verify user should navigate to cell phones page successfully
    Given   I am on home page
    When    I mouse hover on 'Electronics' top menu tab
    And     I mouse hover and click on 'Cell Phones' option in electronics tab
    Then    I verify the text on cell phones page as "Cell phones"

  @smoke @regression
  Scenario: Verify that the product added successfully and placed the order successfully
    Given I am on home page
    When  I mouse hover on 'Electronics' top menu tab
    And   I mouse hover and click on 'Cell Phones' option in electronics tab
    Then  I verify the text on cell phones page as "Cell phones"
    When  I click on 'List View' tab
    And   I click on the product name 'Nokia Lumia' link
    Then  I verify the product name as "Nokia Lumia 1020"
    And   I verify the price of the product as "$349.00"
    When  I change the quantity to "2" on product page
    And   I click on 'Add To Cart' to add Nokia Lumia CellPhone
    Then  I verify the message "The product has been added to your shopping cart" on top green Bar
    When  I mouse hover on 'Shopping Cart' link
    And   I mouse hover and click on 'Go to Cart' button button
    Then  I verify the message "Shopping cart"
    And   I verify the total price "$698.00"
    When  I click on checkbox 'I agree with the terms of service'
    And   I click on 'Checkout' button
    Then  I verify the text as "Welcome, Please Sign In!"
    When  I click on 'Register' tab
    Then  I verify the text on Register page as "Register"
    And   I enter first name on register page as "Karnaa"
    And   I enter last name on register page as "Koraiya"
    And   I enter email on register page as "karunaaiiaii222adiya@gmail.com"
    And   I enter password on register page as "9081811670@Dv"
    And   I enter confirm password on register page as "9081811670@Dv"
    And   I click on 'Register' button
    Then  I verify the message on register page as "Your registration completed"
    When  I click on 'Continue' on register page
    Then  I verify the message "Shopping cart"
    When  I click on checkbox 'I agree with the terms of service'
    And   I click on 'Checkout' button
    And   I enter first name as "Karunaa"
    And   I enter last name as "Koradiya"
    And   I enter email as "karuna28koradiya@gmail.com"
    And   I select country from country field as "India"
    And   I enter city as "Ahmedabad"
    And   I enter address as "16, Happy residency"
    And   I enter postal code as "390002"
    And   I enter number as "07436252668"
    And   I click on 'Continue' button to shipping method
    And   I click on Second Day Air Shipping method
    And   I click on 'Continue' for payment method
    And   I click on 'Credit card' radio button
    And   I click on 'Continue' button to payment information
    And   I select credit card type "Visa"
    And   I enter card holder name as "Miss Karunaa Koradiya"
    And   I enter card number as "5425233430109903"
    And   I select expiry month as "04"
    And   I select expiry year as "2026"
    And   I enter card code as "676"
    And   I click on 'Continue' to confirm order
    Then  I verify payment method is "Credit Card"
    And   I verify shipping method is "2nd Day Air"
    And   I verify total price is "$698.00"
    And   I click on 'Confirm' button
    Then  I verify text "Thank you"
    And   I verify the message on confirm order page as "Your order has been successfully processed!"
    When  I click on 'Continue' to storage page
    Then  I verify the text pn login page "Welcome to our store"
    And   I click on 'Logout' link
    Then  I verify the URL "https://demo.nopcommerce.com/"
