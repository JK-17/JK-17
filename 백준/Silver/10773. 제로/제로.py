import sys

input = sys.stdin.readline
N = int(input())
stack = []

for _ in range(N):
    a = int(input())
    if a:
        stack.append(a)
    else:
        stack.pop()

print(sum(stack))