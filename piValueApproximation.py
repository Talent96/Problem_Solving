pi = 0.0
denominator = 1
count = 1

for i in range(200_000):
    if count % 2 == 0:
        pi -= 4 / denominator
        count += 1
        denominator += 2
    elif count % 2 == 1:
        pi += 4 / denominator
        count += 1
        denominator += 2

    print(i, pi)
