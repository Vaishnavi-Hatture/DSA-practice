public class Number_of_Students_Unable_to_Eat_Lunch {
    
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0, one = 0;

        for (int s : students) {
            if (s == 0)
                zero++;
            else
                one++;
        }

        for (int s : sandwiches) {
            if (s == 0) {
                if (zero == 0)
                    return one;
                zero--;
            } else {
                if (one == 0)
                    return zero;
                one--;
            }
        }

        return 0;
    }

}
