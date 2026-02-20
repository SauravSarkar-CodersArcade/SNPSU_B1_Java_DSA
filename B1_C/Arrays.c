#include<stdio.h>
int main(){
    // Array pointers
    int arr[] = {4,1,6,8,3};
    
    for(int i=0; i<5; i++){
        printf("%d ", *(arr+i));
    }
    return 0;
}