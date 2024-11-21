public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int nHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int nMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int nMinutesToAdd = Integer.parseInt(args[1]);

        int nNewTimeInMinutes = (nHours * 60) + nMinutes + nMinutesToAdd;
        nHours = (nNewTimeInMinutes / 60) % 24;
        nMinutes = nNewTimeInMinutes - (nNewTimeInMinutes / 60) * 60;

        System.out.println((nHours < 10 ? "0" + nHours : nHours) + ":" +
                           (nMinutes < 10 ? "0" + nMinutes : nMinutes));
    }
}
