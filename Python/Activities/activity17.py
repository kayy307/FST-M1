import pandas
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}
sheet = pandas.DataFrame(data)
print(sheet)
sheet.to_csv("Credentials.csv", index=False)