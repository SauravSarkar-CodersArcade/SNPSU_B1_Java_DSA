#include<stdio.h>
#include<stdbool.h>
enum BOOLEAN {
   TRUE, FALSE, X=10, Y, Z 
};
int main(){
    bool status = true;
    enum BOOLEAN f = FALSE;
    printf("%i\n", status);
    printf("%i\n", f);
    // Don't use %d for the sizeof() function
    printf("Size of enum: %llu Bytes\n", sizeof(f));
    printf("Size of enum: %zu Bytes\n", sizeof(f));
    return 0;
}