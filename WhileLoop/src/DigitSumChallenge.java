public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234));
        System.out.println(getEvenDigitSum(1));
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number < 0){
            return -1;
        }
        for (int i =number; i >0; i=i/10){
            int lastdigit = i%10;
            if (lastdigit % 2 == 0){
                sum = sum + lastdigit;
            }
        }
        return sum;
    }

}
