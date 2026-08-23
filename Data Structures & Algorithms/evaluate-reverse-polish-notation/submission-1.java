class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            try {
                int tokenNum = Integer.parseInt(token);
                stack.push(tokenNum);
            }
            catch(NumberFormatException e) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch(token) {
                    case "*" : stack.push(num1*num2);
                    break;
                    case "+" : stack.push(num1+num2);
                    break;
                    case "-" : stack.push(num2-num1);
                    break;
                    case "/" : stack.push(num2/num1);
                }
            }
        }

        return stack.pop();

    }
}
