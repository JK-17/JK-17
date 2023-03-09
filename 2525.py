H,M = map(int,input().split(" "))
spend = int(input())

min = M + spend

while(True):
  if min >= 60:
    H+=1
    min -=60
  else:
    break;
  
if H >= 24:
  H -=24
  
print(H , min)
