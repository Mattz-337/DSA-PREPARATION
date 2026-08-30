#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *next;
};

int main(){

    struct Node *n1 = malloc(sizeof(struct Node));
    struct Node *n2 = malloc(sizeof(struct Node));
    struct Node *n3 = malloc(sizeof(struct Node));
    struct Node *n4 = malloc(sizeof(struct Node));

    n1->data = 10;
    n1->next = n2;
    n2->data = 20;
    n2->next = n3;
    n3->data = 30;
    n3->next = n4;
    n4->data = 40;
    n4->next = NULL;

    printf("Data: %d\n", n1->data);
    printf("Data: %d\n", n1->next->data);
    printf("Data: %d\n", n1->next->next->data);
    printf("Data: %d\n", n1->next->next->next->data);
    printf("%zu", sizeof(struct Node));

    free(n1);
    free(n2);
    free(n3);
    free(n4);
    
    
    return 0;
}