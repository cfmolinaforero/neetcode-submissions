from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # base case
        if not nums:
            return 0 # no unique elements

        l = 0
        for r in range(1, len(nums)):
            if nums[l] != nums[r]:
                l += 1
                nums[l] = nums[r]

        return l + 1