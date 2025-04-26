# Java Learning Repository Makefile

# Maven commands
.PHONY: clean compile test package run-calculator run-awt-example run-library-demo

# Clean the project
clean:
	mvn clean

# Compile the project
compile:
	mvn compile

# Run tests
test:
	mvn test

# Create package
package:
	mvn package

# Run specific applications
run-calculator:
	mvn exec:java -Dexec.mainClass="com.github.ehsanx64.applications.calculator.CalculatorApp"

# Run AWT Example
run-awt-example:
	mvn exec:java -Dexec.mainClass="com.github.ehsanx64.applications.gui.awtexample.AWTExampleApp"

# Run Library Demo
run-library-demo:
	mvn exec:java -Dexec.mainClass="com.github.ehsanx64.applications.cli.LibraryDemoApp"

# Run file manager (when implemented)
run-filemanager:
	mvn exec:java -Dexec.mainClass="com.github.ehsanx64.applications.filemanager.FileManagerApp"

# Run notepad (when implemented)
run-notepad:
	mvn exec:java -Dexec.mainClass="com.github.ehsanx64.applications.notepad.NotepadApp"

# Run game (when implemented)
run-game:
	mvn exec:java -Dexec.mainClass="com.github.ehsanx64.applications.game.GameApp"

# Default target
all: clean compile test package

# Help target
help:
	@echo "Available targets:"
	@echo "  clean         - Clean the project"
	@echo "  compile       - Compile the project"
	@echo "  test          - Run tests"
	@echo "  package       - Create package"
	@echo "  run-calculator - Run the calculator application"
	@echo "  run-awt-example - Run the AWT example application"
	@echo "  run-library-demo - Run the library demo application"
	@echo "  run-filemanager - Run the file manager application"
	@echo "  run-notepad   - Run the notepad application"
	@echo "  run-game      - Run the game application"
	@echo "  all           - Clean, compile, test, and package"
	@echo "  help          - Show this help message" 