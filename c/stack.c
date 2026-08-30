#include <stdio.h>

#define size 10

int stack[size];
int topindex = -1;

void display(){
    if(topindex==-1){
        printf("Stack is empty");
    }else{
        printf("\nStack elements:\n");
        for(int i=topindex;i>=0;i--){
            printf("%d\n",stack[i]);
        }
    }
}


void push(){
    int inp;

    if(topindex == size-1){
        printf("Stack Overflow\n");
    }else{
        printf("Enter integer (-50 to +50): ");
        scanf("%d", &inp);

        if(inp<=-50 || inp>=50){
            printf("Invalid Input\n");
        }else{
            topindex++;
            stack[topindex]=inp;

            printf("%d pushed into stack", inp);
            display();
        }
    }
}

void pop(){
    if(topindex<0){
        printf("Stack Underflow\n");
    }else{
        printf("popped element: %d", stack[topindex]);
        topindex--;
        display();
    }

}

void peek(){
    if(topindex==-1){
        printf("Stack is empty\n");
    }else{
        printf("top element: %d", stack[topindex]);
    }
}

int main(){

    int choice;

    while(1){
        printf("\n----- STACK MENU -----\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");

        printf("Enter Choice: ");
        scanf("%d", &choice);

        if(choice==1){
            push();
        }else if(choice==2){
            pop();
        }else if(choice==3){
            peek();
        }else if(choice==4){
            display();
        }else if(choice==5){
            printf("Program Over\n");
            return 0;
        }
        else{
            printf("Invalid Input\n");
        }
    }

    return 0;
}