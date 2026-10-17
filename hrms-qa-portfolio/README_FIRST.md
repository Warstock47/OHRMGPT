# HRMS QA Portfolio — 5-Stage Real-Time Practice Roadmap

A ready-to-import learning project for practicing Manual QA, Selenium + TestNG, Page Object Model, Cucumber BDD, REST Assured API testing, Git, and Jenkins.

**Honesty note:** this is a practice/portfolio framework, not evidence of employment experience. The OrangeHRM public demo and selectors may change. Never use real credentials or personal data.

## Stack
- Java 21, Maven
- Selenium 4.27, TestNG 7.10
- Cucumber 7.20
- REST Assured 5.5
- JSONPlaceholder public test API
- Jenkinsfile starter

## Import into Eclipse
1. Extract the ZIP to a normal folder.
2. Install JDK 21 and Maven.
3. Eclipse → Window → Preferences → Java → Installed JREs → select JDK 21.
4. File → Import → Maven → Existing Maven Projects.
5. Browse to the extracted root folder and select `pom.xml`.
6. Finish, then right-click project → Maven → Update Project.
7. Run a test class with Run As → TestNG Test, or run `mvn clean test` from the project root.

## Five stages
1. Manual QA: requirements, test cases, RTM, bug template, summary report.
2. Selenium + TestNG: locators, explicit waits, assertions, Page Object Model.
3. Framework + BDD: config, driver factory, reusable waits, Cucumber.
4. API testing: GET/POST/negative tests with REST Assured.
5. Portfolio + CI: Git workflow, Jenkins pipeline, reports, interview readiness.

See `roadmap/` for stage-by-stage instructions. This package is a practice starter; verify live demo behavior and update selectors if the site changes.
