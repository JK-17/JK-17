def solution(arr, k):
    
    return odd(arr, k) if k % 2 else even(arr, k)

def even(arr, k):
    return [i+k for i in arr]

def odd(arr, k):
    return [i * k for i in arr]