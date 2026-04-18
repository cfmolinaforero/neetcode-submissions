class Solution {
    static int evalRPN(String[] tokens) {
      Stack<Integer> stack = new Stack<>();

      for (int i = 0; i < tokens.length; i++) {
         switch (tokens[i]) {
            case "+":
               stack.push(stack.pop() + stack.pop());
               break;
            case "-":
               int num1 = stack.pop();
               int num2 = stack.pop();
               stack.push(num2 - num1);
               break;
            case "*":
               stack.push(stack.pop() * stack.pop());
               break;
            case "/":
               num1 = stack.pop();
               num2 = stack.pop();
               stack.push(num2 / num1);
               break;
            default:
               stack.push(Integer.parseInt(tokens[i]));
         }
      }

      return stack.pop();
   }
}
