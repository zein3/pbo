#!/usr/bin/env bash

if javac pset43/*.java pset42/*.java -d classes/; then
    cd classes;
    java pset43.MovableTest2;
    cd ..;
fi

