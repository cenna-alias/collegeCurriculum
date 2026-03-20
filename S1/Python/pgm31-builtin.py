import math, os, datetime, random, statistics, json, sys
s = 10  
nums = [random.randint(1, 100) for _ in range(s)]
area = round(math.pi * 5**2, 2)
stats = {
    "numbers": nums,
    "mean": statistics.mean(nums),
    "max": max(nums),
    "circle_area": area,
    "time": datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S"),
    "cwd": os.getcwd(),
    "python_version": sys.version.split()[0]
}
json_data = json.dumps(stats, indent=1)
print(json_data)