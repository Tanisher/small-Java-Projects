public class overloadingChallenge {

    public static double convertToCentimeters(int height){
        return height * 2.54;
    }
    public static double convertToCentimeters(int feet,int inches){
        int a = 0;
        a= (feet * 12) + inches;
        return convertToCentimeters(a);
    }
    public static void main(String[]args){
        System.out.println("Your total height in centimeters is " + convertToCentimeters(5,8) + "centimeters");
    }
}
