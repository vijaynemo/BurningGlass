# Burning Glass Automation

This is a Test project in which we have created a BDD Framework with Page Object Model design pattern using Selenium, Java, PageFactory, Maven, Cucumber. Mostly focussed on timeouts related to Pages and iFrames.
* Implicit and pageload timeout methods were used.
* Explicit common timeout method was created which can used by various time taking WebElements.
* common setup and teardown methods for browser initialization and clear down.

### Assumptions
* Simple couple of test cases used, to demonstrate the page object model with Cucumber framework. Mostly focussed on the timeouts on pages and iframes.
* Basic Test run report is generated, the extent report is not used.
* Unit Testcases were not created.
* Logger/screenshots etc were not used.
* All of the above can be easily embedded if time permits.

### Framework/Project structure

```bash
src/test/java/runners : This package contains Runner class to run the framework.
src/test/java/pageObjects : This package contains page objects of all the traversed pages
src/test/java/stepDef : This package contains the Base Class and step definition Classes.
src/test/java/utilities : This package contains utilities files, currently only utility is for reading properties file.
Drivers folder contains all the browser drivers.
Configuration folder contains the properties file.
```
### Requirements to Run the Tests
* Java should be installed.
* Maven should be setup.
* System Environment variables for above are properly configured.

### How to Run the Tests
Download the project zip file from GitHub (Code->Download zip). 
Open command prompt/terminal and go to the project root directory.
* To Run the tests : type ``` mvn clean install``` and press enter.

* To Run the test suite on Chrome or Firefox, change the  browser  parameter in```config.properties``` file.

Note:
1. Chrome Browser version 88 and Firefox browser version 83 has been used for testing.
2. By Default the tests will run on the Chrome browser.

### Test Report
Once the Test has been run the Test Reports can be seen at below
* Under <project home directory>/cucumber.html. These are HTML files, so please open it on a browser.
 
### How to integrate with Jenkins
* Open Jenkins and login.
* Create a new Maven project.
* Inside source code management configuraton, select GIT and give GIT url and credentials.
* In the build step, provide the pom.xml path and give the goal as 'clean install'.
* Click on save and build.