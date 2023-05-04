num = list (input("Enter the list of num separated by comma=  ").split(","))
print(num[0])
print(num[-1])
if(num[0]== num[-1]):
    print("true")
else:
    print("false")