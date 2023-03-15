Virtual Fruit Machine
-----------------

This application is a virtual gambling tool built with Spring Boot that exposes 
REST API endpoints.

###
### Description

The main endpoint `/draw` randomly selects four colors, possible are black, white, 
yellow and green. After that the jackpot is updated. The initial value of the 
Jackpot is 15 and 2 points are subtracted if the draw is not successful, i.e. 
at least one of the colors does not match the others. The last step is to update 
the draw result to either `LOSS` or `WIN` in case all four color happen to be the 
same. Another option is `TRY_AGAIN` where another draw can be performed. The jackpot 
and the result can be fetched from separate endpoints.

### Endpoints

This application exposes three `GET` endpoints, all returning `JSON`:

* `/draw` - main endpoint, returns four hex colors for each machine slot
* `/jackpot` - returns current jackpot value
* `/result` - returns draw result: loss, win or try again 

### Installation

To run the application you will need Java 11 or higher installed.
To install the application, clone the repository and run the following command:

``` ./mvnw spring-boot:run ```


### Access

The application runs on default port `8080`.

Once the application is running, you can access the endpoints using a web browser 
or a tool like Postman. The base URL is http://localhost:8080, and no 
authentication is required.