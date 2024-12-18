# Quiz App in Spring Boot

Problem Statement:
Create api endpoints for a quiz app in Spring boot. Using the apis, a user can do the following:

1. Start new quiz session.
2. Get a random multiple choice question from a set of questions in database
3. Submit answer and
4. Get the total questions answered by user with details on correct and incorrect submission.

#Running the Code

## If u have IntelliJ

1. clone the repo
2. open the project using the pom.xml from intellij
3. navigate to QuizApplication.java and select run.
4. goto localhost:6969/index.html

## using the command line 

### If you have maven installed
1. open a terminal in project directory
2. mvn spring-boot:run
3. go to localhost:6969/index.html

### with Java .jar file
1. navigate to the target directory
2. open a terminal in the directory
3. paste this ```java -jar quiz-0.0.1-SNAPSHOT.jar```
4. go to localhost:6969/index.html

## FOR CHECKING OUT THE API RESPONSES
You can navigate to :
- localhost:6969/quiz/questions  for checking all the questions in the db //all questions endpoint
- localhost:6969/quiz/random     for checking the random questions sent by the api for the quiz  //the random questions endpoint
- localhost:6969/quiz/submit    //answers submission endpoint
