test = [3,5,3,4]
limit = 5
def boat_save(people,limit):
    people.sort()
    start = 0
    end = len(people)-1
    count = 0
    while start <= end:
        if people[start] + people[end] <= limit:
            start += 1
        end -= 1
        count += 1
    return count

def ZeroFilledSubarray(arr):
    n = len(arr)
    count = 0
    for i in range(n):
        for j in range(i,n):
            sum = 0
            for k in range(i,j+1):
                sum += arr[k]
            if sum == 0:
                count += 1
    return count
