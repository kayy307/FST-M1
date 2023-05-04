def sum(n):
    if n <=1 :
        return n
    else:
        return n + sum(n-1)

print("sum of 10= ", sum(10))

