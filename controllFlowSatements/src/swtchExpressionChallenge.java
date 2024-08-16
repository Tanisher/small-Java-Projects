public class swtchExpressionChallenge {

    public static void printDayOfWeek(int day){
        String dayOfTeWeek = switch(day){
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "invalid day";
        };
        System.out.println(day +"Stands for"+dayOfTeWeek);
    }

    public static void main(String[] args) {
        printDayOfWeek(1);
    }
}
