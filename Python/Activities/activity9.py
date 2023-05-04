
list1=[2,4,6,7,9]
list2=[9,11,13,15,6]
list3=[]
for even in list2:
    if(even%2 == 0):
        list3.append(even)
for odd in list1:
    if(odd%2 != 0 ):
        list3.append(odd)
print("print list1" ,list1)
print("print list2", list2)

print("result")
print(list3)