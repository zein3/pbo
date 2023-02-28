#!/usr/bin/env bash

if javac pset42/*.java -d classes/; then
    cd classes;
    java pset42.MovableTest;
    cd ..;
fi

