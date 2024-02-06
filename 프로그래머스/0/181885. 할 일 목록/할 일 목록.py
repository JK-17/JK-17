def solution(todo_list, finished):
    answer = []
    a = 0
    for i in finished:
        if not i :
            answer.append(todo_list[a])
        a +=1
    return answer