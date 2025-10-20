def solution(arr1, arr2):
    if len(arr2) == len(arr1):
        if sum(arr2) == sum(arr1):
            return 0
        return -1 if sum(arr2) > sum(arr1) else 1
    else:
        return -1 if len(arr2) > len(arr1) else 1
    