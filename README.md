# Java Learning Repository

This repository contains Java source code written for learning purposes and while studying various Java books. The code is organized into two main categories:

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── com/github/ehsanx64/
│   │   │   ├── applications/     # Standalone applications with main() methods
│   │   │   │   ├── calculator/   # Calculator application
│   │   │   │   ├── filemanager/  # File manager application
│   │   │   │   ├── notepad/      # Notepad application
│   │   │   │   ├── game/         # Game application
│   │   │   │   ├── cli/          # Other CLI applications
│   │   │   │   └── gui/          # Other GUI applications
│   │   │   └── libraries/        # Reusable libraries and utilities
│   │   │       ├── core/         # Core utilities and base classes
│   │   │       ├── api/          # API-related code
│   │   │       └── utils/        # General utility classes
│   └── resources/                # Resource files (configs, properties, etc.)
└── test/
    └── java/                    # Test classes
        └── com/github/ehsanx64/ # Mirror structure of main/java
```

## Categories

1. **Applications** (`src/main/java/com/ehsan/applications/`)
   - Each standalone application has its own package directory
   - Example applications:
     - `calculator/` - A simple calculator program
     - `filemanager/` - A file management utility
     - `notepad/` - A text editor application
     - `game/` - A game application
   - Additional categories:
     - `cli/` - For other command-line applications
     - `gui/` - For other GUI applications
   - Each application should have its own `main()` method in a class named after the application

2. **Libraries** (`src/main/java/com/ehsan/libraries/`)
   - Contains reusable code and utilities
   - Can be used by applications within the repository
   - Organized by functionality (core, api, utils)

## Building and Running

This project uses Maven for dependency management and building. To build the project:

```bash
mvn clean install
```

To run a specific application:

```bash
# Run the calculator application
mvn exec:java -Dexec.mainClass="com.github.ehsanx64.applications.calculator.CalculatorApp"

# Run the file manager
mvn exec:java -Dexec.mainClass="com.github.ehsanx64.applications.filemanager.FileManagerApp"

# Run the notepad
mvn exec:java -Dexec.mainClass="com.github.ehsanx64.applications.notepad.NotepadApp"
```

## Creating a New Application

To create a new standalone application:

1. Create a new package directory under `applications/`
2. Create your main class with a `main()` method
3. Follow the naming convention: `YourAppNameApp.java`
4. Place related classes in the same package

Example structure for a new application:
```
src/main/java/com/ehsan/applications/yourapp/
├── YourAppNameApp.java
├── models/
├── views/
└── controllers/
```

## How to run:

Make sure javac and java are in the OS PATH. Two scripts are provided:
* `run.bat` for Windows
* `run.sh` for Linux (or GNU tools on Windows).

## TODO:
* The method used for building sub-projects is not ideal and using something like `Gradle` is a vital requirement.
