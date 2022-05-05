FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} competencematrix-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "competencematrix-0.0.1-SNAPSHOT.jar"]