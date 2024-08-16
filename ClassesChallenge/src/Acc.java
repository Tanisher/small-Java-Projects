public class Acc {

    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Acc(){
        this(12,2000,"Sire","lawa@gmail",785);
        System.out.println("Empty constructor called");

    }

    public Acc(int accountNumber, int accountBalance, String customerName, String email, int phoneNumber){
        System.out.println("constructor with parameters now active");
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }


    public Acc(String customerName, String email, int phoneNumber) {
        this(123,400,"Sire","lawa@gmail",787);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposits(int amount){
        accountBalance = accountBalance+ amount;
        System.out.println("dear "+customerName+" account number "+accountNumber+" tell "+phoneNumber+" email "
                            + email+" your account balance is now "+ accountBalance);
    }
    public void withdrawal(int amount){
        if ((accountBalance - amount) < 0 ){
            System.out.println("dear "+customerName+" account number "+accountNumber+" tell "+phoneNumber+" email "
                    + email+" your account balance is  "+ accountBalance);
            System.out.println("you cant make the withdrawal -- insufficient funds");
        }else {
            System.out.println("dear "+customerName+" account number "+accountNumber+" tell "+phoneNumber+" email "
                    + email);
            System.out.println("your new balance is $"+ (accountBalance-amount));
        }

    }
}
