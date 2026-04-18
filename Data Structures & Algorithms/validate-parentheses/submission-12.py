class Solution:
    def isValid(self, s: str) -> bool:
        # base case - if odd length then there's a missing pair
        if len(s) % 2 == 1:
            return False

        stack = []
        closed_to_open = {
            ')': '(',
            ']': '[',
            '}': '{',
        }

        for c in s:
            # open bracket
            if c not in closed_to_open:
                stack.append(c)
                continue
            
            # closing bracket
            if not stack or stack[-1] != closed_to_open[c]:
                return False

            # completed pair
            stack.pop()

        return not stack