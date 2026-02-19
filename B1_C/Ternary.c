#include<stdio.h>
int hammingWeight(int n){
        int count = 0;
        while (n > 0){
            if(n & 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
int main(){
    (2 > 3) ? printf("True") : printf("False");
    printf("\nHamming weight of 11: %d ", hammingWeight(11));
    return 0;
    
}