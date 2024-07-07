Feature: Test Amazon Application

  Background: 
    Given Open Amazon application

  @Homepage
  Scenario: Test Title of Homepage
    When User get the title of Homepage
    Then Home page title matched
    And Quit the browswer

  #@Bestseller
  @ignore
  Scenario: Test title of Bestseller page
    When User opens Bestseller page
    And Get the title of Bestseller page
    Then Bestseller page title matched
    And Quit the browswer

  #Mobilepage
 	@ignore
  Scenario: Test title of Mobile page
    When User opens Mobile page
    And Get the title of Mobile page
    Then Mobile page title matched
    And Quit the browswer

  #@Fashionpage
  @ignore
  Scenario: Test title of Fashion page
    When User opens Fashion page
    And Get the title of Fashion page
    Then Fashion page title matched
    And Quit the browswer
