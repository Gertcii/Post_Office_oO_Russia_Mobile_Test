Before run test add:
1. appropriate mobile cloud token to pom.xml
2. appropriate device udid
3. full phone number, password and short phone number (only last 7 numbers like xxx-xx-xx)
   into DataForTest class
4. check that Russian Post (Почта России) app is installed on device

For run test:
mvn clean test

NOTE!
There is no way write a test for test case:
"должен быть тест следующего содержания: переход из приложения на страницу браузера,
работа со страницей браузера и переход обратно в приложение (клик по рекламе)".
The field in the application for switching to the browser
is not displayed every time the application is launched,
even with long waiting times