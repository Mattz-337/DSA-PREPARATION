#include <stdio.h>
#include <stdlib.h>

int main(){
    int *p = malloc(5*sizeof(int));

    if(p == NULL)
    {
        printf("Memory allocation failed\n");
        return 1;
    }
    for(int i=0;i<5;i++){
        printf("%d\n",*(p+i));
    }

    *p=10;
    *(p+1)=20;
    *(p+2)=30;
    *(p+3)=40;
    *(p+4)=50;

    for(int i=0;i<5;i++){
        printf("%d\n",*(p+i));
    }

    free(p);
    return 0;
}