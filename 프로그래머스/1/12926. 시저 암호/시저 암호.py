def solution(s, n):
    answer = ''
    
    for i in s:
        answer += change_char(i, n) if i != ' ' else i
        
    return answer

def change_char(ch, n):
    ascii_num = ord(ch)
    for _ in range(n):
        ascii_num += 1

        if ascii_num == 91:
            ascii_num = 65
            
        if ascii_num == 123:
            ascii_num = 97
            
    return chr(ascii_num)