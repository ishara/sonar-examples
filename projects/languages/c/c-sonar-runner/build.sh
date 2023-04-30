#!/bin/bash
echo "REMOVE PREVIOUS BUILD"
rm -rf main

echo "BUILDING"
gcc -Wall -pedantic -std=c99 -I./lib -o main ./src/main.c
RC=$?

if [ $RC -ne 0 ]; then
  echo "BUILD FAILURE"
else
  echo "BUILD SUCCESS"
fi
