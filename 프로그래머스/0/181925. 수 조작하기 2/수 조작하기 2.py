def solution(numLog):
    answer = []
    
    for i in range(len(numLog)-1):
        # 만약 뒤에께 더 크다면 (더했다면)
        if numLog[i] < numLog[i+1]:
            # -1 일때 (1을 더했을때) 
            if numLog[i] - numLog[i+1] == -1:
                answer.append('w')
            # -10일때 (10을 더했을때)
            else:
                answer.append('d')
        # 만약 앞에께 더 크다면
        else:
            # 1일때 (1을 뺏을때)
            if numLog[i] - numLog[i+1] == 1:
                answer.append('s')
        # 10일때 (10을 뺏을때)
            else:
                answer.append('a')
                    
    return "".join(answer)