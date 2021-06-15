## credit-card-demo

This is a REST API that validates different kinds of credit cards. 

### How to run it?
#### 1. Running as a packaged application
```
java -jar credit-card-demo-1.0.0.jar
```
#### 2. Running with Maven
Run it under the package folder `credit-card-demo\`
```
mvn spring-boot:run
```

### Other Maven commands
```
mvn compile
mvn test
mvn package
```
A new package application jar will be generated under `credit-card-demo\target\` with the name `credit-card-demo-1.0.0.jar`

System logs will be under `.\logs\`. 

### How to use it?
While the application is running, you could add the API at 
```
http://localhost:8090/card/check
```
You have to add another parameter `number` to use the AIP. For example:
```
http://localhost:8090/card/check?number=378282246310005
```
The return page will be
```
AMEX: 378282246310005 (valid)
```
