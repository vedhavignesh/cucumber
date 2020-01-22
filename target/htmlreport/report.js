$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Cucumberfeaturefile/orderdeclined.feature");
formatter.feature({
  "name": "Invalid order declined",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ordering product without adding to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User login to the application",
  "keyword": "* "
});
formatter.match({
  "location": "Orderingproduct.user_login_to_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User ordering product without adding to cart",
  "keyword": "* "
});
formatter.match({
  "location": "Orderingproduct.user_ordering_product_without_adding_to_cart()"
});
formatter.result({
  "status": "passed"
});
});