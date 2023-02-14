#!/usr/bin/env bash

if javac ./src/*.java -d ./classes/; then
    cd ./classes;
    java Main;
    cd ..;
fi
