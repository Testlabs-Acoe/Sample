$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddCart.feature");
formatter.feature({
  "line": 2,
  "name": "Adding item to cart",
  "description": "",
  "id": "adding-item-to-cart",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Adding to cart",
  "description": "",
  "id": "adding-item-to-cart;adding-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Addcart"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click on searchbox",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter \"\u003csearchitem\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on searchbtn",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select item from list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "add it to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on Proceed to buy",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the page",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "adding-item-to-cart;adding-to-cart;",
  "rows": [
    {
      "cells": [
        "searchitem"
      ],
      "line": 15,
      "id": "adding-item-to-cart;adding-to-cart;;1"
    },
    {
      "cells": [
        "choclates"
      ],
      "line": 16,
      "id": "adding-item-to-cart;adding-to-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 28554285200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Adding to cart",
  "description": "",
  "id": "adding-item-to-cart;adding-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Addcart"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click on searchbox",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter \"choclates\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on searchbtn",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select item from list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "add it to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on Proceed to buy",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIn.i_click_on_searchbox()"
});
formatter.result({
  "duration": 623471500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "choclates",
      "offset": 9
    }
  ],
  "location": "SignIn.i_enter(String)"
});
formatter.result({
  "duration": 195420400,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.i_click_on_searchbtn()"
});
formatter.result({
  "duration": 5023925600,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.select_item_from_list()"
});
formatter.result({
  "duration": 740048000,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.add_it_to_cart()"
});
formatter.result({
  "duration": 5638141400,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.click_on_Proceed_to_buy()"
});
formatter.result({
  "duration": 9677314100,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.i_verify_the_page()"
});
formatter.result({
  "duration": 1417300,
  "error_message": "java.lang.NullPointerException\r\n\tat com.mindtree.StepDefinition.SignIn.i_verify_the_page(SignIn.java:49)\r\n\tat ✽.Then I verify the page(AddCart.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 369416600,
  "status": "passed"
});
});