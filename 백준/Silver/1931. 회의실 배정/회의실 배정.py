import sys
input = sys.stdin.readline
N = int(input())
refer = [list(map(int, input().split())) for _ in range(N)]
refer.sort(key=lambda x : [x[1], x[0]])
ans = [refer[0]]
for i in range(N-1):
    if ans[-1][1] <= refer[i+1][0]:
        ans.append(refer[i+1])

print(len(ans))