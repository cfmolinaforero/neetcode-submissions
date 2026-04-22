class Solution:
    # 2 ptr technique
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0 # write ptr

        for i in range(len(nums)): # scanning ptr
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1
        
        return k