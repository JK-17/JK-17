def solution(id_pw, db):
        answer = "login" if id_pw in db else "fail"
        if answer == "fail":
            for data in db:
                if data[0] == id_pw[0]:
                    return "wrong pw"
        return answer