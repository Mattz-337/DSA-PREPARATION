#include <stdio.h>
#include <stdlib.h>

struct Node {
    int coeff;
    int exp;
    struct Node *next;
};

struct Node* createNode(int coeff, int exp)
{
    struct Node *newNode = malloc(sizeof(struct Node));

    newNode->coeff = coeff;
    newNode->exp = exp;
    newNode->next = NULL;

    return newNode;
}

struct Node* addPolynomial(struct Node *p1, struct Node *p2)
{
    struct Node *result = NULL;
    struct Node *tail = NULL;

    while (p1 != NULL && p2 != NULL)
    {
        struct Node *newNode;

        if (p1->exp == p2->exp)
        {
            newNode = createNode(p1->coeff + p2->coeff, p1->exp);
            p1 = p1->next;
            p2 = p2->next;
        }
        else if (p1->exp > p2->exp)
        {
            newNode = createNode(p1->coeff, p1->exp);
            p1 = p1->next;
        }
        else
        {
            newNode = createNode(p2->coeff, p2->exp);
            p2 = p2->next;
        }

        if (result == NULL)
        {
            result = newNode;
            tail = newNode;
        }
        else
        {
            tail->next = newNode;
            tail = newNode;
        }
    }

    while (p1 != NULL)
    {
        tail->next = createNode(p1->coeff, p1->exp);
        tail = tail->next;
        p1 = p1->next;
    }

    while (p2 != NULL)
    {
        tail->next = createNode(p2->coeff, p2->exp);
        tail = tail->next;
        p2 = p2->next;
    }

    return result;
}

void display(struct Node *p)
{
    while (p != NULL)
    {
        printf("%dx^%d", p->coeff, p->exp);

        if (p->next != NULL)
            printf(" + ");

        p = p->next;
    }
}

int main()
{
    struct Node *p1 = createNode(3, 14);
    p1->next = createNode(2, 8);
    p1->next->next = createNode(1, 0);

    struct Node *p2 = createNode(8, 14);
    p2->next = createNode(-3, 10);
    p2->next->next = createNode(10, 6);

    struct Node *result = addPolynomial(p1, p2);

    printf("P1 = ");
    display(p1);

    printf("\nP2 = ");
    display(p2);

    printf("\nResult = ");
    display(result);

    return 0;
}