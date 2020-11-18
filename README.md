Digicert Code Challenge
submitted by Shawn Becker
sbecker11@me.com
Wed Nov 18, 2020

OVERVIEW
Digicert asked that we send this out to you prior to your interview.  It does not need to be completed before you speak with them tomorrow.  They just wanted to get it to you to expedite the process.  While it says “language of your choice”, if this can be done in Java, that would be best.  Please let me know if you have any questions.  Thanks.

Your application does not have to be fully functional, just spend around an hour or two and send it over once it’s completed. We generally allow a week to complete this because we know that you have other obligations in your life.

You can send it over as a link to a GitHub repo or whatever format works best for you. There’s no restrictions on what resources you use or third-party plugins that you consider.  The point is having fun with it and we look forward to seeing your results!

Using a language of your choice, write a minimal RESTful library API that can perform the following functions:
List all books in the library
CRUD operations on a single book
Your application does not have to be functional, just spend around an hour or two and send it over to us once it’s completed.
 

INSTRUCTIONS

COMPILE AND RUN THE REST SERVICE
mvn spring-boot:run


BUILD AND RUN THE JAR FILE
./mvnw clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar


CURL TESTS:

curl -i -X GET -H "Content-Type: application/json" \
http://localhost:8080/list-books

curl -i -X GET -H "Content-Type: application/json" \
http://localhost:8080/get-book/1

curl -i -X POST -H "Content-Type: application/json" \
-d "{\"firstName\":\"Frank\", \"Title\":\"Dune\"}" \
http://localhost:8080/create-book

curl -i -X PUT -H "Content-Type: application/json" \
-d "{\"firstName\":\"Frank\", \"Title\":\"Dune\"}" \
http://localhost:8080/update-book/1

curl -i -X DELETE -H "Content-Type: application/json" \
http://localhost:8080/delete-book/1
