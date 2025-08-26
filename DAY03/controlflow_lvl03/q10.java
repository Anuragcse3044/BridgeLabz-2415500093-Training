first = float(input("Enter first number: "))
second = float(input("Enter second number: "))
op = input("Enter operator (+, -, *, /): ")

match op:
    case "+":
        print("Result =", first + second)
    case "-":
        print("Result =", first - second)
    case "*":
        print("Result =", first * second)
    case "/":
        if second != 0:
            print("Result =", first / second)
        else:
            print("Division by zero not allowed")
    case _:
        print("Invalid Operator")
