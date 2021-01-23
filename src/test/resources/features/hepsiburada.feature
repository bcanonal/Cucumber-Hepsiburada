Feature: HB Acceptance Test

  Scenario: As a costumer, I should be able to add any selected product to basket
    Given User is on the HomePage
    When User search for "Iphone 12"
    And User should see the details of 4th product
    And User should click add
    Then User should see message "Ürün sepetinizde"