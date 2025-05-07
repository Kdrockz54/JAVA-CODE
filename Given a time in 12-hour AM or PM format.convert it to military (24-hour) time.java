public class TimeConversion {

    public static String timeConversion(String s) {
        // Extract components
        String period = s.substring(8);      // "AM" or "PM"
        int hour = Integer.parseInt(s.substring(0, 2)); // first two characters
        String rest = s.substring(2, 8);     // ":mm:ss"

        if (period.equals("AM")) {
            if (hour == 12) {
                return "00" + rest; // 12AM → 00
            } else {
                return String.format("%02d", hour) + rest;
            }
        } else { // PM
            if (hour == 12) {
                return "12" + rest; // 12PM → 12
            } else {
                return (hour + 12) + rest; // e.g. 1PM → 13
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputTime = sc.nextLine(); // e.g. "07:05:45PM"
        String result = timeConversion(inputTime);
        System.out.println(result);
        sc.close()
