def solution(a, b, c):
    all_diff = a + b + c
    some_diff = a**2 + b**2 + c**2
    all_same = a**3 + b**3 + c**3
    
    temp_set = {a, b, c}
    temp_length = len(temp_set)
    if temp_length == 3:
        return all_diff
    elif temp_length == 2:
        return all_diff * some_diff
    elif temp_length == 1:
        return all_diff * some_diff * all_same
    