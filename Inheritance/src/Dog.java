public class Dog extends Animal {

    private String earShape;
    private String tailShape;


    public Dog(){
        super("Mut","big",200);
    }

    public Dog(String type,double weight){
        this(type,  weight,"Perky","curled");
    }

    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight<15 ?  "small":(weight<35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void noise(){
        if (type == "wolf"){
            System.out.print("ow woooo!");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
       // System.out.println("dogs walk,run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print(" woof! ");
    }
    private void run(){
        System.out.print(" dog running ");
    }
    private void walk(){
        System.out.print(" dog walking ");
    }
    private void wagTail(){
        System.out.print(" tail wagging ");
    }


}
