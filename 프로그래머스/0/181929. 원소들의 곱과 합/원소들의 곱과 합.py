def solution(num_list):
    sum_square = sum(num_list) ** 2
    squared_sum = 1
    for i in num_list:
        squared_sum *= i
        
    return 1 if sum_square > squared_sum else 0 