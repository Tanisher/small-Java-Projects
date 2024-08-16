public class Main {

    public static void main(String[] args) {

        int value = 1;
//        if (value ==1){
//            System.out.println("value was 1");
//        }else if (value == 2){
//            System.out.println("value was 2");
//        }else {
//            System.out.println("was not 1 or 2");
//        }
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was 3, 4 or a 5");
                System.out.println("actually it was a " + switchValue);
            }
            default -> System.out.println("the value was not i the range of 1 to 5");
        }

        String month = "jkh ";
        System.out.println(month + " is in the "+getQuarter(month)+" quarter");
    }
    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
           default -> {
               String badResponse = month + " is  bad";
               yield badResponse;

           }
        };
    }
}
