# Radiologics Software Engineer Skills Challenge

#### Simple Spring Boot RESTful Web Service (bonus points for OAuth2+OIDC Google login)

Build a Spring Boot (v2.5.0) Java 8 Gradle project and push it to GitHub or BitBucket. The application should implement
a secure RESTful web service that stores and displays information about subjects in a clinical trial.

1. Subject model should contain id, name, age, sex, occupation
2. RESTful APIs:
   a. retrieve all subjects b. get subject by id c. add new subject
3. Prepopulate the database with 10 subjects (H2 database recommended for ease of development)
4. Build an extremely simple html frontend (we will not be judging your design skills):
   a. Table/list showing existing subjects (paginated for extra credit!)
   b. Form to create and save a new subject using RESTful API and ajax c. Automatic update of subjects table upon
   successful save
5. Bonus: secure the html frontend with Oauth2

## Sources

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Spring Boot - Building RESTful Web Services](https://www.tutorialspoint.com/spring_boot/spring_boot_building_restful_web_services.htm)
* [Introduction to RESTful Web Services](https://www.javatpoint.com/restful-web-services-spring-boot)
* [A Quick Guide to OAuth 2.0 with Spring Security](https://developer.okta.com/blog/2019/03/12/oauth2-spring-security-guide)
* [Consuming RESTful Web Services](https://www.tutorialspoint.com/spring_boot/spring_boot_consuming_restful_web_services.htm)
* [Spring Boot H2 Database](https://www.javatpoint.com/spring-boot-h2-database)
* [Get an access token for Postman with Okta](https://developer.okta.com/docs/guides/implement-oauth-for-okta/request-access-token/)
* [How to Initialize a Database with Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.data-initialization)
* [Spring Boot - Loading Initial Data - Stack Overflow](https://stackoverflow.com/questions/38040572/spring-boot-loading-initial-data)
* [403 forbidden when I try to post to my spring api?](https://stackoverflow.com/questions/52449496/403-forbidden-when-i-try-to-post-to-my-spring-api?rq=1)
