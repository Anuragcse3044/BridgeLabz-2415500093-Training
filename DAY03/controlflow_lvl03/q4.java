num = int(input("Enter a number: "))

isPrime = True

if num > 1:
    for i in range(2, num):
        if num % i == 0:
            isPrime = False
            break
else:
    isPrime = False

if isPrime:
    print(num, "is a Prime Number")
else:
    print(num, "is NOT a Prime Number")

  
