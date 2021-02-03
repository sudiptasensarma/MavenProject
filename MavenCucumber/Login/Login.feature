@tag
Feature: Login Feature
  This feature includes validating login aplication with 
  1)valid case and with 
  2)invalid case
  
 	Background: 
		Given Login application 
			
  @Positivetesting
  Scenario: validate login with valid credential
     
    When enter valid username
    And enter valid password
    And click on login button
    Then login successful
    And user navigates to the homepage
    
  @NegetiveTesting
  Scenario: validate with invalid credential
  	
  	When enter invalid username an dpassword
  	Then login unsuccessful
  	