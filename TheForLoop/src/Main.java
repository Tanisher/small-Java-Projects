public class Main {

    public static void main(String[] args) {

        for (int counter = 1;counter <= 5;counter++){
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <=5.0;rate ++){
            double intrestAmount = calculateInterest(10000,rate);
            System.out.println("10000 at "+rate + "% is "+ intrestAmount);
        }
        for (double rate = 7.5; rate <=10;rate = rate + 0.25){
            double intrestAmount = calculateInterest(100,rate);
            if (intrestAmount > 8.5){
                break;
            }
            System.out.println("100 at "+rate + "% is "+ intrestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return(amount * (interestRate/100));
    }
}
