class Solution:
    def isValid(self, s: str) -> bool:
        # base case - if odd length then there's a missing pair
        if len(s) % 2 == 1:
            return False

        stack = []
        # open_brackets = ['(', '[', '{']
        closed_to_open = {
            ')': '(',
            ']': '[',
            '}': '{',
        }

        for c in s:
            if c not in closed_to_open:
                stack.append(c)
            elif stack and stack[-1] == closed_to_open[c]:
                stack.pop()
            else:
                return False

        if stack:
            return False

        return True