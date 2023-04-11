bfirst = []
wfirst = []

for i in range(0,8):
  line = input()
  if i % 2 == 0:
    wfirst.append(line)
  else:
    bfirst.append(line)
    
count = 0


for i in range(0,4):
  for j in range(0,8):
    if j % 2 == 0:
      str = wfirst[i]
      if str[j] == 'F':
        count += 1
    else:
      str = bfirst[i]
      if str[j] == 'F':
        count += 1
        
print(count)
