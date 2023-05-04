import pandas
data =pandas.read_excel("details.xlsx")
print(data)
No_of_row_col = data.shape
print("No.of rows and Columnn")
print(No_of_row_col)
print("List of email")
print(data["Email"])
print(data.sort_values("FirstName"))

