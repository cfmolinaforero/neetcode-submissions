class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        l = 0
        r = len(nums) - 1

        while l < r:
            if nums[l] != val:
                l += 1
                continue
            if nums[r] == val:
                r -= 1
                continue
            
            nums[l] = nums[r]
            nums[r] = val
            l += 1
            r -= 1

        # return l + 1
        return r - l