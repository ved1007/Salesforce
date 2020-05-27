$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/src/main/java/Features/newaccount.feature");
formatter.feature({
  "line": 1,
  "name": "Create New Account",
  "description": "",
  "id": "create-new-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Within the Salesforce application User is able to create New Account",
  "description": "",
  "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User will Open Salesforce Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify title for the Salesforce page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click  the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify title for the Salesforce Home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user will click on the waffle icon",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user will navigate to the Search field and search for the Account",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user weill verify title for the Account page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user will click on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user will select the Household radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user will click the Next button within the New Account window",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user will verify that the required fields message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user will populate fields within the Account Information section",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user will populate fields within the Address Inforamtion section",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user will populate fields within the Cloud MDM Information",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user will create new account by clicking the Save button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "use will close the application",
  "keyword": "And "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 25,
      "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;;1"
    },
    {
      "cells": [
        "vedant.jagani@campingworld.com.test",
        "Welcome2019*"
      ],
      "line": 26,
      "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Within the Salesforce application User is able to create New Account",
  "description": "",
  "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User will Open Salesforce Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify title for the Salesforce page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will enter \"vedant.jagani@campingworld.com.test\" and \"Welcome2019*\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click  the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify title for the Salesforce Home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user will click on the waffle icon",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user will navigate to the Search field and search for the Account",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user weill verify title for the Account page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user will click on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user will select the Household radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user will click the Next button within the New Account window",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user will verify that the required fields message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user will populate fields within the Account Information section",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user will populate fields within the Address Inforamtion section",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user will populate fields within the Cloud MDM Information",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user will create new account by clicking the Save button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "use will close the application",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.user_will_Open_Salesforce_Website()"
});
formatter.result({
  "duration": 3898952558,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.verify_title_for_the_Salesforce_page()"
});
formatter.result({
  "duration": 5357393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vedant.jagani@campingworld.com.test",
      "offset": 17
    },
    {
      "val": "Welcome2019*",
      "offset": 59
    }
  ],
  "location": "NewAccount.user_will_enter_and(String,String)"
});
formatter.result({
  "duration": 205131057,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_click_the_login_button()"
});
formatter.result({
  "duration": 1997570928,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.verify_title_for_the_Salesforce_Home_page()"
});
formatter.result({
  "duration": 25195233573,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_click_on_the_waffle_icon()"
});
formatter.result({
  "duration": 3297600944,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_navigate_to_the_Search_field_and_search_for_the_Account()"
});
formatter.result({
  "duration": 7420582260,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_weill_verify_title_for_the_Account_page()"
});
formatter.result({
  "duration": 5075501,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_click_on_the_New_button()"
});
formatter.result({
  "duration": 2610885980,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_select_the_Household_radio_button()"
});
formatter.result({
  "duration": 26183,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_click_the_Next_button_within_the_New_Account_window()"
});
formatter.result({
  "duration": 1680790861,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_verify_that_the_required_fields_message_is_displayed()"
});
formatter.result({
  "duration": 11605169,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@title\u003d\u0027Save\u0027]\"}\n  (Session info: chrome\u003d83.0.4103.61)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HQ-991-0L7LVCF\u0027, ip: \u00272601:246:4500:eb00:186d:6569:7786:da0c%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/s3/88ktkygs3s3...}, goog:chromeOptions: {debuggerAddress: localhost:53054}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 344251987fc83d561bd3aeee4128b815\n*** Element info: {Using\u003dxpath, value\u003d//button[@title\u003d\u0027Save\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat stepDefinitions.NewAccount.user_will_verify_that_the_required_fields_message_is_displayed(NewAccount.java:132)\n\tat ✽.Then user will verify that the required fields message is displayed(/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/src/main/java/Features/newaccount.feature:16)\n",
  "status": "failed"
});
formatter.match({
  "location": "NewAccount.user_will_populate_fields_within_the_Account_Information_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAccount.user_will_populate_fields_within_the_Address_Inforamtion_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAccount.user_will_populate_fields_within_the_Cloud_MDM_Information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAccount.user_will_create_new_account_by_clicking_the_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewAccount.use_will_close_the_application()"
});
formatter.result({
  "status": "skipped"
});
});