import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int size = list.size();
                list.add(list.get(size - 1) + list.get(size - 2));

            } else if (op.equals("D")) {
                list.add(list.get(list.size() - 1) * 2);

            } else if (op.equals("C")) {
                list.remove(list.size() - 1);

            } else {
                list.add(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int num : list) {
            sum += num;
        }

        return sum;
    }
}