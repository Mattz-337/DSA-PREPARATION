#include <stdio.h>
#include <string.h>

#define MAX 100

struct Stack {
    char data[MAX][50];
    int top;
};

void push(struct Stack *s, char action[]) {
    if (s->top == MAX - 1) {
        printf("Stack Overflow\n");
        return;
    }

    strcpy(s->data[++s->top], action);
}

char* pop(struct Stack *s) {
    if (s->top == -1)
        return NULL;

    return s->data[s->top--];
}

int main() {
    struct Stack undo = {.top = -1};
    struct Stack redo = {.top = -1};

    push(&undo, "Type Hello");
    push(&undo, "Type World");

    printf("Undo: %s\n", pop(&undo));

    push(&redo, "Type World");

    printf("Redo: %s\n", pop(&redo));

    return 0;
}