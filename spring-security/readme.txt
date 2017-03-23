Spring security configuration

It is the web project that contains example of spring security configuration.
Application has java and xml security configurations according
http://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#jc and
http://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#ns-getting-started
These configurations are similar but have different representations.

Software requirements: java 8, maven

Application startup sequence:

   execute in command line: mvn clean tomcat7:run-war -Dspring.profiles.active="<profile_name>"
   <profile_name> - application have different profiles for each type configuration:
        javaConfig - spring security configuration based on the java representation.
        xmlConfig  - spring security configuration based on the xml representation.

   home url of application: http://localhost:8080/security-configuration

Application security configuration:

url restrictions:
    /about.jsp - permit all
    /admin/admin.jsp - user with ADMIN authority
    /admin/aboutAbout.jsp - user with ADMIN authority
    /users/adminAuthority/{user_id} - user with ADMIN authority
    /users/userAuthority/{user_id} - user with USER authority
    /index.jsp - any authenticated user

authentication restrictions:
    security data based on the embedded H2 database with custom tables user and authority


Application data:
    users:
        username: user, password: 1234, authority: USER
        username: admin, password: 1234, authority: ADMIN
		

Created by Yevhenii Kozlovsky

