class Solution {
    static boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      Map<Character, Character> map = new HashMap<Character, Character>();
      map.put(')', '(');
      map.put(']', '[');
      map.put('}', '{');

      for (Character c : s.toCharArray()) {
         // stack is empty
         if (stack.isEmpty()) {
            // c is a closing bracket
            if (map.containsKey(c))
               return false;
            else
               stack.add(c);
         } else { // stack is not empty
            // closing bracket
            if (map.containsKey(c) && stack.peek() == map.get(c))
               stack.pop();
            else
               stack.add(c);
         }
      }

      if (stack.size() == 0)
         return true;

      return false;
   }
}
