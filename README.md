# TestNG Verify Tool 
Tool to support verify statements in TestNG tests.

This tool is an Implementation of verify statements for TestNG framework. When using TestNG assert statements, test method exits when assertion fails. Sometimes you want your test method execution to continue even after certain assertion failures. In such situation verify statements come in handy. These statements are created as a wrapper around TestNG assertions where each assertion error will be stored in a buffer and later updated in TestNG result object after each test method execution.


##### Example:
```
@Test
public void verifyToolTest{(){

Verify.verifyEquals("test1", "test1", "test1 doesn't match"); // pass
Verify.verifyEquals("test!", "test2", "test2 doesn't match"); // fail (continue)
Verify.verifyNotEquals("test!", "test3", "test3 matches"); // pass
Verify.verifyNotEquals("test4", "test4", "test4 matches"); // fail (continue)
Verify.verifyTrue(true, "test5 condition is false"); // pass
Verify.verifyTrue(false, "test6 condition is false"); // fail (continue)
Assert.assertEquals("test$", "test7", "test7 doesn't match"); // fail (exit)		
Assert.assertEquals("test8", "test8", "test8 doesn't match"); // not run!
Verify.verifyEquals("test9", "test9", "test9 doesn't match"); // not run!

}
```
More examples included in `org.muthu.VerifyTests`


##### Including verify tool in your project:
######As JAR,
-	Download veriy-tool
-	Create JAR
-	Add it to classpath
-	Add ‘org.muthu.TestMethodListener’  to your TestNG listeners list
-	Done! 

Now you can use verify statements in your test

