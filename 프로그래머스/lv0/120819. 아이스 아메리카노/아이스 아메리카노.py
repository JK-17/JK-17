def solution(money):
    many = money // 5500
    left = money - (many*5500)
    answer = [many, left]
    return answer