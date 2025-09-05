# Etap budowania - budujemy aplikację w kontenerze z Mavenem i JDK 21
FROM maven:3.9.0-eclipse-temurin-21 AS build

WORKDIR /app

# Kopiujemy tylko plik pom.xml i src, żeby wykorzystać cache Dockera
COPY pom.xml .
COPY src ./src

# Budujemy aplikację, pomijając testy (przyspiesza build)
RUN mvn clean package -DskipTests

# Etap uruchamiania - lekki obraz z JRE 21
FROM eclipse-temurin:21-jre

WORKDIR /app

# Kopiujemy zbudowany plik jar z poprzedniego etapu
COPY --from=build /app/target/AlexAndAlex-0.0.1-SNAPSHOT.jar app.jar

# Eksponujemy port 8080
EXPOSE 8080

# Komenda startowa
ENTRYPOINT ["java", "-jar", "app.jar"]
