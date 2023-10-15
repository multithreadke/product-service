FROM openjdk:17-alpine
# Add Maintainer Info
LABEL maintainer="Erick Koskey<koskey1871@gmail.com>"

#Make Directory
RUN mkdir /app
RUN mkdir /app/logs
RUN mkdir /app/images
RUN echo "Africa/Nairobi" > /etc/timezone
#RUN dpkg-reconfigure -f noninteractive tzdata
#Switch to /app directory
WORKDIR /app
# Add a volume pointing to /tmp
VOLUME /app/logs
# The application's jar file
ARG JAR_FILE=target/product-server-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} /app/app.jar
# Make port 8007 available to the world outside this container
EXPOSE 8000
# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dsun.net.client.defaultConnectTimeout=10000", "-Dsun.net.client.defaultReadTimeout=10000", "-jar","/app/app.jar"]