m = int(input("Enter month (1-12): "))
d = int(input("Enter day: "))
y = int(input("Enter year: "))

y0 = y - (14 - m) // 12
x = y0 + y0 // 4 - y0 // 100 + y0 // 400
m0 = m + 12 * ((14 - m) // 12) - 2
d0 = (d + x + (31 * m0) // 12) % 7

print("Day of week (0=Sun, 1=Mon, ... 6=Sat):", d0)
