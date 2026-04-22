class Solution:
    # 1 2 2 4 5 5
    # 1 2 4 5 2 5
    # k = 4
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 0
        r = 0
        for n in nums:
            if nums[l] == nums[r]:
                r += 1
            else:
                l += 1
                r += 1
        
        return l + 1