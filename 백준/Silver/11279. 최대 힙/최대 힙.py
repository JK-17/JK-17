import heapq
import sys

input = sys.stdin.readline
N = int(input())
heap = []

for _ in range(N):
    a = int(input())
    if a:
        heapq.heappush(heap, -a)
    else:
        if len(heap):
            print(-(heapq.heappop(heap)))
        else:
            print(0)