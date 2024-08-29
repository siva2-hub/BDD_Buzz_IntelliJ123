$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/featurefiles/Login.feature");
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
  "name": "I should see the quotes list view",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on profile and see the logout",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "user-login;successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "user-login;successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "defaultuser@enterpi.com",
        "Enter@4321"
      ],
      "line": 13,
      "id": "user-login;successful-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
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
  "name": "I enter valid credentials and click sign in \"defaultuser@enterpi.com\", \"Enter@4321\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see the quotes list view",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on profile and see the logout",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "AllPages.i_open_the_browser_with_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AllPages.i_am_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "defaultuser@enterpi.com",
      "offset": 45
    },
    {
      "val": "Enter@4321",
      "offset": 72
    }
  ],
  "location": "AllPages.i_enter_valid_credentials_and_click_sign_in(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AllPages.i_should_see_the_quotes_list_view()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AllPages.i_click_on_profile_and_see_the_logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AllPages.i_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});