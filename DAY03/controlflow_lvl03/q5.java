number = int(input("Enter a number: "))
originalNumber = number
sum_val = 0

while originalNumber != 0:
    digit = originalNumber % 10
    sum_val += digit ** 3
    originalNumber //= 10

if sum_val == number:
    print(number, "is an Armstrong Number")
else:
    print(number, "is NOT an Armstrong Number")
