$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DeleteEmployee.feature");
formatter.feature({
  "name": "Delete Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@deleteEmployee"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Delete Employee by id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@deleteById"
    }
  ]
});
formatter.step({
  "name": "enter \"\u003cID\u003e\" number",
  "keyword": "And "
});
formatter.step({
  "name": "click on search button",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the \"\u003cFirst Name\u003e\" , \"\u003cMiddle Name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on the check button",
  "keyword": "Then "
});
formatter.step({
  "name": "click delete button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ID",
        "First Name",
        "Middle Name"
      ]
    },
    {
      "cells": [
        "7947",
        "Hunter",
        "ABC"
      ]
    },
    {
      "cells": [
        "7952",
        "Hunter",
        "ABC"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Employee by id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@deleteEmployee"
    },
    {
      "name": "@deleteById"
    }
  ]
});
formatter.step({
  "name": "enter \"7947\" number",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the \"Hunter\" , \"ABC\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_the(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the check button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.DeleteEmployeeStepDefinitions.click_on_the_check_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click delete button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.DeleteEmployeeStepDefinitions.click_delete_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Delete Employee by id");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to employee list page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.navigate_to_employee_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete Employee by id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@deleteEmployee"
    },
    {
      "name": "@deleteById"
    }
  ]
});
formatter.step({
  "name": "enter \"7952\" number",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.enter_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the \"Hunter\" , \"ABC\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.SearchEmployeeStepDefinitions.verify_the(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the check button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.DeleteEmployeeStepDefinitions.click_on_the_check_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click delete button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.DeleteEmployeeStepDefinitions.click_delete_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: [[ChromeDriver: chrome on MAC (9077c624da7fe686b4dcc6f582f5f5c1)] -\u003e id: btnDelete] (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Gozdes-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1881:7e06:57c3:8772%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: /var/folders/tp/0xl_cb892nj...}, goog:chromeOptions: {debuggerAddress: localhost:50380}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 9077c624da7fe686b4dcc6f582f5f5c1\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat com.hrms.utils.CommonMethods.waitForClickability(CommonMethods.java:96)\n\tat com.hrms.utils.CommonMethods.click(CommonMethods.java:101)\n\tat com.hrms.stepDefinitions.DeleteEmployeeStepDefinitions.click_delete_button(DeleteEmployeeStepDefinitions.java:16)\n\tat ✽.click delete button(file:///Users/gozde.ercevik/eclipse-workspace-newoxygen/CucumberFramewok/src/test/resources/features/DeleteEmployee.feature:14)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "Delete Employee by id");
formatter.after({
  "status": "passed"
});
});