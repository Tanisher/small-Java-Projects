public class Hello {

    public static void main(String[] args) {
       System.out.println("Hello, Sire");

       boolean isAlien = false;
       if (isAlien == false) {
           System.out.println("Ït is not an Alien");
           System.out.println("And i am scared of aliens");
       }

       int topScore = 80;
       if (topScore <= 100){
           System.out.println("you got the high score");
       }

       int secondTopScore = 81;
       if (topScore > secondTopScore && topScore<100){
           System.out.println("Greater than second top score but less than 100");
       }

       if ((topScore > 90) || (secondTopScore <=90)){
           System.out.println("either or both the conditions are true");
       }

       int newValue = 50;
       if (newValue == 50){
           System.out.println("this is true");
       }

       boolean isCar = false;
       if ( isCar == false){
           System.out.println("this is not supposed o happen");
       }

       String makeOfCar = "volswaen";
       boolean isDomestic = makeOfCar == "volswaen"? false:true;

       if (isDomestic){
           System.out.println("This car is domestic to our country");
       }

       String s = (isDomestic)? "This car is domestic" : "This car is not domestic";

       System.out.println(s);
    }
}
