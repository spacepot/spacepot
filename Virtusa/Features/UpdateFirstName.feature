Feature: Updating First Name
Scenario: Update Personal Information(First Name) in My Account

Given Open the Chrome Browser and launch the Dummy Testing Website URL		
When I Click on Sign In Link in HomePage
And Enter the Username in Email Address Text Box and Password in Password Text Box
And Click on Sign In Button
Then Verify user has successfully logged in
When I Click on My Personal Info under My Account in footer 
And I change my first name and click on Save
Then My First Name Should be Updated
