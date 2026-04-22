class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        l = 0
        r = 1

        while r < len(nums):
            if nums[l] != val:
                l += 1
            
            if nums[r] == val:
                r += 1
            else:
                nums[l] = nums[r]

        return l + 1