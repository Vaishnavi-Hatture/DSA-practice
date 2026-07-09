import java.util.ArrayList;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
   
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + k;
            ans.add(0, sum % 10);
            k = sum / 10;
        }

        while (k > 0) {
            ans.add(0, k % 10);
            k /= 10;
        }

        return ans;
    }
}

