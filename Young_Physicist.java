import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1=0 ,s2=0 ,s3 = 0;
        for(int i=0 ; i<n ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            s1+=x;
            s2+=y;
            s3+=z;
        }
        if(s1 ==0 && s2== 0 && s3==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
