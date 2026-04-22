class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sChars = {}
        for c in s:
            sChars[c] = sChars.get(c, 0) + 1
        
        for c in t:
            if c not in sChars:
                return False
            else: 
                sChars[c] = sChars[c] - 1
                if sChars[c] == 0:
                    del sChars[c]

        return True