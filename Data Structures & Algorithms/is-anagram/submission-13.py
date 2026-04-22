class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # base case - given they should have exact same chars
        if len(s) != len(t):
            return False

        sChars = {}
        for c in s:
            sChars[c] = sChars.get(c, 0) + 1
            # if c in sChars:
            #     sChars[c] += 1
            # else:
            #     sChars[c] = 1
        
        tChars = {}
        for c in t:
            if c in tChars:
                tChars[c] += 1
            else:
                tChars[c] = 1

        return sChars == tChars