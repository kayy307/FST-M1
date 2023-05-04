number = tuple(map(int, input("Enter the numbers split by comma: ").split(",")))
for num in number:
    if( num % 5 == 0):
     print(num)

"""number = (5,10,60,80,6)
for num in number:
    if( num % 5 == 0):
        print(num)"""
