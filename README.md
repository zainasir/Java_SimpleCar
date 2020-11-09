# SimpleCar

## Overview
This small program allows the user to add cars and perform basic functions on it:
* Attempt to drive requested miles.
* Add provided gallons of gas.
* Return amount of gas.
* Return total number of miles driven (odometer).

## To execute and test the program, follow these steps:
1. Clone repository to local machine.
2. Use a text editor to change the main function in SimpleCar.java with any car you like.
3. Download the tester package using this [link](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.5.0/junit-platform-console-standalone-1.5.0.jar) and move it into the same directory as SimpleCar.java and JUnit.java.
4. Open terminal and make sure you are in the same directory as all the files.
5. Run the tester using the following two commands in order:
    * javac -d . -cp ./junit-platform-console-standalone-1.5.0.jar *.java
    * java -jar ./junit-platform-console-standalone-1.5.0.jar -cp . --scan-class-path
    
## Requirements
* [Java](https://java.com/en/download/)
* [JUnit Platform for Testing](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.5.0/junit-platform-console-standalone-1.5.0.jar)
