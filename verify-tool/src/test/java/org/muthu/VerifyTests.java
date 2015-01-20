package org.muthu;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author <a href='mailto:gadigeppa.code@gmail.com'>Gadigeppa Jattennavar</a>
 */

@Listeners(TestMethodListener.class)
public class VerifyTests {

	@Test
	public void verifyEqualsTest(){
		
		/* verifyEquals */
		Verify.verifyEquals("test1", "test1", "test1 doesn't match"); // pass
		Verify.verifyEquals("test!", "test2", "test2 doesn't match"); // fail (continue)
		Verify.verifyEquals("test3", "test3", "test3 doesn't match"); // pass
		Verify.verifyEquals("test#", "test4", "test4 doesn't match"); // fail (continue)
		Verify.verifyEquals("test5", "test5", "test5 doesn't match"); // pass
		Verify.verifyEquals("test6", "test6", "test6 doesn't match"); // pass
		Assert.assertEquals("test$", "test7", "test7 doesn't match"); // fail (exit)		
		Assert.assertEquals("test8", "test8", "test8 doesn't match"); // not run!
		Verify.verifyEquals("test9", "test9", "test9 doesn't match"); // not run!
		
		// Output
		
/*		FAILED: test01
		java.lang.Throwable: Multiple failures (3)
		(1)org.muthu.VerificationError:test2 doesn't matches expected [test2] but found [test!]
		(2)org.muthu.VerificationError:test4 doesn't matches expected [test4] but found [test#]
		(3)java.lang.AssertionError:test7 doesn't matches expected [test7] but found [test$]

		Failure 1 of 3
		org.muthu.VerificationError: test2 doesn't matches expected [test2] but found [test!]
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.failNotEquals(Assert.java:494)
			at org.testng.Assert.assertEquals(Assert.java:123)
			at org.testng.Assert.assertEquals(Assert.java:176)
			at org.muthu.Verify.verifyEquals(Verify.java:90)
			at org.muthu.TestVerify.test01(TestVerify.java:15)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)

		Failure 2 of 3
		org.muthu.VerificationError: test4 doesn't matches expected [test4] but found [test#]
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.failNotEquals(Assert.java:494)
			at org.testng.Assert.assertEquals(Assert.java:123)
			at org.testng.Assert.assertEquals(Assert.java:176)
			at org.muthu.Verify.verifyEquals(Verify.java:90)
			at org.muthu.TestVerify.test01(TestVerify.java:17)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)

		Failure 3 of 3
		java.lang.AssertionError: test7 doesn't matches expected [test7] but found [test$]
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.failNotEquals(Assert.java:494)
			at org.testng.Assert.assertEquals(Assert.java:123)
			at org.testng.Assert.assertEquals(Assert.java:176)
			at org.muthu.TestVerify.test01(TestVerify.java:20)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)


		===============================================
		    Default test
		    Tests run: 1, Failures: 1, Skips: 0
		===============================================*/
		
	}
	
	@Test
	public void verifyNotEqualsTest(){
		
		/* verifyNotEquals */
		Verify.verifyNotEquals("test!", "test1", "test1 matches"); // pass
		Verify.verifyNotEquals("test2", "test2", "test2 matches"); // fail (continue)
		Verify.verifyNotEquals("test!", "test3", "test3 matches"); // pass
		Verify.verifyNotEquals("test4", "test4", "test4 matches"); // fail (continue)
		Verify.verifyNotEquals("test!", "test5", "test5 matches"); // pass
		Verify.verifyNotEquals("test!", "test6", "test6 matches"); // pass
		Assert.assertNotEquals("test7", "test7", "test7 matches"); // fail (exit)		
		Assert.assertNotEquals("test!", "test8", "test8 matches"); // not run!
		Verify.verifyNotEquals("test!", "test9", "test9 matches"); // not run!
		
		// Output
		
/*		FAILED: verifyNotEqualsTest
		java.lang.Throwable: Multiple failures (3)
		(1)org.muthu.VerificationError:test2 matches
		(2)org.muthu.VerificationError:test4 matches
		(3)java.lang.AssertionError:test7 matches

		Failure 1 of 3
		org.muthu.VerificationError: test2 matches
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.assertNotEquals(Assert.java:854)
			at org.muthu.Verify.verifyNotEquals(Verify.java:434)
			at org.muthu.TestVerify.verifyNotEqualsTest(TestVerify.java:143)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)

		Failure 2 of 3
		org.muthu.VerificationError: test4 matches
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.assertNotEquals(Assert.java:854)
			at org.muthu.Verify.verifyNotEquals(Verify.java:434)
			at org.muthu.TestVerify.verifyNotEqualsTest(TestVerify.java:145)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)

		Failure 3 of 3
		java.lang.AssertionError: test7 matches
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.assertNotEquals(Assert.java:854)
			at org.muthu.TestVerify.verifyNotEqualsTest(TestVerify.java:148)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)


		===============================================
		    Default test
		    Tests run: 1, Failures: 1, Skips: 0
		===============================================
*/
	}

	@Test
	public void verifyTrueTest(){
		
		/* verifyTrue */
		Verify.verifyTrue(true, "test1 condition is false"); // pass
		Verify.verifyTrue(false, "test2 condition is false"); // fail (continue)
		Verify.verifyTrue(true, "test3 condition is false"); // pass
		Verify.verifyTrue(false, "test4 condition is false"); // fail (continue)
		Verify.verifyTrue(true, "test5 condition is false"); // pass
		Verify.verifyTrue(true, "test6 condition is false"); // pass
		Assert.assertTrue(false, "test7 condition is false"); // fail (exit)		
		Assert.assertTrue(true, "test8 condition is false"); // not run!
		Verify.verifyTrue(true, "test9 condition is false"); // not run!
		
		// Output
		
/*		Failure 1 of 3
		org.muthu.VerificationError: test2 condition is false expected [true] but found [false]
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.failNotEquals(Assert.java:494)
			at org.testng.Assert.assertTrue(Assert.java:42)
			at org.muthu.Verify.verifyTrue(Verify.java:18)
			at org.muthu.TestVerify.verifyTrueTest(TestVerify.java:265)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)

		Failure 2 of 3
		org.muthu.VerificationError: test4 condition is false expected [true] but found [false]
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.failNotEquals(Assert.java:494)
			at org.testng.Assert.assertTrue(Assert.java:42)
			at org.muthu.Verify.verifyTrue(Verify.java:18)
			at org.muthu.TestVerify.verifyTrueTest(TestVerify.java:267)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)

		Failure 3 of 3
		java.lang.AssertionError: test7 condition is false expected [true] but found [false]
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.failNotEquals(Assert.java:494)
			at org.testng.Assert.assertTrue(Assert.java:42)
			at org.muthu.TestVerify.verifyTrueTest(TestVerify.java:270)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)


		===============================================
		    Default test
		    Tests run: 1, Failures: 1, Skips: 0
		===============================================
*/
	}
	
	@Test
	public void exceptionTest(){
		
		String str = null;
		
		/* verifyEquals */
		Verify.verifyEquals("test1", "test1", "test1 doesn't match"); // pass
		Verify.verifyEquals("test!", "test2", "test2 doesn't match"); // fail (continue)
		Verify.verifyEquals("test3", "test3", "test3 doesn't match"); // pass
		
		/*
		 *  Test run will not continue if there is any exception/error (except Assertion error) during verification  
		 */
		Verify.verifyEquals("test#", str.substring(0), "test4 doesn't match"); // fail (exit) 
		
		
		Verify.verifyEquals("test5", "test5", "test5 doesn't match"); // not run!
		Verify.verifyEquals("test6", "test6", "test6 doesn't match"); // not run!
		Assert.assertEquals("test$", "test7", "test7 doesn't match"); // not run!		
		Assert.assertEquals("test8", "test8", "test8 doesn't match"); // not run!
		Verify.verifyEquals("test9", "test9", "test9 doesn't match"); // not run!

		// Output
		
/*		FAILED: exceptionTest
		java.lang.Throwable: Multiple failures (2)
		(1)org.muthu.VerificationError:test2 doesn't match expected [test2] but found [test!]
		(2)java.lang.NullPointerException:null

		Failure 1 of 2
		org.muthu.VerificationError: test2 doesn't match expected [test2] but found [test!]
			at org.testng.Assert.fail(Assert.java:94)
			at org.testng.Assert.failNotEquals(Assert.java:494)
			at org.testng.Assert.assertEquals(Assert.java:123)
			at org.testng.Assert.assertEquals(Assert.java:176)
			at org.muthu.Verify.verifyEquals(Verify.java:90)
			at org.muthu.TestVerify.exceptionTest(TestVerify.java:386)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)

		Failure 2 of 2
		java.lang.NullPointerException
			at org.muthu.TestVerify.exceptionTest(TestVerify.java:392)
			at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
			at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
			at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
			at java.lang.reflect.Method.invoke(Unknown Source)
			at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
			at org.testng.internal.Invoker.invokeMethod(Invoker.java:714)
			at org.testng.internal.Invoker.invokeTestMethod(Invoker.java:901)
			at org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1231)
			at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:127)
			at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:111)
			at org.testng.TestRunner.privateRun(TestRunner.java:767)
			at org.testng.TestRunner.run(TestRunner.java:617)
			at org.testng.SuiteRunner.runTest(SuiteRunner.java:334)
			at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:329)
			at org.testng.SuiteRunner.privateRun(SuiteRunner.java:291)
			at org.testng.SuiteRunner.run(SuiteRunner.java:240)
			at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
			at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)
			at org.testng.TestNG.runSuitesSequentially(TestNG.java:1224)
			at org.testng.TestNG.runSuitesLocally(TestNG.java:1149)
			at org.testng.TestNG.run(TestNG.java:1057)
			at org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)
			at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)
			at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)


		===============================================
		    Default test
		    Tests run: 1, Failures: 1, Skips: 0
		===============================================
*/
	}
	
}
