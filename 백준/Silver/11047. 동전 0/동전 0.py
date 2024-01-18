import sys
input = sys.stdin.readline
N, K = map(int,input().split())
li = [int(input()) for _ in range(N)]
count = 0
temp = K
for i in reversed(li):
    if temp == 0:
        break
    count += temp // i
    temp %= i

print(count)


