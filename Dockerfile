FROM openjdk:14-alpine
COPY /build/libs/ticket-booking-0.0.1-SNAPSHOT.jar ticket-booking-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","splitwise-0.0.1-SNAPSHOT.jar"]