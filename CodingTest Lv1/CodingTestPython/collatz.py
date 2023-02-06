def solution(num):
    answer = 0
    while True:
        if(num==1):
            break
        elif (answer == 500):
            answer = -1
            break
        elif (num % 2 == 0):
            num = num // 2
            answer += 1
        elif (num % 2 == 1):
            num = (num * 3) + 1
            answer += 1
    return answer


print(solution(6))
print(solution(16))
print(solution(626331))