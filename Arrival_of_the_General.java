import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = -1;
        int min = 101;
        int maxPos = 0;
        int minPos = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
                maxPos = i;
            }

            if (arr[i] <= min) {
                min = arr[i];
                minPos = i;
            }
        }

        int ans = maxPos + (n - 1 - minPos);

        if (maxPos > minPos)
            ans--;

        System.out.println(ans);
        sc.close();
    }
}