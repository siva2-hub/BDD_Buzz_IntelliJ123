$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/featurefiles/InValidLogin.feature");
formatter.feature({
  "line": 1,
  "name": "User Login",
  "description": "",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "user-login;successful-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid credentials and click sign in \"\u003cusername\u003e\", \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see the validations",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "user-login;successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "user-login;successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "defaultu123ser@enterpi.com",
        "Enter@4321"
      ],
      "line": 10,
      "id": "user-login;successful-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "defaultuser@enterpi.com",
        "Enter1"
      ],
      "line": 11,
      "id": "user-login;successful-login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "user-login;successful-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid credentials and click sign in \"defaultu123ser@enterpi.com\", \"Enter@4321\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see the validations",
  "keyword": "Then "
});
formatter.match({
  "location": "AllPages.i_open_the_browser_with_url()"
});
formatter.result({
  "duration": 6250609188,
  "status": "passed"
});
formatter.match({
  "location": "AllPages.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 716982124,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "defaultu123ser@enterpi.com",
      "offset": 45
    },
    {
      "val": "Enter@4321",
      "offset": 75
    }
  ],
  "location": "AllPages.i_enter_valid_credentials_and_click_sign_in(String,String)"
});
formatter.result({
  "duration": 836823687,
  "status": "passed"
});
formatter.match({
  "location": "AllPages.i_should_see_the_validations()"
});
formatter.result({
  "duration": 60607,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "user-login;successful-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open the browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid credentials and click sign in \"defaultuser@enterpi.com\", \"Enter1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see the validations",
  "keyword": "Then "
});
formatter.match({
  "location": "AllPages.i_open_the_browser_with_url()"
});
formatter.result({
  "duration": 4197448662,
  "status": "passed"
});
formatter.match({
  "location": "AllPages.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 204709185,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "defaultuser@enterpi.com",
      "offset": 45
    },
    {
      "val": "Enter1",
      "offset": 72
    }
  ],
  "location": "AllPages.i_enter_valid_credentials_and_click_sign_in(String,String)"
});
formatter.result({
  "duration": 1032491386,
  "status": "passed"
});
formatter.match({
  "location": "AllPages.i_should_see_the_validations()"
});
formatter.result({
  "duration": 34250,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Close the browser",
  "description": "",
  "id": "user-login;close-the-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "AllPages.i_close_the_browser()"
});
formatter.result({
  "duration": 864697,
  "error_message": "java.lang.NullPointerException\n\tat stepdefinitions.AllPages.i_close_the_browser(AllPages.java:44)\n\tat ✽.And I close the browser(src/test/featurefiles/InValidLogin.feature:14)\n",
  "status": "failed"
});
});