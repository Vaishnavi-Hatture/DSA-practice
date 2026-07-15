public class Split_a_String_in_Balanced_Strings {
 
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L')
                balance++;
            else
                balance--;

            if (balance == 0)
                count++;
        }

        return count;
    }
}

