Feature: Opportunity functionality Module

Background:

When enter the username "Vishal@Testleaf.com"
When enter the password "trustmavish@2024"
When click on Login button
And click on toggle button
Then click on ViewAll button
When type Sales on SearchBar 
Then click on Sales
And click opportunity tab



Scenario: Cretae Opportunity
Given click on New button
When enter opportunity name as "Salesforce Automation by Vishal"
Then select close date as today
When sleect stage as Need Analysis
Then click save
And verify create opportunity name
Then close

Scenario: Edit Opportunity
When search the opportunity by your name
When click on dropdown icon and select Edit
Then choose close date as tomorrow
And select stage as Perception analysis
Then select Deliver status as In Progress
And enter description as "Salesforce"
Then click on save
And verify stage as perception analysis and get the message the opportinity is edited succesfully
Then close

Scenario: Delete Opportunity
When search the opportunity by your name
When click on dropdown icon and select Delete
Then verify Whether Oppurtunity is Deleted using Oppurtunity Name and get the message Oppurtunity is Successfully deleted
Then close





