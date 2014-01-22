In this project I test how to use @Profiles (new feature of Spring 3.1).

There is simulated typical project:

- there is one interface (RiskCalculator) which simulate external system and has two implementation (one used in production and another stub implementation in test).
- default profile "production" is set in web.xml
- in tests profiles "test" is used
- @ComponentScan is used
- In testImpmlementation of calculator is defined in Configuration bean.

