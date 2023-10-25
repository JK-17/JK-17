answer = []
def isEmpty(stack):
    answer.append(1 if (len(stack) == 0) else 0)
def push(stack, X):
    stack.append(X)
def size(stack):
    answer.append(len(stack))
def top(stack):
    if(len(stack) == 0):
        answer.append(-1)
    else:
        answer.append(stack[-1])
def pop(stack):
    if (len(stack)== 0):
        answer.append(-1)
    else:
        answer.append(stack.pop())

N = int(input())
stack = []

for _ in range(N):
    str1 = input()
    if(str1.find('push') != -1):
        arr = str1.split(' ')
        push(stack, int(arr[1]))
    elif(str1.find('top') != -1):
        top(stack)
    elif(str1.find('size') != -1):
        size(stack)
    elif(str1.find('empty') != -1):
        isEmpty(stack)
    elif(str1.find('pop') != -1):
        pop(stack)

for i in range(len(answer)):
    print(answer[i])
