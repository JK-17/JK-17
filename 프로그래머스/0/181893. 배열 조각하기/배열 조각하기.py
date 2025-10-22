def solution(arr, query):
    answer = arr.copy()
    
    for index, value in enumerate(query):
        
        if index % 2 == 0:
            answer = answer[:value+1]
        else:
            answer = answer[value:]

    return answer