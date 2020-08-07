# Workshop #1 - AREP Stadistic Calculator

Program to calculate the mean and standard deviation of a set of n real numbers. The program reads the n real numbers from a file and use a linked list implementation to store the n numbers for do the calculations.

## Getting Started

The following instructions will allow you to have a copy of the project and run it on your machine.

### Prerequisites

* [Maven](https://maven.apache.org/) - Dependency Management

* [Java 8](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html) -  Development Environment 

* [Git](https://git-scm.com/) - Version Control System

### Installing

1. Clone the repository

```
git clone https://github.com/juancamilo399/Taller1Arep.git
```

2. Compile the projet

```
mvn package
```

3. Executing the program

```
mvn exec:java -D "exec.mainClass"="edu.escuelaing.arep.app.App"
```

4. Generating the documentation

```
mvn javadoc:javadoc
```

The documentation will be generated in target/site/apidocs/index.html.

[Documentation](https://juancamilo399.github.io/Taller1Arep/apidocs/index.html)

## Running the tests

To run the unit tests

```
mvn test
```


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Author

* **Juan Camilo Angel Hernandez** 


## License

This project is under GNU General Public License - see the [LICENSE](LICENSE) file for details
