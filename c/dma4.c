#include <stdio.h>
#include <stdlib.h>

int main(){
    int n;
    printf("input:");
    scanf("%d", &n);

    int *p = malloc(n*sizeof(int));

    if(p == NULL)
    {
        printf("Memory allocation failed\n");
        return 1;
    }

    for(int i=0;i<n;i++){
        p[i]=(i+1)*10;
    }
    

    for(int i=0;i<n;i++){
        printf("%d\n",*(p+i));
    }

    free(p);
    return 0;
}