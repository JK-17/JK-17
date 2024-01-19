def solution(s):
    answer = ''
    arr = list(s)
    data = []
    for i in arr:
        data.append(ord(i))
    data.sort(reverse=True)
    for i in data:
        answer += chr(i)
    return answer