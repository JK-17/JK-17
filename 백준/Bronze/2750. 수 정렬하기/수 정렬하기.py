N = int(input())
answer = []
for _ in range(N):
    answer.append(int(input()))

answer.sort()

for i in range(N):
    print(answer[i])