BINS = Calculadora.class TesteCalculadora.class
LIB=../lib
JUNIT=$(LIB)/junit-4.10.jar
HAMCREST=$(LIB)/hamcrest-junit-2.0.0.0.jar
CP=$(JUNIT):$(HAMCREST):.

test: TesteCalculadora
	java -cp $(CP) org.junit.runner.JUnitCore $<

TesteCalculadora: TesteCalculadora.java
	javac -cp $(CP) $<

include ../Makefile
