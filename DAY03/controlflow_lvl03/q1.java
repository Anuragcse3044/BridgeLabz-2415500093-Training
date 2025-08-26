year = int(input("Enter a year: "))

if year >= 1582:
    if year % 400 == 0:
        print(year, "is a Leap Year")
    elif year % 100 == 0:
        print(year, "is NOT a Leap Year")
    elif year % 4 == 0:
        print(year, "is a Leap Year")
    else:
        print(year, "is NOT a Leap Year")
else:
    print("Leap Year program works only for year >= 1582")
