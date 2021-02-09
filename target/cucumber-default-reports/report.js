$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ReviewAPI.feature");
formatter.feature({
  "name": "Syntax HRMS API Workflow",
  "description": "  Description: This feature file tests Syntax HRMS API Workflow",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@APIReview"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a JWT is generated",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.GenerateTokenSteps.a_JWT_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating an employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@APIReview"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to create an employee",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.ReviewAPI.a_request_is_prepared_to_create_an_employee()"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Header value cannot be null\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:72)\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:59)\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:59)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:263)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:277)\n\tat io.restassured.internal.common.assertion.AssertParameter.notNull(AssertParameter.groovy:26)\n\tat io.restassured.internal.common.assertion.AssertParameter$notNull.callStatic(Unknown Source)\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallStatic(CallSiteArray.java:55)\n\tat io.restassured.internal.common.assertion.AssertParameter$notNull.callStatic(Unknown Source)\n\tat io.restassured.internal.RequestSpecificationImpl.header(RequestSpecificationImpl.groovy:843)\n\tat com.hrms.ReviewAPI.ReviewAPI.a_request_is_prepared_to_create_an_employee(ReviewAPI.java:47)\n\tat ✽.a request is prepared to create an employee(file:///Users/gozde.ercevik/eclipse-workspace-newoxygen/CucumberFramewok/src/test/resources/features/ReviewAPI.feature:11)\n",
  "status": "failed"
});
formatter.step({
  "name": "a POST call is made to create an Employee",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.ReviewAPI.a_POST_call_is_made_to_create_an_Employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the status code should be 201",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.ReviewAPI.the_status_code_should_be(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the employee created contains key \"Message\" and the value \"Entry Created\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.ReviewAPI.the_employee_created_contains_key_and_the_value(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the employee_id \"Employee[0].employee_id\" is being stored as a global variable",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.ReviewAPI.the_employee_id_is_being_stored_as_a_global_variable(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a JWT is generated",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.GenerateTokenSteps.a_JWT_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "get the created Employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@APIReview"
    }
  ]
});
formatter.step({
  "name": "a request is ready to get the created employee",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.ReviewAPI.a_request_is_ready_to_get_the_created_employee()"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Header value cannot be null\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:72)\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:59)\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:277)\n\tat io.restassured.internal.common.assertion.AssertParameter.notNull(AssertParameter.groovy:26)\n\tat io.restassured.internal.common.assertion.AssertParameter$notNull.callStatic(Unknown Source)\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallStatic(CallSiteArray.java:55)\n\tat io.restassured.internal.common.assertion.AssertParameter$notNull.callStatic(Unknown Source)\n\tat io.restassured.internal.RequestSpecificationImpl.header(RequestSpecificationImpl.groovy:843)\n\tat com.hrms.ReviewAPI.ReviewAPI.a_request_is_ready_to_get_the_created_employee(ReviewAPI.java:91)\n\tat ✽.a request is ready to get the created employee(file:///Users/gozde.ercevik/eclipse-workspace-newoxygen/CucumberFramewok/src/test/resources/features/ReviewAPI.feature:19)\n",
  "status": "failed"
});
formatter.step({
  "name": "a GET call is made to retrieve the created employee",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.ReviewAPI.a_GET_call_is_made_to_retrieve_the_created_employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.ReviewAPI.status_code_should_be(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the retrived EmployeeID \"Employee[0].employee_id\" matches the globally stored EmployeeID",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.ReviewAPI.ReviewAPI.the_retrived_EmployeeID_matches_the_globally_stored_EmployeeID(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});