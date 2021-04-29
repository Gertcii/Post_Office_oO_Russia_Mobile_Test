How to launch ios tests

1. Stable requirements: Java 8, Maven 3.6.3, TestNG 7.1.0, Appium >= 1.20.2 (prefer the latest version), access to EPAM mobile cloud;

2. Run tests by Maven command: mvn clean test

Before run test add:

1. appropriate mobile cloud token to pom.xml
2. appropriate device udid
3. full phone number, password and short phone number (only last 7 numbers like xxx-xx-xx)
   into DataForTest class
4. check that Russian Post (Почта России) app is installed on device

NOTE!
There is no way write a test for test case:
"должен быть тест следующего содержания: переход из приложения на страницу браузера,
работа со страницей браузера и переход обратно в приложение (клик по рекламе)".
The field in the application for switching to the browser
is not displayed every time the application is launched,
even with long waiting times