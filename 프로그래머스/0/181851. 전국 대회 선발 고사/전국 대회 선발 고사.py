def solution(rank, attendance):
    answer = []
    
    for i in range(len(rank)):
        if attendance[i]:
            answer.append((rank[i], i))
            
    answer.sort(key=lambda x:x[0])
    print(answer)
        
    return answer[0][1] * 10000 + 100 * answer[1][1] + answer[2][1]