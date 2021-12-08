Feature: TestFile2

@pick2
Scenario: STest File_2 SC1 
	Given User is on Home Page 
	When User Navigate to LogIn Page 
	And User enters UserName and Password 
	Then Message displayed Login Successfully 
	
	
@pick1 @pick2
Scenario: Test File_2 SC3
	When User LogOut from the Application 
	Then Message displayed LogOut Successfully 
	
	
@pick3
Scenario: Test File_2 SC4 
	Given user dash dashg 
	Then user dash dash 
