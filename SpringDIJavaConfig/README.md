# Spring Dependency Injection Using Java-Based Configuration

## Overview
This example demonstrates **Dependency Injection (DI)** using **Java-based configuration** with Spring annotations.

## Steps to Run on Bytexl Workspace

### 1. Upload and Extract Project
1. Upload this zip file to your Bytexl workspace.
2. Extract it using:
   ```bash
   unzip SpringDIJavaConfig.zip
   cd SpringDIJavaConfig
   ```

### 2. Download Spring JARs
Download these jars from the web and upload them into the `lib` folder:
- spring-context
- spring-beans
- spring-core
- spring-expression
- spring-jcl
- commons-logging

Or install via apt if available:
```bash
sudo apt install libspring-java
```

### 3. Compile
```bash
javac -cp "/usr/share/java/*:." src/com/example/*.java -d bin
```

### 4. Run
```bash
java -cp "/usr/share/java/*:bin" com.example.MainApp
```

### Output
```
Student details:
Enrolled in course: Spring Framework
```
