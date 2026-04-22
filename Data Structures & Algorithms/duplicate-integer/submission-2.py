# class Solution:
#     def hasDuplicate(self, nums: List[int]) -> bool:
        
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        set = set()
        
        for n in nums:
            if n in set:
                return False
            set.add(n)
        return false