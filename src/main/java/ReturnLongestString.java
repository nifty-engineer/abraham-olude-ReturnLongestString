
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){

        int longest = Integer.MIN_VALUE;
        String longestString = "";

        for(int i = 0; i < arr.length; i++) {
            String currentString = arr[i];

            if (currentString.length() > longest) {
                longest = currentString.length();
                longestString = currentString;
            }
        }

        return longestString;
    }
}
