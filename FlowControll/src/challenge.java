public class challenge {
    public static void main(String[] args) {
        double d = 20.00;
        double ds = 80.00;
        double a = (d + ds)*100.00;
        System.out.println(a);
        double reminder = a % 40.00;
        System.out.println(reminder);

        boolean check = true;
        if (reminder == 0.00) {
            System.out.println(check);
        }
        String c = (check != false)? "got some reminder":"no reminder present";

    }

}
