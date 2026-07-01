class Solution {

    public String encode(List<String> strs) {

        // String encoded = "";
        // for(String str : strs) {
        //     encoded = encoded.concat(Integer.toString(str.length())).concat("#").concat(str);
        // }
        // System.out.println("encoded = " + encoded);
        // return encoded;

        //Strings in Java are immutable. Every concat() creates a new string and copies data.

        StringBuilder sb = new StringBuilder();

        for(String str : strs) {
            sb.append(str.length())
            .append("#")
            .append(str);
        }

        System.out.println("encoded = " + sb.toString());
        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<String>();
        String word = "";
        int i = 0;

        while(i<str.length()) {
            
            int j = i;

            while(str.charAt(j) != '#')
            {
                j++;
            }

            System.out.println("i = " + i + " j = " + j + " c = " + str.charAt(j));

            //parse length
            int len = Integer.parseInt(str.substring(i, j));

            System.out.println("len = " + len);

            //extract word
            word = str.substring(j+1, j+1+len);

            decoded.add(word);

            i = j + 1 + len;

        }

        return decoded;
            
    }
}
