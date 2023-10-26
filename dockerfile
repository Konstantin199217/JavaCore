FROM bellsoft/liberica-openjdk-alpine:19.0.2
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out ./src/main/java/Sample/Main.java
CMD java -classpath ./out main/java/Sample/Main