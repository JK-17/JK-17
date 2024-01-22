import sys

input = sys.stdin.readline

N, K = map(int, input().split())
data = list(map(int, input().split()))
li = [0]
for i in data:
    li.append(li[-1] + i)

for _ in range(K):
    i,j = map(int, input().split())
    print(li[j] - li[i-1])
