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
	###### Build program     ######
	javac -cp ".:bin/*:lib/*" -d $(PROJECT_PROD) $(PROJECT_SRC)

run:
	###### Run program       ######
	java -classpath $(PROJECT_PROD) helloworld/World

junit:
	###### Unit Test program ######
	java -classpath "./bin:lib/junit-4.11.jar"  runner/TestRunner

clean:
	###### Clean program     ######
	rm -rf $(PROJECT_PROD)/*
