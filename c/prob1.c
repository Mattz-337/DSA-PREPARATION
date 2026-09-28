#include <stdio.h>
#include <string.h>

#define MAX 100

struct Stack {
    char data[MAX];
    int top;
};

void push(struct Stack *s, char c) {
    if (s->top < MAX - 1)
        s->data[++s->top] = c;
}

char pop(struct Stack *s) {
    if (s->top == -1)
        return '\0';

    return s->data[s->top--];
}

int isMatching(char open, char close) {
    return (open == '(' && close == ')') ||
           (open == '[' && close == ']') ||
           (open == '{' && close == '}');
}

int isValid(char str[]) {
    struct Stack s = {.top = -1};

    for (int i = 0; str[i] != '\0'; i++) {

        if (str[i] == '(' ||
            str[i] == '[' ||
            str[i] == '{') {

            push(&s, str[i]);
        }

        else if (str[i] == ')' ||
                 str[i] == ']' ||
                 str[i] == '}') {

            char open = pop(&s);

            if (open == '\0' || !isMatching(open, str[i]))
                return 0;
        }
    }

    return s.top == -1;
}

int main() {
    char str[100];

    printf("Enter brackets: ");
    scanf("%s", str);

    if (isValid(str))
        printf("Valid\n");
    else
        printf("Invalid\n");

    return 0;
}