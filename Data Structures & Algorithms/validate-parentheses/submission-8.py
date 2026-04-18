class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        openBrackets = ['(', '[', '{']
        closedToOpen = {
            ')': '(',
            ']': '[',
            '}': '{',
        }

        for c in s:
            if c in openBrackets:
                stack.append(c)
            elif stack and stack[-1] == closedToOpen[c]:
                stack.pop()
            else:
                return False

        if stack:
            return False

        return True