def solution(s):
    
    str_list = s.split(' ')
    answer = []
    for sf in str_list:
        new_word = ""
        for i, c in enumerate(sf):
            if i % 2 == 0:
                new_word += c.upper()
            else:
                new_word += c.lower()
        answer.append(new_word)
    return ' '.join(answer)