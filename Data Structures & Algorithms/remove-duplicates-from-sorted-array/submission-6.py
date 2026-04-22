class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) <= 1:
            return nums
        
        l = 0
        for r in range(1, len(nums)):
            if nums[l] != nums[r]:
                l += 1
                nums[l] = nums[r]

        return l+1