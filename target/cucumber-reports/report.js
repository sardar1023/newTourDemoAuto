$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("newTour.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "This is multiple login",
  "description": "",
  "id": "login-page;this-is-multiple-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@smoke1"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user open the page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user insert username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user insert password as \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user click login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "login-page;this-is-multiple-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 34,
      "id": "login-page;this-is-multiple-login;;1"
    },
    {
      "cells": [
        "abc",
        "123"
      ],
      "line": 35,
      "id": "login-page;this-is-multiple-login;;2"
    },
    {
      "cells": [
        "bcd",
        "234"
      ],
      "line": 36,
      "id": "login-page;this-is-multiple-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "This is multiple login",
  "description": "",
  "id": "login-page;this-is-multiple-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@smoke1"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user open the page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user insert username as \"abc\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user insert password as \"123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTourSteps.user_open_the_page()"
});
formatter.result({
  "duration": 5809708887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 25
    }
  ],
  "location": "NewTourSteps.user_insert_username_as(String)"
});
formatter.result({
  "duration": 2003755,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 25
    }
  ],
  "location": "NewTourSteps.user_insert_password_as(String)"
});
formatter.result({
  "duration": 73087,
  "status": "passed"
});
formatter.match({
  "location": "NewTourSteps.user_click_login_button()"
});
formatter.result({
  "duration": 1151975232,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "This is multiple login",
  "description": "",
  "id": "login-page;this-is-multiple-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@smoke1"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user open the page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user insert username as \"bcd\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user insert password as \"234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTourSteps.user_open_the_page()"
});
formatter.result({
  "duration": 3684550467,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bcd",
      "offset": 25
    }
  ],
  "location": "NewTourSteps.user_insert_username_as(String)"
});
formatter.result({
  "duration": 104691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "234",
      "offset": 25
    }
  ],
  "location": "NewTourSteps.user_insert_password_as(String)"
});
formatter.result({
  "duration": 80988,
  "status": "passed"
});
formatter.match({
  "location": "NewTourSteps.user_click_login_button()"
});
formatter.result({
  "duration": 1053285968,
  "status": "passed"
});
});