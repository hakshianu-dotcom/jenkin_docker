FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . /app
RUN javac Grade
CMD ["java", "Grade"]

