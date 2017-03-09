# *Mazen H. Khalil Assignment ... Mar 9, 2017*

##Setup Instructions
###Prerequisites
- JDK 8
- Maven
- GIT
- Tomcat 8

###Instructions
- run the following command to clone the repository
**git clone https://github.com/mazen-khalil/expedia**
- Browse to the cloned repository and run the following command
**mvn clean install**
- Once the build finished successfully, deploy the generated **target/Expedia Assignment.war** on Tomcat.
- Access the application on the following URL
**http://HOST:PORT/assignment/faces/index.xhtml**

##Technology Used
- *JavaEE 7*
- *JAX-RS*
- *JAXB*
- *JSF*
- *Primefaces*

##Notes
- *Travis-CI* is integrated with this project (Continuous Integration)
- *Heroku* is integrated with Travis-CI (Continuous Deployment)
**https://expediaassignment.herokuapp.com**

##Assumptions
- Type of *almostSoldOutRoomTypeInfoCollection* array as part of *hotelUrgencyInfo* assumed to be *String[]*
- *min/maxTripStartDate* has been set to be sent as "yyyy-MM-dd", in the example, the sent value was ":yyyy-MM-dd"!

##Known Issues
- The following query parameters accept double value, but due to the used rating component only (1.0, 2.0, 3.0, 4.0 and 5.0) are sent.
	- *minStarRating*
	- *maxStarRating*
	- *minGuestRating*
	- *maxGuestRating*
- SCHEMA, HOST, PORT and RESOURCE are hard coded on *HotelFinder* class
- Junit tests have not been written