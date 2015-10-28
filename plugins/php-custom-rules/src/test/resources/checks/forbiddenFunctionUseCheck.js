foo();                  // NOK {{Remove the usage of this forbidden function.}}
foo(1);                 // NOK

bar();                  // NOK
bar(1);                 // NOK

var Obj = {
    foo : function () {
        return "foo";
    },

    bar : function () {
        return "bar";
    }
};

var myObj = new Obj();

myObj.foo();            // OK
myObj.bar();            // OK
