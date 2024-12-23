height = [4,2,3]
# result = 6
result = 0
def check_common_elevation(array:list) -> int:
    highest_elevation = array[0]
    
    counts = []
    for i in range(len(array)):
        if array[i] not in counts:
            counts.append(array[i])
            c = 0
            for j in range(len(array)):
                if array[i] == array[j]:
                    c += 1
                else:
                    pass
            if c > 1:
                if highest_elevation < array[i]:
                    highest_elevation = array[i]
    return highest_elevation


highest_common_elevation = check_common_elevation(height)
print(highest_common_elevation)
precede_element = height[0]
track_element = height[0]
sum_tank = 0
for m in range(1,len(height) - 1):
    # if m == len(height) - 2 and height[m] > height[m + 1]:
    #     break
    if precede_element > height[m] and height[m] <= highest_common_elevation:
        sum_tank += precede_element - height[m]
        print(f"{precede_element} - {height[m]} and the sum is {sum_tank}")
    if track_element < height[m] and height[m] <= highest_common_elevation:
        track_element = height[m]
        precede_element = track_element
        #print(track_element)

print(sum_tank)