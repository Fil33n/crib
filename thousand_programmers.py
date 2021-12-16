n = int(input())
x = n % 10
y = n % 100
if x == 1 and y != 11:
    print (n, 'программист')
elif 1 < x < 5 and not 11 <= y < 15:
    print(n, 'программиста')
else:
    print(n, 'программистов')
