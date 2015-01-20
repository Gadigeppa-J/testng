# TestNG Verify Tool 
Tool to support verify statements in TestNG tests.

This tool is an Implementation of verify statements for TestNG framework. When using TestNG assert statements, test method exits when assertion fails. Sometimes you want to continue test method execution even if there are any assertion failures. In such situation verify statements come in handy. These statements are created as a wrapper around TestNg assertions where each assertion error will be stored in buffer and updated in TestNG result object after each test method execution.

