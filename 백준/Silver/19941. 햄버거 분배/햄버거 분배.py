import sys
input = sys.stdin.readline
N, K = map(int, input().split())
data = list(input())
count = 0
for i in range(N):
    if data[i] == "P":
        for j in range(i-K, i+K+1):
            if j < 0 or j > N-1:
                continue
            if data[j] == "H":
                data[j] = ""
                count += 1
                break
print(count)