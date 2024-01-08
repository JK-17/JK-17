
N = int(input())

for _ in range(N):
    stack = []
    type = False
    sample = input()
    for i in sample:
        if i == "(":
            stack.append("(")
        else:
            if not stack:
                type = True
                break
            stack.pop()

    if stack or type:
        print("NO")
    else:
        print("YES")