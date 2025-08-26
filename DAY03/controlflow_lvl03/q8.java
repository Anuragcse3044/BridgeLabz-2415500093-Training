number = int(input("Enter a number: "))
temp = number
sum_digits = 0

while temp > 0:
    sum_digits += temp % 10
    temp //= 10

if number % sum_digits == 0:
    print(number, "is a Harshad Number")
else:
    print(number, "is NOT a Harshad Number")

  
