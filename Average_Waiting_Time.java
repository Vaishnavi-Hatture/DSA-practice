class Average_Waiting_Time {
    public double averageWaitingTime(int[][] customers) {
        long currentTime = 0;
        long totalWaiting = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int time = customer[1];

            currentTime = Math.max(currentTime, arrival);
            currentTime += time;

            totalWaiting += currentTime - arrival;
        }

        return (double) totalWaiting / customers.length;
    }
}