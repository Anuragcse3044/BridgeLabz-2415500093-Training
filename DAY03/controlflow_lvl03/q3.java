p = int(input("Enter Physics marks: "))
c = int(input("Enter Chemistry marks: "))
m = int(input("Enter Maths marks: "))

avg = (p + c + m) / 3
print("Average Marks:", avg)

if avg >= 90:
    print("Grade: A | Excellent")
elif avg >= 75:
    print("Grade: B | Very Good")
elif avg >= 60:
    print("Grade: C | Good")
elif avg >= 40:
    print("Grade: D | Pass")
else:
    print("Grade: F | Fail")
