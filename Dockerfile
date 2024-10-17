# Use the official OpenJDK image as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY .   /app

# Compile the Java code
RUN javac Sum.java

# Run the program when the container starts
CMD ["java", "Sum"]

