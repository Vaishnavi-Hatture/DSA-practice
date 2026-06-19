import java.util.ArrayList;

class Keyboard_Row {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> arr = new ArrayList<>();

        for (String word : words) {
            String s = word.toLowerCase();

            String re;

            if (row1.indexOf(s.charAt(0)) != -1) {
                re = row1;
            } else if (row2.indexOf(s.charAt(0)) != -1) {
                re = row2;
            } else {
                re = row3;
            }

            boolean valid = true;

            for (int i = 1; i < s.length(); i++) {
                if (re.indexOf(s.charAt(i)) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                arr.add(word);
            }
        }

        return arr.toArray(new String[0]);
    }
}