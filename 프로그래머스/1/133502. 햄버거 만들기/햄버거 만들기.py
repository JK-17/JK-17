
def solution(ingredient):
    answer = 0
    stack = []
    
    for i in ingredient:
        stack.append(i)
        
        if [1,2,3,1] == stack[-4:]:
            for _ in range(4):
                stack.pop()
            answer += 1
    return answer