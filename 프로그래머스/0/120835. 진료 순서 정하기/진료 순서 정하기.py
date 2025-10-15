def solution(emergency):
    answer = []
    
    sorted_emer = emergency.copy()
    sorted_emer.sort(reverse=True)
    
    for i in emergency:
        answer.append(sorted_emer.index(i) + 1)
    
    return answer