FROM eclipse-temurin:11-jdk
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac src/testando_docker/codigo.java
CMD ["java", "-cp", "src", "testando_docker.codigo"]