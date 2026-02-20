#include<stdio.h>
int * function(){
    static x = 10; // 0x1000 // Global
    return &x; // 0x1000 [10]
}
int main(){
    int * ptr = function(); // 0x1000
    printf("value of x: %d\n", *ptr);
    int a = 100;
    int * p = &a;
    // De-referencing - value from address
    printf("Value of a %d\n", *p);
    printf("Address of a %x\n", p);
    printf("Address of a %p\n", p);
    return 0;
}