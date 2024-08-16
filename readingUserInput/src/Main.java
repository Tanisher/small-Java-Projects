import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, Whats your name ");
        System.out.println("hi " +name+", Thanks for taking the course");

        String dateOfBirth = System.console().readLine("what year were born ? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "so u are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);

       // String name = System.console().readLine("Hi, Whats your name ");
        System.out.println("Hi, whats your name? ");
        String name = scanner.nextLine();

        System.out.println("hi " +name+", Thanks for taking the course");

        //String dateOfBirth = System.console().readLine("what year were born ? ");
        System.out.println("what year were you born? ");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter  year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));

            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed !!! Try again. ");
            }
        }while(!validDOB);

        return "so u are " + age + " years old";
    }
    public static int checkData(int currentYear, String dateOfBirth ){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob<minimumYear)||(dob>currentYear)){
            return -1;
        }
        return (currentYear - dob);
    }
}
