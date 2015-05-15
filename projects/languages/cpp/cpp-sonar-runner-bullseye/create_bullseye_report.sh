#!/bin/sh

export COVFILE=`pwd`/coverage.cov
cov01 -1
gcc example.c -o example
./example
cov01 -0
covxml -f coverage.cov -o report.xml
rm example

