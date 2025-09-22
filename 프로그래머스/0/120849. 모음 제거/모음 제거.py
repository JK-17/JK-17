def solution(my_string):
    data = ['a', 'e', 'i', 'o', 'u']
    answer = ''
    for s in my_string:
        if s not in data:
            answer += s
    
    return answer