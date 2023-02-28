#!/usr/bin/env bash

if javac pset41/*.java -d classes/; then
    cd classes;
    java pset41.AnimalTest;
    cd ..;
fi

