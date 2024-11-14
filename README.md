# [OrangeHRM](https://opensource-demo.orangehrmlive.com/) CUCUMBER SELENIUM JUNIT 5

Este repositorio contiene un proyecto de automatización de pruebas utilizando Selenium, Cucumber y JUnit 5. El objetivo es demostrar cómo integrar estas herramientas para realizar pruebas automatizadas de aplicaciones web.

## Requisitos

- Java 11 o superior
- Maven 3.6.3 o superior

## Estructura del Proyecto
`src/test/java/steps`: Contiene las definiciones de los pasos (step definitions) de Cucumber.

`src/test/resources/features`: Contiene los archivos de características (feature files) de Cucumber.

`src/test/java/runners`: Contiene las clases de ejecución (test runners) para ejecutar las pruebas de Cucumber con JUnit 5.

## Ejecución de Pruebas
Para ejecutar las pruebas, utiliza el siguiente comando de Maven:

`mvn clean verify`

## Dependencias
El archivo pom.xml incluye las siguientes dependencias:

- Selenium 4
- JUnit 5
- Cucumber 7
