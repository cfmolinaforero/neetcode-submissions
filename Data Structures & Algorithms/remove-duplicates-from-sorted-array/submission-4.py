class Solution:
    def removeDuplicates(self, nums: List[int]) -> List[int]:
        if len(nums) <= 1:
            return nums
        
        l = 0
        for r in range(1, len(nums)):
            # if same value
            if nums[l] != nums[r]:
                l += 1
        return l