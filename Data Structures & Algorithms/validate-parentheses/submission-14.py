class Solution:
    def isValid(self, s: str) -> bool:
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

            # closed bracket
            if not stack: # no open bracket
                return False
            
            if stack[-1] != closed_to_open[c]: # no matching open bracket
                return False
        
            # matching open bracket
            stack.pop()
        
        # if stack still contains values return False
        return not stack