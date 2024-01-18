def twoSum(nums, target):
    for i in range(0, len(nums)):
        num1 = nums[i]
        new.remove(num1)
        for j in range(0, len(new)):
            if num1 + new[j] == target:
                sol.append(num1)
                sol.append(new[j])
            else:
                pass
    return sol


nums = [2, 7, 11, 15]
target = 18
new = []
sol = []

for i in range(0, len(nums)):
    new.append(nums[i])

print("nums : ", nums)
print("new : ", new)
twoSum(nums, target)
print(sol)

