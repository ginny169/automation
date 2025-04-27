# Introduction and Java basic

## Mindset: 
- Keys points:
  - automation is development
  - daily/weekly learning and practice
  - Debugging is super important
  - OOP and design principles are important


## Roadmap
- [AT training content](https://docs.google.com/spreadsheets/d/1p08SGrkHhHl57HI1nf5UpDc0tWj0zgyn86f_phfoMQg/edit?gid=1901684003#gid=1901684003)
- [QA Engineer](https://roadmap.sh/qa)
- [Java Developer](https://roadmap.sh/java)


## Website to read documents, articles
- [daily.dev](https://app.daily.dev/)
- [google news](https://news.google.com/)
- [medium](https://medium.com/)
- [dev.to](https://dev.to/)
- [github](https://github.com/)
  - [Explore > Topics](https://github.com/topics)
  - [Explore > Trending](https://github.com/trending)


## Installation 
- Java SDK 11
- Editor: IntelliJ IDEA, Cursor
- Plugins: Supermaven (for IntelliJ IDEA)
- Maven

## Create Github repo

## Java basics commands

Java application:
- Must have at least 1 class with 1 main method (`public static void main(String[] args)`)
- .java file will be compiled to .class file
- .class file will be executed
- .class file will be packaged into .jar file (Java archive) as library (or dependency)

Commands:

```bash
# execute .java file
javac <fileName>.java

# Compile .java file to .class file
javac <fileName>.java

# Compile .java file to .class file and execute
javac <fileName>.java

# Compile .java file with dependencies to .class file
javac -cp <path to dependency> <fileName>.java
javac -classpath <path to dependency> <fileName>.java

# Execute application
java -classpath <path to .class folder> <className>
```