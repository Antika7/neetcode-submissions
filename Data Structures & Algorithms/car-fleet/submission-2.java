

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int[][] pairs = new int[position.length][2];

        Stack<Double> stack = new Stack<>();

        for(int i=0; i<position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        for(int i=0; i<position.length; i++) {

            // when stack is empty we will insert a value
            if(stack.isEmpty()) {
                stack.push((double)(target-pairs[i][0])/pairs[i][1]);
                // System.out.println("i = "+ i);
                // System.out.println(stack);
                continue;
            }
            
            //saving top of stack before adding new value
            double val = stack.peek();

            //inserting new value to stack
            stack.push((double)(target-pairs[i][0])/pairs[i][1]);

            //checking if new time is lesser than top of stack -> then considering part of same fleet
            if(!stack.isEmpty() && val>=((double)(target-pairs[i][0])/pairs[i][1])) {
                stack.pop();
                // System.out.println("val = "+val+" popped");
            }

            // System.out.println("i = "+ i);
            // System.out.println(stack);

        }

        return stack.size();

    }
}
