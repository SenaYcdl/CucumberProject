# 1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Products' button
#5. Verify user is navigated to ALL PRODUCTS page successfully
#6. The products list is visible
#7. Click on 'View Product' of first product
#8. User is landed to product detail page
#9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

  Feature: Automation Exercise

    Scenario: TC008 Verify All Products and product detail page

      Given automation "automationUrl" page
      And Verify that home page is visible successfully
      Then Click on Product button
      And Verify user is navigated to ALL PRODUCTS page successfully
      And The products list is visible
      And kullanici 1 saniye bekler
      Then Click on View Product of first product
      And kullanici 1 saniye bekler
      And User is landed to product detail page
      And kullanici 1 saniye bekler
      And Verify that detail detail is visible: product name, category, price, availability, condition, brand