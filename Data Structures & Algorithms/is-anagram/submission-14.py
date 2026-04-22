class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # base case - given they should have exact same chars
        if len(s) != len(t):
            return False

        sChars = {}
        for c in s:
            sChars[c] = sChars.get(c, 0) + 1
        
        tChars = {}
        for c in t:
            tChars[c] = tChars.get(c, 0) + 1

        return sChars == tChars