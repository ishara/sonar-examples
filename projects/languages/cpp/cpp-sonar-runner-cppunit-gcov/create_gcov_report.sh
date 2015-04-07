
pushd reports/gcov
rm *
g++ -Wall -fprofile-arcs -ftest-coverage -o example ../../src/example.c
./example aparameter
gcov -cbf ./example.c
popd

