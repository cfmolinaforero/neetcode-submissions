class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = [None] * len(nums)
        ans = nums + nums

        return ans
        