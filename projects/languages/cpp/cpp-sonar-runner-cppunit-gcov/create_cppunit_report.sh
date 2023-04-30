#! /bin/sh

cd tests

g++ -o example example.cpp -lcppunit
./example
