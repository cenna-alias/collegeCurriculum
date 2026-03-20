# Sort a dictionary by key in ascending and descending order
d = {2: "b", 1: "a", 3: "c"}

asc = dict(sorted(d.items()))
print("Ascending order:", asc)

desc = dict(sorted(d.items(), reverse=True))
print("Descending order:", desc)
