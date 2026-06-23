import java.util.ArrayList;

public class Minimum_Index_Sum_of_Two_Lists {
 
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
       ArrayList<String> arr = new ArrayList<>();
        for(int i=0 ; i<list1.length; i++){
            for(int j=0 ; j<list2.length; j++){
                if(list1[i].equals(list2[j])){
                    int sum = i+j;
                    if(sum<min){
                        min = sum;
                        arr.clear();
                        arr.add(list1[i]);
                    }else if(min == sum){
                        arr.add(list1[i]);
                    }
                }
            }
        }
        return arr.toArray(new String[0]);
}
}
