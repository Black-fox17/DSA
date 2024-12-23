#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(){
    int number[] = {1,2,3,4};
    int length = sizeof(number) / sizeof(number[0]);
    int* result = (int*)malloc(length * sizeof(int));
    int* left = (int*)malloc(length * sizeof(int));
    int* right = (int*)malloc(length * sizeof(int));

    left[0] = 1;
    right[length - 1] = 1;

    for(int i = 1; i < length; i++){
        left[i] = left[i - 1] * number[i - 1];
    }
 
    for (int i = length - 2; i >= 0; i--){
        right[i] = right[i + 1] * number[i + 1];
    }
    
    for (int i = 0 ; i< length; i ++){
        result[i] = left[i] * right[i];
    }
    for (int k = 0; k < length; k ++){
        printf("%d\n",result[k]);
    }
    free(left);
    free(right);
    free(result);
    //printf("%d",length);
    return 0;
}
