# Architecture overview
- `core/`: browser lifecycle, properties, explicit waits
- `pages/`: Page Object Model
- `tests/`: TestNG UI checks
- `api/`: REST Assured checks
- `bdd/`: Cucumber runner, hooks, step definitions
- `src/test/resources/features/`: Gherkin features
- `roadmap/STAGE_1...STAGE_5`: manual artifacts and learning tasks

Commands:
- `mvn clean test`
- `mvn -Dtest=OrangeHRMLoginTest test`
- `mvn -Dtest=JsonPlaceholderApiTests test`
- `mvn -Dtest=RunCucumberTest test`
