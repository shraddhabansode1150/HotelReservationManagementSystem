# HotelReservationManagementSystem
Technologies Used are: Spring boot, java, mysql, spring web, Spring JPA

## Requirments
* IntelliJIDEA
* Serverport: 8080 (use: localhost:8080)
* Database name: cab_application
* Java version: 17
* JSP for frontend
* Everything is present in the pom.xml (no need to download any library)
## Steps to run Hotel booking app
* Download the source code and import in intellijIDEA. Wait for the libraries to get loaded.
* import the cab_application.db into your database. (Location: cab_service/cab_application.sql)
* Go to localhost:8080/
* Login into the system
* There are 3 accounts already created for testing purpose:-
* userId:admin,role:admin,password:123
* userID:cust1,role:USER,password:123
* userID:cust2,role:USER,password:123


# Admin EndPoints
* Home - localhost:8080/
* List Car Requests from drivers - http://localhost:8080/list-car-requests/
* http://localhost:8080/request-car?driverId=102&carId=402
* Assign/re-assign car to driver: http://localhost:8080/assign-car/carId/503/driverId/152
* For creation/deletion of car/driver buttons are present at the ui
# Customer EndPoints
* Buttons are present at the ui for booking
* For cab cancellation - after booking URL will be returned in the form of json
# Employee EndPoints
*  Request Car from Driver - http://localhost:8080/request-car?driverId=102&carId=402
*  Withdraw from system - http://localhost:8080/delete-driver?id=102
## Note
* You can change server port by setting properties in application.properties file i.e.
* #server.port=8081
* Only 3 capacities allowed in the system ( 3,4,5), throws exception if not in the range.
* Database scheme diagram is also present (Location: cab-service/Database Schema Diagram.png.

## Important note: I have reference cab service application to create this hotel reservation application and will show in browser like below
*Car= hotel
*driver= employee
*car list= hotel list
*1 seater= 1 room
*2 seater= 2 room
*3 seater= 3 room
