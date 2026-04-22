class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seem = set()
        
        for n in nums:
            if n in seem:
                return False
            seen.add(n)
        return false