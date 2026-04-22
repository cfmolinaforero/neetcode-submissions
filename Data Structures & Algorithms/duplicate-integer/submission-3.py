class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seem = set()
        
        for n in nums:
            if n in set:
                return False
            set.add(n)
        return false