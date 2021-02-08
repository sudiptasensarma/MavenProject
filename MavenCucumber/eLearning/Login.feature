@tag
Feature: Signup Feature
  
 	Background: 
		Given Open Application 
				
  @Signup
  Scenario Outline: Ensure Signup Working fine with only mandatory fields
     
    When click signup url 
    And Select follow courses in Activity
    And Enter First Nane "<firstName>"
    And Enter lastNAme "<lastName>"
    And Enter Email id "<email>"
    And Enter Username "<UNAME>"
    And Enter Password and confirm password "<Password>"
    And Click on RegisterButton 
    Then Registration Successful "<USERNAME>"
    
       
 	Examples:
  |firstName	|lastName|email|UNAME|Password|USERNAME|
  |Munu|Sen|munusen@gmail.com|msen|muse@123|Munu Sen|
  
  @Login
  Scenario Outline: Validate the Email
     
    When Enter UserName "<UNAME>"
    And Enter Password "<Password>"
    
    And Click on loginButton
    And Ensure Successful Login "<USERNAME>"
    
    Then Ensure Email has been validated "<email>"
    
       
  Examples:
  |email|UNAME|Password|USERNAME|
  |munusen@gmail.com|msen|muse@123|Munu Sen|
  
 	
 	@Email
 	Scenario Outline: Validate sending Email
 	
 	When Enter UserName "<UNAME>"
  And Enter Password "<Password>"
  And Click on loginButton
  And Click HomePage
  And Click Compose
  And Enter Email detail
  And Click Send Message
  Then Validate Mail sent 
 	
 	Examples:
  |UNAME|Password|
  |msen|muse@123|
   
    
  