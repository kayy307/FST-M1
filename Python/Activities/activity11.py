fruit_list = {
    "Orange" : 78,
    "apple" : 120,
    "kiwi" : 98,
    "mango" : 80,
    "tendercoconut": 40

}

fruits_to_buy = input("enter the list of friuit split by comma").lower()
print(fruits_to_buy)
if fruits_to_buy in fruit_list:
    print("it is available")
else:
    print("Not available")
