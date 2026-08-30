products = ["Rice", "Milk", "Oil", "Sugar"]
stock = [50, 20, 15, 40]

while True:
    print("\n--- INVENTORY CONTROL ---")
    print("1. Display Products")
    print("2. Sell Product")
    print("3. Add Stock")
    print("4. Exit")

    choice = int(input("Enter your choice: "))

    if choice == 1:
        print("\nProduct\t\tStock")
        for i in range(len(products)):
            print(products[i], "\t\t", stock[i])

    elif choice == 2:
        product = input("Enter product to sell: ")
        quantity = int(input("Enter quantity sold: "))

        found = False

        for i in range(len(products)):
            if products[i].lower() == product.lower():
                found = True

                if quantity <= stock[i]:
                    stock[i] -= quantity
                    print("Sale successful!")
                    print("Remaining stock:", stock[i])
                else:
                    print("Not enough stock!")

                break

        if not found:
            print("Product not found!")

    elif choice == 3:
        product = input("Enter product: ")
        quantity = int(input("Enter quantity to add: "))

        found = False

        for i in range(len(products)):
            if products[i].lower() == product.lower():
                found = True
                stock[i] += quantity

                print("Stock updated!")
                print("New stock:", stock[i])
                break

        if not found:
            print("Product not found!")

    elif choice == 4:
        print("Program ended.")
        break

    else:
        print("Invalid choice!")