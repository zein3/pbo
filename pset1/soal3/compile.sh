#!/usr/bin/env bash

for FILE in src/*.java
do
    javac "$FILE" -d ./classes/
done
