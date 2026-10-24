class Solution {
    // Days in each month for a non-leap year
    private static final int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    // Convert "MM-DD" to day of year
    private int convertToDay(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int total = day;
        for (int i = 0; i < month - 1; i++) {
            total += daysInMonth[i];
        }
        return total;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int startAlice = convertToDay(arriveAlice);
        int endAlice   = convertToDay(leaveAlice);
        int startBob   = convertToDay(arriveBob);
        int endBob     = convertToDay(leaveBob);

        int start = Math.max(startAlice, startBob);
        int end   = Math.min(endAlice, endBob);

        return (end >= start) ? (end - start + 1) : 0;
    }
}
