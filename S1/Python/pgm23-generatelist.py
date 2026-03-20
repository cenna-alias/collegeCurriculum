# Generate four-digit numbers in a given range that are perfect squares and have all even digits

start = int(input("Enter start of range: "))
end = int(input("Enter end of range: "))

result = []

for i in range(start, end + 1):
    if 1000 <= i <= 9999:               # Ensure four-digit
        if int(i**0.5)**2 == i:         # Perfect square
            digits = str(i)
            if all(int(d) % 2 == 0 for d in digits):  # All digits even
                result.append(i)

print("Numbers:", result)
