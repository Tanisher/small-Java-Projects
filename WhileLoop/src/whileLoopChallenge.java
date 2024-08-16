public class whileLoopChallenge {

    public static boolean isEvenNumber(int num){
        return (num % 2==0);
    }
    public static void main(String[] args) {
        int i =4;
        int evenCount = 0;
        int oddCount=0;

        while (i >=0){
            i++;
            if (isEvenNumber(i)==true){
                System.out.println(i);
                evenCount++;
                if (evenCount == 5){
                    break;
                }
            }else{
                oddCount ++;
            }
            if (i>20){
                break;
            }

        }
        System.out.println("even numbers are "+evenCount);
        System.out.println("odd numbers are "+oddCount);
    }
}
