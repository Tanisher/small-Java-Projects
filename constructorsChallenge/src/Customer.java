public class Customer {

    private String name;
    private double limit;
    private String emailAddress;

    public String getName(){
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer(String name, double limit, String emailAddress){
        System.out.println("the first constructor is active");
        this.name= name;
        this.limit = limit;
        this.emailAddress = emailAddress;
        System.out.println("dear "+name+" your email is " +emailAddress+ " your limit is "+ limit);

    }

    public Customer (){
        this("Sire",10.0,"Sire@gmail.com");
    }

    public Customer(String name, String emailAddress) {
        this();
        this.name = name;
        this.emailAddress = emailAddress;
        System.out.println("this is the third constructor");
        System.out.println("dear "+name+" your email is " +emailAddress+ " your limit is "+ limit);
    }
}
