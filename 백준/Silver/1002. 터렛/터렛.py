from math import sqrt

N = int(input())
answer = []

for _ in range(N):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    length = sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)
    diff = abs(r1 - r2)
    if length == 0 and r1 == r2:
        answer.append(-1)
    elif length == r1 + r2 or diff == length:
        answer.append(1)
    elif diff < length < r1 + r2:
        answer.append(2)
    else:
        answer.append(0)

for i in range(N):
    print(answer[i])
