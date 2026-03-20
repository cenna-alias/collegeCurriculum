# Add 'ing' or 'ly' at the end of a string
s = input("Enter a string: ")

if len(s) >= 3:
    if s.endswith('ing'):
        s += 'ly'
    else:
        s += 'ing'

print("Modified string:", s)
