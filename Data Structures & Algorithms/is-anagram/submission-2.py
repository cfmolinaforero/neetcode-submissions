class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        my_map1 = dict()
        my_map2 = dict()

        for c in s:
            my_map1[c] = my_map1.get(c, 0) + 1

        for c in t:
            my_map2[c] = my_map2.get(c, 0) + 1

        return my_map1 == my_map2