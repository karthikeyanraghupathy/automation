$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Primary.feature");
formatter.feature({
  "line": 1,
  "name": "IRCTC login test",
  "description": "",
  "id": "irctc-login-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verification of train Search",
  "description": "",
  "id": "irctc-login-test;verification-of-train-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open Google chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Verify Title \u0026 Search for cucumber",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Verify the Junit package is present",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.Open_Google_chrome()"
});
formatter.result({
  "duration": 54168144200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.Verify_Title_Search_for_cucumber()"
});
formatter.result({
  "duration": 8229506000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.Verify_the_Junit_package()"
});
formatter.result({
  "duration": 15745348000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.SwitchTo_Junit_window()"
});
formatter.result({
  "duration": 170232800,
  "error_message": "java.lang.AssertionError: Text not found!\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat stepDefination.LoginPage.SwitchTo_Junit_window(LoginPage.java:85)\r\n\tat ✽.And Click on search button(Primary.feature:11)\r\n",
  "status": "failed"
});
});