class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        smap = {}
        tmap = {}

        for c in s:
            smap[c] = smap[c] + 1

        for c in t:
            tmap[c] = tmap[c] + 1

        if smap == tmap:
            return True