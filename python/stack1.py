# Stack implementation using Array


MAX_SIZE = 10

stack = []
top = -1


# Push operation
def push():

    global top

    if top == MAX_SIZE - 1:
        print("Stack Overflow")

    else:

        value = int(input("Enter integer (-50 to +50): "))

        if value < -50 or value > 50:
            print("Value out of range!")

        else:
            stack.append(value)
            top += 1

            print(value, "pushed into stack")


# Pop operation
def pop():

    global top

    if top == -1:
        print("Stack Underflow")

    else:

        removed = stack.pop()

        top -= 1

        print("Popped element:", removed)



# Peek operation
def peek():

    if top == -1:

        print("Stack is empty")

    else:

        print("Top element:", stack[top])



# Display operation
def display():

    if top == -1:

        print("Stack is empty")

    else:

        print("\nStack elements:")

        for i in range(top, -1, -1):

            print(stack[i])


# Main program

while True:

    print("\n----- STACK MENU -----")
    print("1. Push")
    print("2. Pop")
    print("3. Peek")
    print("4. Display")
    print("5. Exit")


    choice = int(input("Enter choice: "))


    if choice == 1:
        push()

    elif choice == 2:
        pop()

    elif choice == 3:
        peek()

    elif choice == 4:
        display()

    elif choice == 5:
        print("Program ended")
        break

    else:
        print("Invalid choice")