number = int(input("Enter number: "))
power = int(input("Enter power: "))

result = 1
counter = 0

while counter < power:
    result *= number
    counter += 1

print("Result =", result)
