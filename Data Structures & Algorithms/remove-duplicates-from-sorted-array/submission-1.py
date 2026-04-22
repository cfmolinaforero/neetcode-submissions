from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 0
        k = 0
        for r in range(1, len(nums)):
            if nums[l] != nums[r]:
                l += 1
                k += 1

        return k