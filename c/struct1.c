#include <stdio.h>

struct Node{
    int data;
    struct Node *next;
};

int main(){

    struct Node n1;
    struct Node n2;
    struct Node n3;

    n1.data=10;
    n1.next=&n2;

    n2.data=20;
    n2.next=&n3;

    n3.data=30;
    n3.next=NULL;

    printf("%d\n", n1.data);
    printf("%d\n", n1.next->data);
    printf("%d\n",n1.next->next->data);

    return 0;
}