class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack = new Stack();
      Map<Character, Character> map = new HashMap();
      map.put(')', '(');
      map.put(']', '[');
      map.put('}', '{');

      for (int i = 0; i < s.length(); i++) {
         Character c = s.charAt(i);
         if (!stack.isEmpty()) {
            if (map.containsKey(c) && stack.peek() == map.get(c)) {
               stack.pop();
            } else {
               stack.push(c);
            }
         } else if (map.containsKey(c)) {
            return false;
         } else {
            stack.push(c);
         }
      }

      return stack.isEmpty();
   }
}
