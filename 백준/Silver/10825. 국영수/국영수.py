N = int(input())
answer = []
for _ in range(N):
    answer.append(input().split())

answer.sort(key = lambda x: (-int(x[1]), int(x[2]), -int(x[3]), x[0]) )

for i in range(N):
    print(answer[i][0])