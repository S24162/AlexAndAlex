# Etap budowania - budujemy aplikację w kontenerze z Mavenem i JDK 17
FROM maven:3.9.0-eclipse-temurin-17 AS build

WORKDIR /app

# Kopiujemy tylko plik pom.xml i folder src, żeby wykorzystać cache Dockera i przyspieszyć kolejne buildy
COPY pom.xml .
COPY src ./src

# Budujemy aplikację, pomijając testy (przyspiesza build)
RUN mvn clean package -DskipTests

# Etap uruchamiania - lekki obraz z JRE 17
FROM eclipse-temurin:17-jre

WORKDIR /app

# Kopiujemy zbudowany plik jar z poprzedniego etapu
COPY --from=build /app/target/AlexAndAlex-0.0.1-SNAPSHOT.jar app.jar

# Eksponujemy port 8080, na którym aplikacja będzie nasłuchiwać
EXPOSE 8080

# Komenda startowa uruchamiająca aplikację Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
