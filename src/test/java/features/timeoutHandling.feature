Feature: Handling timeouts for pages and iframes

  Scenario: Timeout handling for pages
    Given I am on "https://www.londonstockexchange.com/"
    When I click on discover menu
    And I click on United Kingdom submenu
    Then United Kingdom page should open
    And providing info about finance
    
   Scenario: Timeout handling for iFrames
    Given I am on "https://www.dyn-web.com/tutorials/iframes/basics/demo.php"
    When I click on the iframe
    Then I should be able to get the iframe text
    