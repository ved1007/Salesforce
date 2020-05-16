$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Salesforce Login Feature",
  "description": "",
  "id": "salesforce-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Salesforce Login Test Scenario",
  "description": "",
  "id": "salesforce-login-feature;salesforce-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open Salesforce Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter ID and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user will create new up",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user will populate the SalesPerson field",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user will populate the email firstname lastname zipcode address fields",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click on the save button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user will refresh the page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user will close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefinitions.open_Salesforce_Website()"
});
formatter.result({
  "duration": 4901286564,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinitions.verify_title()"
});
formatter.result({
  "duration": 8886728,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinitions.user_enter_ID_and_Password()"
});
formatter.result({
  "duration": 262328650,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinitions.user_click_on_the_login_button()"
});
formatter.result({
  "duration": 3258580125,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinitions.user_will_create_new_up()"
});
formatter.result({
  "duration": 9314461819,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027slds-m-horizontal_xxx-small slds-size--1-of-6 slds-truncate\u0027]//button [@type\u003d\u0027button\u0027]\"}\n  (Session info: chrome\u003d81.0.4044.138)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HQ-991-2YEJG5H\u0027, ip: \u00272601:246:4500:eb00:9d77:54bd:f3e:9978%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.4\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.69 (6813546031a4b..., userDataDir: /var/folders/s3/88ktkygs3s3...}, goog:chromeOptions: {debuggerAddress: localhost:63158}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: affe58656b85b1b5000faf64419efe4a\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027slds-m-horizontal_xxx-small slds-size--1-of-6 slds-truncate\u0027]//button [@type\u003d\u0027button\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat stepDefinitions.LoginstepDefinitions.user_will_create_new_up(LoginstepDefinitions.java:58)\n\tat ✽.Then user will create new up(login.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginstepDefinitions.user_will_populate_the_SalesPerson_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginstepDefinitions.user_will_populate_the_email_firstname_lastname_zipcode_address_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginstepDefinitions.user_click_on_the_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginstepDefinitions.user_will_refresh_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginstepDefinitions.user_will_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});