def solution(cards1, cards2, goal):
    answer = ''
    
    for i in goal:
        if len(cards1) != 0 and i == cards1[0]:
            del cards1[0]
            continue
        
        if len(cards2) != 0 and  i == cards2[0]:
            del cards2[0]
            continue
            
        return 'No'
        
    return 'Yes'