📄 Calculator Automation Testing Project
🚀 Project Overview
This project automates the testing of a calculator web application using Java, Selenium, TestNG, and Extent Reports. The framework is designed to perform:

Functional Testing

UI Component Testing

Regression Testing

Cross-Browser Testing

End-to-End Integration Testing

🛠️ Technology Stack
Java 17

Selenium 4.21.0

TestNG

Maven

Extent Reports

WebDriverManager (automatic driver management)

Browsers: Chrome, Edge, Firefox

✅ Key Features
🚀 Supports cross-browser testing using TestNG parameters.

✅ Generates Extent Reports with screenshots on failure.

⚙️ Batch file (run.bat) for easy test execution.

📂 Supports parallel execution using CrossBrowser.xml.

📋 Well-organized test cases covering functional, UI, and regression flows.

📂 Folder Structure

calculator_Automation/
 ┣ src/test/java/
 ┃ ┣ testBase/            # WebDriver setup and base class
 ┃ ┣ testCases/           # All Selenium test classes
 ┃ ┣ utility/             # Extent Report management
 ┣ reports/               # Extent Reports will be generated here
 ┣ screenshots/           # Screenshots on failure
 ┣ pom.xml                # Maven configuration
 ┣ Master.xml             # TestNG suite for all test types
 ┣ CrossBrowser.xml       # TestNG suite for cross-browser execution
 ┣ Functional.xml         # Functional test suite
 ┣ Regression.xml         # Regression test suite
 ┣ run.bat                # Batch file to run tests
 
🧪 Test Suites
Suite Name	      Purpose
Master.xml	      Full execution: Functional, UI, Regression
CrossBrowser.xml	Parallel cross-browser testing
Functional.xml	  Functional tests only
Regression.xml	  Regression tests only

💻 How to Run the Tests
1️⃣ Run All Tests:
mvn test

2️⃣ Run Cross-Browser Tests:
mvn test -DsuiteXmlFile=CrossBrowser.xml

3️⃣ Run via Batch File:
run.bat

📊 Reporting
Extent Reports are generated in the reports folder automatically after test execution.

Screenshots of failed tests are saved in the screenshots folder.

The report will auto-open upon completion.

🔧 Prerequisites
Java 17+

Maven

Chrome, Edge, Firefox installed

Internet connection (for WebDriverManager)

✅ Future Enhancements
CI/CD integration using Jenkins

API integration testing

Performance and load testing.

** How to Clone and Run the Project **
🔹 Step 1: Clone the Project
git clone https://github.com/sultansaudagar1999/calculator_Automation.git

🔹 Step 2: Navigate to the Project Directory
cd calculator_Automation

🔹 Step 3: Run All Tests
mvn test

🔹 Step 4: Run Cross-Browser Tests
mvn test -DsuiteXmlFile=CrossBrowser.xml

🔹 Step 5: Run via Batch File (Windows)
run.bat

