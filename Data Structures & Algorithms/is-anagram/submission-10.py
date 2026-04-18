class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_set = {}
        t_set = {}

        for c in s:
            s_set[c] = s_set.get(c, 0) + 1

        for c in t:
            t_set[c] = t_set.get(c, 0) + 1

        return s_set == t_set