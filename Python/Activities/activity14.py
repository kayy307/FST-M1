"""Fibonacci Numbers"""

Fibonacci_number=int(input("how many number to fibanacci"))
def fnumber(number):
    if number <= 1:
        return number
    else:
        return fnumber(number-1) + fnumber(number-2)
for x in range(Fibonacci_number):
    print(fnumber (x))






