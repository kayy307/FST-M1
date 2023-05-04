import pandas
from pandas import ExcelFile
from pandas import ExcelWriter

data = {
    'FirstName':["Satvik", "Avinash", "Lahri"],
    'LastName':["Shah", "Kati", "Rath"],
    'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
Data_to_write = pandas.DataFrame(data)
writer = ExcelWriter("details.xlsx")
Data_to_write.to_excel(writer,'sheet1', index=False)
writer.save()

