//
//  main.m
//  helloworld
//

#import "Other.h"

int main(int argc, const char * argv[]) {

    @autoreleasepool {
        Other *object = [[Other alloc] init];
        [object sayHello];
    }
    return 0;
}

