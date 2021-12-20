# GCM with least common multiple
a = int(input())
b = int(input())
d = a * b
while a != 0 and b != 0:
    if a > b:
        a = a % b
    else:
        b = b % a
else:
    print(d//(a+b))
