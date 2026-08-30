#include <stdio.h>

void swap(int *p,int *q){
    int temp=*p;
    *p=*q;
    *q=temp;

}


int main(){
    int a=10;
    int b=12;

    swap(&a,&b);

    printf("a = %d\nb = %d", a,b);

    return 0;
}