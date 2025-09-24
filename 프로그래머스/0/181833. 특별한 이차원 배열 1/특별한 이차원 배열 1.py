def solution(n):
    answer = []
    for i in range(n):
        temp = []
        for j in range(n):
            if j == 0:
                if i == 0:
                    temp.append(1)
                else:
                    temp.append(0)
            else:
                temp.append(1 if i == j else 0)
        answer.append(temp)
    return answer