N = int(input())

a = 665
count = 0
while(True):
    a += 1
    s = str(a)
    if "666" in s:
        count += 1
        if count == N:
            break

print(a)