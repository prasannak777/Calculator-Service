Project: Calculator-Service to test

Description: The Calculator Service is a RESTful API built with Spring Boot that provides basic arithmetic operations such as addition, subtraction, multiplication, and division. The application is designed to be simple, reliable, and easy to integrate with other services or front-end applications. It leverages Spring Boot, JUnit 5, and Mockito for testing and includes support for automatic API documentation via Swagger UI powered by Springdoc OpenAPI.

Setup Instructions:

Prerequisites:

Before setting up the application, ensure you have the following installed on your machine:

Java 21
Maven (for building the project)
IDE (IntelliJ IDEA, Eclipse, etc.)
GitHub (optional for version control)

Steps to Set Up:

1. Clone the repository to your local machine https://github.com/prasannak777/Calculator-Service.git
2. Navigate to the project directory: cd calculator-service
3. Install dependencies using Maven(need to install dependencies once) :run mvn clean install
4. Install dependencies for testing (optional): If you want to run tests, ensure the necessary testing dependencies are installed by running:mvn test

Opening and Setting Up in IntelliJ IDEA:

1. Launch IntelliJ IDEA on your computer.
2. Import the project into IntelliJ: go to File > Open.
	Navigate to the directory where you cloned the repository and select the root directory (i.e., calculator-service). Click OK to open the project.
3. IntelliJ will automatically detect that this is a Maven project. It will download all necessary dependencies and set up the project for you. If the dependencies are not automatically downloaded, you can right-click on the project root in the Project pane and select Maven > Reload Project.
4. Configure the JDK Version: Ensure that the project is using Java 21.
	Go to File > Project Structure.
	Under Project, select SDKs and make sure Java 21 is selected. If it’s not, click the + button to add the appropriate JDK.
	Apply the changes and close the window.
5. Run the Project: In the top-right corner of IntelliJ, you will see a green Run button (a triangle). Click this to start the Spring Boot application.
	The backend will start running on http://localhost:8080/myapp (as /myapp is configured in our application.properties).
6. Run Tests from IntelliJ
	Right-click on the src/test/java folder or individual test classes.
	Select Run 'TestName' to execute the tests.
7. Set Up and Run with Maven: 
	Open the Maven tool window. Under Lifecycle, right-click clean install or test to execute the Maven commands. or
	Start the Spring Boot development server on Terminal: mvn spring-boot:run
8. As we already configured the swagger, we can see all API on http://localhost:8080/myapp/swagger-ui/index.html#/

Testing:

1. Navigate to the project directory: cd calculator-service
2. To run Unit Tests: mvn test
3. Code Coverage: The project configured with Jacoco for code coverage. After running the tests, you can view the code coverage report at: target/site/jacoco/index.html
4. Generate Allure Reports and view the reports: You can generate Allure test reports by running the following commands:
	mv allure-results target/allure-results #To move the allure-results test-pack to target folder
	mvn allure:report
	mvn allure:serve
This will open a browser window displaying detailed test reports in local machine.


Contributing:

If you'd like to contribute to this project, please follow these guidelines:

Fork the repository.

1. Create a new branch for your feature: git checkout -b feature-name
2. Make your changes and commit them: git commit -am 'Add new feature'
3. Push to the branch: git push origin feature-name
4. Submit a pull request
