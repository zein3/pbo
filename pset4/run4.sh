#!/usr/bin/env bash

if javac pset44/*.java -d classes/; then
    cd classes;
    java pset44.GeometryTest;
    cd ..;
fi

