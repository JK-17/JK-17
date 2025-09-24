def solution(s):
    answer = ''
    s_split = s.split(" ")
    for temp in s_split:
        if len(temp) == 0:
            answer += ' '
        else:
            answer += ''.join(temp[0].upper() + temp[1:].lower()) + ' '
    return answer[:-1]