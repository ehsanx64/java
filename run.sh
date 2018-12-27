#!/bin/bash

echo "# Compiling..."
javac JavaTest.java

echo "# Running..."
java JavaTest

echo "# Cleaning..."
rm JavaTest.class
