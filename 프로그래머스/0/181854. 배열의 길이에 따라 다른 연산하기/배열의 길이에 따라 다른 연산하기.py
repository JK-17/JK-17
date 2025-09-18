def solution(arr, n):
    answer = []
    is_even = len(arr) % 2 == 0
    
    for i in range(len(arr)):
        if is_even:
            if (i+1) % 2 == 0:
                arr[i] += n
        else:
            if (i+1) % 2 == 1:
                arr[i] += n
    return arr