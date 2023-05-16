Feature: Computers Page
  As a user I want to check Computers Page functionality

  @sanity @regression
  Scenario: Verify product arrange in alphabetical order
    Given   I am on home page
    When    I click on the Computers top menu tab
    And     I click on Desktop link in Computers top menu dropdown
    And     I select "Name: Z to A" option from the Sort By dropdown
    Then    Products should be arranged in descending order by name


  @smoke @regression
  Scenario: Verify product added to shopping cart successfully
    Given   I am on home page
    When    I click on the Computers top menu tab
    And     I click on Desktop link in Computers top menu dropdown
    And     I select "Name: A to Z" option from the Sort By dropdown
    And     I add 'Build Your Own Computer' in the cart
    Then    I verify the text "Build your own computer"
    When    I select the "2.2 GHz Intel Pentium Dual-Core E2200" processor
    And     I select "8GB [+$60.00]" of RAM
    And     I click on desired  HDD
    And     I click on desired  OS
    And     I click on the software needed
    Then    I verify the price "$1,475.00" of Build Your Own Computer
    When    I click on 'Add To Cart' button after filters added
    Then    I verify the message "The product has been added to your shopping cart" on top green Bar
    When    I mouse hover on 'Shopping Cart' link
    And     I mouse hover and click on 'Go to Cart' button button
    Then    I verify the message "Shopping cart"
    When    I change the quantity to "2"
    And     I click on 'Update shopping cart' button
    Then    I verify the total price "$2,950.00"
    When    I click on checkbox 'I agree with the terms of service'
    And     I click on 'Checkout' button
    Then    I verify the text as "Welcome, Please Sign In!"
    When    I click on 'Checkout As Guest' button
    And     I enter first name as "Karunaa"
    And     I enter last name as "Koradiya"
    And     I enter email as "karuna28koradiya@gmail.com"
    And     I select country from country field as "India"
    And     I enter city as "Ahmedabad"
    And     I enter address as "16, Happy residency"
    And     I enter postal code as "390002"
    And     I enter number as "07436252668"
    And     I click on 'Continue' button to shipping method
    And     I click on Next Day Air Shipping Method
    And     I click on 'Continue' for payment method
    And     I click on 'Credit card' radio button
    And     I click on 'Continue' button to payment information
    And     I select credit card type "Master card"
    And     I enter card holder name as "Miss Karunaa Koradiya"
    And     I enter card number as "5425233430109903"
    And     I select expiry month as "04"
    And     I select expiry year as "2026"
    And     I enter card code as "676"
    And     I click on 'Continue' to confirm order
    Then    I verify payment method is "Credit Card"
    And     I verify shipping method is "Shipping Method: Next Day Air"
    And     I verify total price is "$2,950.00"
    When    I click on 'Confirm' button
    Then    I verify text "Thank you"
    And     I verify the message on confirm order page as "Your order has been successfully processed!"
    When    I click on 'Continue' to storage page
    Then    I verify the text pn login page "Welcome to our store"
