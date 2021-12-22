fucking_string = input() + ' '
s = 0
n = fucking_string[0]
for i in fucking_string:       
    if n != i:
        print(n + str(s), end = '')
        s = 0
        n = i
    s += 1
