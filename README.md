# demoqa-test

The project implements UI autotests for the website [demoqa.com](https://demoqa.com). The **Page Object** pattern, **Allure** steps and description are implemented, and a screenshot is uploaded to the report when a failure occurs. The tests are run in 5 threads in **Selenoid** deployed in **Docker**

## Stack
- Java 17
- Selenide
- TestNG
- Allure
- Lombok
- Selenoid
- Docker
- GitHub Actions

## Deployment

You will need an installed **[Docker](https://www.docker.com/products/docker-desktop/)** to run the tests.

You will also need to deploy **[Selenoid](https://aerokube.com/selenoid/latest/)** containers.

Now you can run the tests locally using the `mvn clean test allure:serve` command.

As a result, you will receive an **Allure** report in your browser and can view how the tests are going in **Selenoid** at http://localhost:4444/status