
numbers = set(range(1, 31))
total = 0
for i in numbers:
    if i % 3 == 0:
        total += i
print(total)
