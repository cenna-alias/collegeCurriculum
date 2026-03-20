# Display future leap years from current year to a final year entered by user. 

from datetime import date

current_year = date.today().year
end = int(input("Enter final year: "))

for year in range(current_year, end + 1):
    if (year % 400 == 0) or (year % 4 == 0 and year % 100 != 0):
        print(year)
