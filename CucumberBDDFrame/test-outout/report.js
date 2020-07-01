$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/src/main/java/Features/CreateNewLead.feature");
formatter.feature({
  "line": 1,
  "name": "Delete created Account",
  "description": "",
  "id": "delete-created-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "Within the Salesforce application User is able to delete Account",
  "id": "delete-created-account;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Salesforce site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Salesforce page title",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "login as Dealer Sales or DealerSalesManagerOrSystemAdmin enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Salesforce Home page title",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click Leads tab",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on the new button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Choose Location and Save",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 14,
      "value": "#\tAnd click the Next button"
    },
    {
      "line": 15,
      "value": "#\tThen Fill in the information \"\u003cfirstname\u003e\" \"\u003clastname\u003e\" \"\u003cemail\u003e\" \"\u003cphone\u003e\" \"\u003caddress\u003e\""
    },
    {
      "line": 16,
      "value": "#\tThen Click Search"
    },
    {
      "line": 17,
      "value": "#\tThen Click Save"
    },
    {
      "line": 18,
      "value": "#\tThen New Lead is created"
    },
    {
      "line": 19,
      "value": "#\tAnd Click on Detail tab to verify Lead Detail"
    }
  ],
  "line": 24,
  "name": "",
  "description": "",
  "id": "delete-created-account;;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "email",
        "phone",
        "address"
      ],
      "line": 25,
      "id": "delete-created-account;;;1"
    },
    {
      "cells": [
        "vedant.jagani@campingworld.com.train",
        "Welcome2019*",
        "ABC",
        "XYZ",
        "aC ST",
        "1231231234",
        "123 St"
      ],
      "line": 26,
      "id": "delete-created-account;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "Within the Salesforce application User is able to delete Account",
  "id": "delete-created-account;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Salesforce site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Salesforce page title",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "login as Dealer Sales or DealerSalesManagerOrSystemAdmin enter \"vedant.jagani@campingworld.com.train\" and \"Welcome2019*\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Salesforce Home page title",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click Leads tab",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on the new button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Choose Location and Save",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewLead.salesforce_site()"
});
formatter.result({
  "duration": 3995029847,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewLead.salesforce_page_title()"
});
formatter.result({
  "duration": 6073980,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vedant.jagani@campingworld.com.train",
      "offset": 64
    },
    {
      "val": "Welcome2019*",
      "offset": 107
    }
  ],
  "location": "CreateNewLead.login_as_Dealer_Sales_or_DealerSalesManagerOrSystemAdmin_enter_and(String,String)"
});
formatter.result({
  "duration": 242160471,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewLead.click_login_button()"
});
formatter.result({
  "duration": 1967053676,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewLead.salesforce_Home_page_title()"
});
formatter.result({
  "duration": 8032285896,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewLead.click_Leads_tab()"
});
formatter.result({
  "duration": 304545681,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewLead.click_on_the_new_button()"
});
formatter.result({
  "duration": 3675697838,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewLead.choose_Location_and_Save()"
});
formatter.result({
  "duration": 30057105614,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//select[@class\u003d\u0027slds-select\u0027]\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u0027unknown\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027HQ-991-0L7LVCF\u0027, ip: \u00272601:246:4500:eb00:a4e0:d8c2:4017:d864%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/s3/88ktkygs3s3...}, goog:chromeOptions: {debuggerAddress: localhost:52475}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: dfc929c2158c18ea56913cd3b7c7507f\n*** Element info: {Using\u003dxpath, value\u003d//select[@class\u003d\u0027slds-select\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat stepDefinitions.CreateNewLead.choose_Location_and_Save(CreateNewLead.java:93)\n\tat ✽.Then Choose Location and Save(/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/src/main/java/Features/CreateNewLead.feature:13)\n",
  "status": "failed"
});
});