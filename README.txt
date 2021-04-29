Before run test add:
1. appropriate mobile cloud token to pom.xml
2. appropriate device udid
3. full phone number, password and short phone number (only last 7 numbers like xxx-xx-xx)
   into DataForTest class
4. check that Russian Post (Почта России) app is installed on device

For run test:
mvn clean test

NOTE!
There is no way to correctly test the test:
"transition from the application to the browser page,
work with the browser page and return to the application".
The field in the application for switching to the browser
is not displayed every time the application is launched,
even with long waiting times