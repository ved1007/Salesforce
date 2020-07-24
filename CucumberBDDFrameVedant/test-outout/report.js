$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/vedant.jagani/git/Salesforce/CucumberBDDFrameVedant/src/main/java/Features/Opportunities2.feature");
formatter.feature({
  "line": 1,
  "name": "created New Opportunitie",
  "description": "",
  "id": "created-new-opportunitie",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User is able to create Opportunitie",
  "description": "",
  "id": "created-new-opportunitie;user-is-able-to-create-opportunitie",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open the Salesforce Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the Salesforce page title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Login with valid username and password \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify Salesforce Home page title",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on the Opportunities tab",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select a record type and click Next",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Populate System Admin Layout fields",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Opportunity Information",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Interested In Attributes",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Interested In Details",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Towing Information",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Currently Own Trade-InCurrently Own TradeIn from Web Lead fields",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Pupulate Info from lead fields",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Lead Source",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Enter the Description Information",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Other data fields",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "System Information fields",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click the Save button",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28,
      "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;;1"
    },
    {
      "cells": [
        "vedant.jagani@campingworld.com.test",
        "Welcome2019*"
      ],
      "line": 29,
      "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "User is able to create Opportunitie",
  "description": "",
  "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open the Salesforce Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the Salesforce page title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Login with valid username and password \"vedant.jagani@campingworld.com.test\" and \"Welcome2019*\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify Salesforce Home page title",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on the Opportunities tab",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select a record type and click Next",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Populate System Admin Layout fields",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Opportunity Information",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Interested In Attributes",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Interested In Details",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Towing Information",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Currently Own Trade-InCurrently Own TradeIn from Web Lead fields",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Pupulate Info from lead fields",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Lead Source",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Enter the Description Information",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Other data fields",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "System Information fields",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click the Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "OpportunitiesStepDef.open_the_Salesforce_Website()"
});
formatter.result({
  "duration": 6877428404,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.verify_the_Salesforce_page_title()"
});
formatter.result({
  "duration": 6135132,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vedant.jagani@campingworld.com.test",
      "offset": 40
    },
    {
      "val": "Welcome2019*",
      "offset": 82
    }
  ],
  "location": "OpportunitiesStepDef.login_with_valid_username_and_password_and(String,String)"
});
formatter.result({
  "duration": 281733532,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.click_login_button()"
});
formatter.result({
  "duration": 1854989541,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.verify_Salesforce_Home_page_title()"
});
formatter.result({
  "duration": 8530068765,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.click_on_the_Opportunities_tab()"
});
formatter.result({
  "duration": 3794203646,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.click_on_the_New_button()"
});
formatter.result({
  "duration": 30065110050,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.xpath: //*[@id\u003d\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li/a (tried for 10 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat stepDefinitions2.OpportunitiesStepDef.click_on_the_New_button(OpportunitiesStepDef.java:193)\n\tat ✽.Then Click on the New button(/Users/vedant.jagani/git/Salesforce/CucumberBDDFrameVedant/src/main/java/Features/Opportunities2.feature:11)\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li/a\"}\n  (Session info: chrome\u003d84.0.4147.89)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u0027unknown\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027HQ-991-0L7LVCF\u0027, ip: \u00272601:246:4500:eb00:44fb:30ba:6d46:8ead%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/s3/88ktkygs3s3...}, goog:chromeOptions: {debuggerAddress: localhost:64748}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 147d6c588277a47ee5b1bfbdb2aa9b2c\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li/a}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:641)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:638)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat stepDefinitions2.OpportunitiesStepDef.click_on_the_New_button(OpportunitiesStepDef.java:193)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.match({
  "location": "OpportunitiesStepDef.select_a_record_type_and_click_Next()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.populate_System_Admin_Layout_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.Opportunity_Information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.populate_Interested_In_Attributes_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.Interested_In_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.Towing_Information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.currently_Own_Trade_InCurrently_Own_TradeIn_from_Web_Lead_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.pupulate_Info_from_lead_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.Lead_Source()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.enter_the_Description_Information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.populate_Other_data_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.System_Information_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.click_the_Save_button()"
});
formatter.result({
  "status": "skipped"
});
});