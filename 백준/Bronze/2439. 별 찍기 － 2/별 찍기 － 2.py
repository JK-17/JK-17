N = int(input())
blank = ' '
star = '*'
for i in range(1,N+1):
  print((N-i)*blank,i*star, sep='')