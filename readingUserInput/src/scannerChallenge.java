import java.util.Scanner;

public class scannerChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =  1;
        int sum = 0;

        while (count < 6){
            System.out.println("enter number #"+count);
            String num = scanner.nextLine();
            try {
            int number = Integer.parseInt(num);
                sum = sum + number;
                count++;
            }catch (NumberFormatException n){
                System.out.println("Enter a valid number");
            }
        }
        System.out.println("the sum of your numbers is "+sum);
    }
}
