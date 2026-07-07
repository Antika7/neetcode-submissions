class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        ArrayList<Integer> numList = new ArrayList<>();
        // ArrayList<Integer> required = new ArrayList<>();

        for(int i=0; i<numbers.length; i++) {
            numList.add(numbers[i]);
        }

        // for(int i=0; i<numbers.length; i++) {
        //     required.add(target-numbers[i]);
        // }

        int i = 0;

        for(int num : numList) {

            System.out.println("\nFirst number is " + num);
            System.out.println("Required number is " + (target-num));

            System.out.println("\nIs it there in list? " + numList.contains(target-num));
            if(numList.contains(target-num)) {
                result[0] = i+1;
                System.out.println("result[0] : " + (i+1));

                System.out.println("\nPosition of " + (target-num));
                result[1] = numList.indexOf(target-num) + 1;
                System.out.println("result[1] : " + result[1]);
                break;
            }
            i++;
        }

        return result;
        
    }
}
