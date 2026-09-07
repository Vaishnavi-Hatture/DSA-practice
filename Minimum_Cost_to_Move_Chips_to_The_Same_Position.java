public class Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }

}
