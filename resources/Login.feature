Feature: Login Action 

@pick1
Scenario: Successful Login with Valid Credentials 
	Given User is on Home Page 
	When User Navigate to LogIn Page 
	And User enters UserName and Password 
	Then Message displayed Login Successfully 
	
	
	
@sprint1 @userstory2 @pick2
Scenario: Successful LogOut 
	When User LogOut from the Application 
	Then Message displayed LogOut Successfully 
	
	
@pick3	
Scenario: Validate Transaction 
	Given user dash dashg 
	Then user dash dash 
