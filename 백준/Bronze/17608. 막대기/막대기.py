import sys

input = sys.stdin.readline
N = int(input())
li = [int(input()) for _ in range(N)]

ans = [0]
for i in reversed(li):
    if ans[len(ans)-1] < i:
        ans.append(i)

print(len(ans)-1)