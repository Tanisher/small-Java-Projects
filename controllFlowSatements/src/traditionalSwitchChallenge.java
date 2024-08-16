public class traditionalSwitchChallenge {

    public static String getNetoValue(char Z){
        switch (Z) {
            case 'A':
                System.out.println("the letter " + Z + " Able");
                break;
            case 'B':
                System.out.println("the letter " + Z + " Baker");
                break;
            case 'C':
                System.out.println("the letter " + Z + " Charlie");
                break;
            case 'D':
                System.out.println("the letter " + Z + " Dog");
                break;
            case 'E':
                System.out.println("the letter " + Z + " Easy");
                break;
            default:
                System.out.println("the letter " + Z + " was not found");
                break;
        }
        return "";
    }
    public static void main(String[] args) {

        char Z= 'k';
        getNetoValue(Z);
    }

}
