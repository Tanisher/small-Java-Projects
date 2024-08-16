import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 100000;
        double max =0;
        int count = 1;
        while (count ==1 ) {
            System.out.println("please enter the number enter a character to close the application");
            String number = scanner.nextLine();
            try {
                double num = Double.parseDouble(number);

                if (num >= max) {
                    max = num;
                }
                if (num <= min) {
                    min = num;
                }
            } catch (NumberFormatException e) {
                System.out.println("the maximum number is " + max + "the minimum number is " + min);
                break;
            }
        }
    }
}
