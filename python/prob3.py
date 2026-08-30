def display_sales(products, sales, months):
    print("\n----------- MONTHLY SALES -----------")

    print("Product\t", end="")

    for month in months:
        print(f"{month}\t", end="")

    print()

    for i in range(len(products)):
        print(products[i], "\t", end="")

        for j in range(12):
            print(sales[i][j], "\t", end="")

        print()


def calculate_quarterly_sales(sales, product_index):

    q1 = 0
    q2 = 0
    q3 = 0
    q4 = 0

    for j in range(12):

        if j < 3:
            q1 += sales[product_index][j]

        elif j < 6:
            q2 += sales[product_index][j]

        elif j < 9:
            q3 += sales[product_index][j]

        else:
            q4 += sales[product_index][j]

    return q1, q2, q3, q4


def calculate_annual_sales(sales, product_index):

    total = 0

    for j in range(12):
        total += sales[product_index][j]

    return total


def display_performance(products, sales):

    print("\n----------- SALES PERFORMANCE -----------")

    for i in range(len(products)):

        q1, q2, q3, q4 = calculate_quarterly_sales(sales, i)

        annual = calculate_annual_sales(sales, i)

        print("\nProduct:", products[i])
        print("Quarter 1:", q1)
        print("Quarter 2:", q2)
        print("Quarter 3:", q3)
        print("Quarter 4:", q4)
        print("Annual Sales:", annual)







products = ["Maggi", "Pasta", "Cone"]

sales = [
    [100, 120, 150, 130, 140, 160, 170, 180, 190, 200, 210, 220],
    [80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190],
    [50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160]
]

months = [
    "Jan", "Feb", "Mar",
    "Apr", "May", "Jun",
    "Jul", "Aug", "Sep",
    "Oct", "Nov", "Dec"
]

display_sales(products, sales, months)

display_performance(products, sales)