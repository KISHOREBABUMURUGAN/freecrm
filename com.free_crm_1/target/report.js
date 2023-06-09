$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/CRM_features/logincrm.feature");
formatter.feature({
  "name": "Free CRM",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "User has already logged in with valid credentials",
  "description": "and is navigated to Cogmento CRM home page. ",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Login functionality for Free CRM.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@successful_login"
    }
  ]
});
formatter.step({
  "name": "User is on Free crm login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User takes input from excel file",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enter email and Password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});