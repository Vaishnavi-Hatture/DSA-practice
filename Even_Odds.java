import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long m = (n + 1) / 2; 

        if (k <= m) {
            System.out.println(k * 2 - 1);
        } else {
            k = k - m;
            System.out.println(k * 2);
        }
    }
}
