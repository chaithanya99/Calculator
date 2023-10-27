FROM openjdk:11
COPY ./calculator/target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","calculator-1.0-SNAPSHOT.jar","com.example.App"]
