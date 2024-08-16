public class Main {

    public static void main(String[] args) {

        for (int i =1; i<= 5; i++){
            LPAStudent s = new LPAStudent("S9230"+i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "carol";
                case 3 -> "Tim";
                case 4 -> "hary";
                case 5 -> "lissa";
                        default -> "Anonymouse";
                    },
                    "05/11/1985",
                    "Java masterclass");
            System.out.println(s);

        }
    }
}
