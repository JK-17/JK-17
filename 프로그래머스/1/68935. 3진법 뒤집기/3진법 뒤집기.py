def solution(n):
    answer = []
    ternary = ""
    if n == 0:
        ternary = "0"
    else:
        while n > 0:
            ternary = str(n % 3) + ternary
            n //= 3

    
    return int(ternary[::-1], 3)