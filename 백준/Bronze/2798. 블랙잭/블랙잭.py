from itertools import combinations

N, target = map(int, input().split())
arr = sorted(list(map(int, input().split())))
answer = 0
for unit in combinations(arr, 3):
    if answer < sum(unit):
        if sum(unit) <= target:
            answer = sum(unit)

print(answer)