data = list(map(int, input().split()))
data.sort()

if(data[0]+data[1] > data[2]):
    print(sum(data))
else:
    print(((data[0] + data[1]) * 2)-1)