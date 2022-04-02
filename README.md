### Work System Setup
- Admin Rights to install softwares
- Java development kit(JDK)- download & install JDK8 or JDK11; configure PATH(C:\Program Files\Java\jdk-11\bin) and JAVA_HOME(C:\Program Files\Java\jdk-11) env variables; verify installation using "java --version" in command prompt, test
- Maven(build tool)- download, install(https://maven.apache.org/download.cgi), Configure M2_HOME(C:\Program Files\apache-maven-3.6.3), MAVEN_HOME(C:\Program Files\apache-maven-3.6.3), PATH(C:\Program Files\apache-maven-3.6.3\bin) env variables; local repository path for example- C:\Users\nipun\.m2; project confoguration- pom.xml, test using mvn --version, run "mvn clean install" in command prompt; dependecies are stored locally for example at C:\Users\nipun\.m2
- Integrated Development Enviornment(IDE)- Eclipse, SpringToolSuite, Intellij whichever used in the project
- IDE plugins for code quality- SonarLint(mostly used), CheckStyle, FindBugs and so on; For plugin installation go in Eclipse -> Eclipse Marketplace -> Search(SonarLint for example)-> Install -> right click project and select sonarlint to see report
- Spring starter project create- https://start.spring.io/, generate, extract locally, import into IDE(eclipse) and run via IDE(Run) or "mvn clean install"
- Software Configuration Management- Git/TortoiseGit, download & install Git(https://git-scm.com/download/win) and configure PATH e.g. C:\Program Files\Git\cmd & TortoiseGit(https://tortoisegit.org/download/). Try cloning the project(https://github.com/BahriNipun/sample.git) from github(project hosting)
- Docker desktop for continers to locally build and push docker images (https://docs.docker.com/desktop/windows/install/)
- Other Softwares - Postman(API client)-https://www.postman.com/downloads/

### Project Methodology
- SCRUM- Work is refined from product backlog, planned and targeted in a sprint which is is usually two weeks; Scrum team consists of scrum master, product owner, developers, QA and devops colleagues.
- JIRA board https://bahrinipun.atlassian.net/jira/software/projects/CD/boards/1
- Product backlog, Sprint refinement(effort estimation, story points, dependecies/impediment), sprint planning, sprint execution, spring retrospective
- Responsibilities- Scrum rituals=Scrum Master, Product Backlog=Product Owner, Sprint Backlog=Developers/QA/DevOps

### Code Development & Delivery
- Refined User Story from the sprint is assigned to developer
- Developer clones code repository in his machine; dev creates a feature branch from the master(or any other designated) branch for the code changes;
- Developer does coding in local envionment i.e. laptop using tools like IDE, Postman etc
- Developer writes & verify code/functionality in IDE; dev does unit testing via unit tests e.g. junit; developers runs the code quality plugin to see if there are some improvements
- Developer writes(optional) the Dockerfile(instructions to build container)
- Developer creates a pull request from his feature branch(containg the feature changes he made) towards master(code to be deployed to production)
- Developer assigns the pull request to his colleague for peer review; reviewer may asks for few code updates; once finalized pull request is approved by reviewer.
- Developer now merges the feature branch to upper branch(e.g. master or any other) and code is deveployed to Development server enviornment; dev can now validate his    code in server env.
- Code the then deployed to next higher envionment e.g QA env by devops member and feature is tested by the QA memeber.
- Successul tested code is cheery picked and merged to higher enviorment e.g. Staging and automated/manual tests are done by QA; QA gives green signal for prod deployment to Devops.
- Devops deploys the code to production and automated/manual/sanity tests are executed;
- Congratulations ! your code is now live.

### Design Patterns & Principles
- SOLID principle (Single Responsibility, Open-Closed, Liskov Substitution, Interface Segregation, Dependency Inversion)
- Lean software development (https://en.wikipedia.org/wiki/Lean_software_development)

### Java 8 Features
- Functional Interface: Interface with exactly one abstract method
- Default method:  Added to interfaces to add extra features to current interfaces without disrupting the current implementations; can have a body; stream() is a   default method added to Collection interface.
- Static method: Interface method with implementation
- Lambda Expression: Provides implementation of an functional interface, Syntax (argument) → (body)
- Optional Class: No more null checks needed against null pointer exception
- Java Stream API: Faster aggregated operations on collections & I/O operations; 
- forEach() method in Iterable interface: 

### Object Oriented Programming(OOPs) Concepts
- Class
- Object
- Method
- Inheritance
- Encapsulation
- Polymorphism
- Data Abstraction

### Core Java
- Collections ( Lists, Maps, Streams, Iterable interface)
- Mulithreading( With Thread class and Runnable interface)
- Strings

### Misc Topics
- General Questions
- Jakson API
- Caching
