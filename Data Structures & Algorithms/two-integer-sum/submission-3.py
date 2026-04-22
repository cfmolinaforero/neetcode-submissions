class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        i = 0
        j = len(nums) - 1

        while i < j:
            sum = nums[i] + nums[j]
            if sum < target:
                i = i + 1
            elif sum > target:
                j = j - 1
            # sum == target
            else:
                return [i, j]