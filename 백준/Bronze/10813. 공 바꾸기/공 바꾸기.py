N, M = map(int,input().split())
arr = []
for i in range(N+1):
    arr.append(i)

for i in range(1,M+1):
    firstIndex, secondindex = map(int, input().split())
    arr[firstIndex], arr[secondindex] = arr[secondindex], arr[firstIndex]

arr.pop(0)
print(*arr)