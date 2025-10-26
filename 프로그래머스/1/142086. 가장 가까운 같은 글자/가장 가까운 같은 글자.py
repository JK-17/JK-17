def solution(s):
    answer = []
    hashMap = {}
    
    for index, char in enumerate(s):
        if hashMap.get(char) == None:
            answer.append(-1)
        else:
            hash_index = hashMap[char]
            answer.append(index - hash_index)
            
        hashMap[char] = index            
    
    return answer