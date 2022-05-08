public class Main {

    /**
     *
     * # The syntax to write a regex expression class is []. Inside the square braces, you can put multiple regex
     *   patterns. If you put multiple patterns, then you need to separate the patterns by a '|' (Pipe) character.
     *
     *   For example, [pattern1 | pattern2 | pattern3]
     *
     *
     * # trim() removes the leading (at the beginning of a string)and trailing (at the end of a string) white spaces
     *   from a string.
     *
     *
     * # Underscore(_) is considered as an alphanumeric character. That is why we need to replace it as well.
     *
     *
     * # Time Complexity O(n).
     *
     */

    public static boolean isPalindrome(String s) {
        if(s.length() == 0)
            return false;

        if (s.length() == 1)
            return true;

        String refinedStr = s.replaceAll("[\\s|\\W|_]", "").toLowerCase().trim();

        int first = 0;
        int last = refinedStr.length()-1;

        while(first < last){
            if (refinedStr.charAt(first) != refinedStr.charAt(last))
                return false;
            first++;
            last--;
        }
        return true;
    }


    // driver method
    public static void main(String[] args) {

        String s1 = " ";
        String s2 = "a";
        String s3 = "radar";
        String s4 = "raar";
        String s5 = "ab_a";
        String s6 = "A man, a plan, a canal: Panama";
        String s7 = "A man, a plan, a canal: Panama3";
        
        System.out.println(isPalindrome(s5));
    }
}