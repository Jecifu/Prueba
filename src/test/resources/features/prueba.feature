#language: en

Feature: Add article

  Scenario Outline: Sign up
    Given that user has opened the website
    When he enter the information
      |name       | email       |password       |
      |<user_name>| <user_email>|<user_password>|
    And he login with information
      | email       |password       |
      | <user_email>|<user_password>|
    Then he should add the product
      | title          |what           |write          |tags          |
      | <title_article>|<what_article> |<write_article>|<tags_article>|

    Examples:
      | user_name       |user_email      |user_password|title_article|what_article|write_article|tags_article|
      | Alexa Cifuentes |alexa@gmail.com |jc123        |Celular      |tecnologia  |xxx          |yyy         |
