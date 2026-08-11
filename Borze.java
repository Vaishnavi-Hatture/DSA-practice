import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result="";

        for(int i=0 ; i<s.length(); i++){
            if(s.charAt(i)=='.'){
                result+='0';
            }
            else if(s.charAt(i)=='-' && s.charAt(i+1)=='.'){
                result+='1';
                i++;
            }
            else if(s.charAt(i)=='-' && s.charAt(i+1)=='-'){
                result+='2';
                i++;
            }
        }
        System.out.println(result); 
        sc.close();
    }
}
