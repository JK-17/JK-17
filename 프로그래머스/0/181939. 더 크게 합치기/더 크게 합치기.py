def solution(a, b):
    answer = 0
    ab = str(a) + str(b)
    bc = str(b) + str(a)
    return int(ab) if int(ab) >= int(bc) else int(bc)