import java.util.*;
public class Beautiful_Matrix {
    public static void main(String[] args) {
        int mov=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<5 ; i++){
            for(int j=0 ; j<5 ; j++){
               int x = sc.nextInt();
               if (x==1) {
                    mov =  Math.abs(i-2) + Math.abs(j-2);
               }
            }
        }
        
        System.out.println(mov);
        sc.close();
    }
}
