weight = float(input("Enter weight in kg: "))
height_cm = float(input("Enter height in cm: "))

height_m = height_cm / 100
bmi = weight / (height_m ** 2)

print("BMI =", round(bmi, 2))

if bmi < 18.5:
    print("Underweight")
elif bmi < 24.9:
    print("Normal weight")
elif bmi < 29.9:
    print("Overweight")
else:
    print("Obese")
