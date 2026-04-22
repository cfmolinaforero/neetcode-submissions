class Solution {
    static Character complement(Character c) {
      switch (c) {
         case '(':
            return ')';
         case ')':
            return '(';
         case '[':
            return ']';
         case ']':
            return '[';
         case '{':
            return '}';
         case '}':
            return '{';
         default:
            return '!';
      }
   }

   static boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();

      for (Character c : s.toCharArray()) {
         if (!stack.isEmpty() && stack.peek() == complement(c))
            stack.pop();
         else
            stack.add(c);
      }

      if (stack.size() > 0)
         return false;

      return true;
   }
}
