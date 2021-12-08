Feature: TestFile3

@pick3
Scenario: Test File pcik3 
	Given User is on Home Page 
	When User Navigate to LogIn Page 
	And User enters UserName and Password 
	Then Message displayed Login Successfully 
	
	
@sprint1 @pick2 
Scenario: Successful LogOut 
	When User LogOut from the Application 
	Then Message displayed LogOut Successfully 
	
	
@pick2	
Scenario: Validate Transaction 
	Given user dash dashg 
	Then user dash dash 
