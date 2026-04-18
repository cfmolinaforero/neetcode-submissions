class Solution {
    static Boolean isCloseBracket(Character c) {
      switch (c) {
         case ')':
         case ']':
         case '}':
            return true;
         case '(':
         case '[':
         case '{':
         default:
            return false;
      }
   }

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
         if (!stack.isEmpty() && stack.peek() == complement(c) && isCloseBracket(c))
            stack.pop();
         else
            stack.add(c);
      }

      if (stack.size() > 0)
         return false;

      return true;
   }
}
