def solution(babbling):
    answer = 0
    
    able_to_speak = ["aya", "ye", "woo", "ma"]
    
    for babble in babbling:
        
        for token in able_to_speak:
            
            if token in babble:
                babble = babble.replace(token, "#")
                print(babble)
                
        if babble.replace("#", '') == "":
            answer += 1
                
    
    return answer