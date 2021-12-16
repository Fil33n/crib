a = float(input())
b = float(input())
o = input()
if o == '+':
    print(a + b)
elif o == '-':
    print(a - b)
elif o == '/':
    if b == 0.0:
        print('Деление на 0!')
    else:
        print(a / b)
elif o == '*':
    print(a * b)
elif o == 'mod':
    if b == 0.0:
        print('Деление на 0!')
    else:
        print(a % b)
elif o == 'pow':
    print(a ** b)
elif o == 'div':
    if b == 0.0:
        print('Деление на 0!')
    else:
        print(a // b)
else:
    print('Шёл в зад с такой функцией')
