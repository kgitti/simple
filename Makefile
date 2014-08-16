############################################
# Paramter
############################################
PROJECT_SRC = $(shell find ./src/* -name *.java)
PROJECT_PROD = ./bin

############################################
# build Commmand
############################################

All: build run junit clean

build:
	javac -cp ".:bin/*:lib/*" -d $(PROJECT_PROD) $(PROJECT_SRC)

run:
	java -classpath $(PROJECT_PROD) helloworld/World

junit:
	java -classpath "./bin:lib/junit-4.11.jar"  runner/TestRunner

clean:
	rm -rf $(PROJECT_PROD)/*
