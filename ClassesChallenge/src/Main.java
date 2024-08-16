import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       // Acc account = new Acc(12345,1000,"Sire","sire@gmail",78655799);
        Acc account = new Acc();
        System.out.println(account.getAccountBalance());
        System.out.println(account.getAccountNumber());

        //account.setAccountNumber(12345);
//        //account.setAccountBalance(1000);
//
//
//        System.out.println("What is your name kind sir? ");
//        String name = scanner.nextLine();
//        account.setCustomerName(name);
//
//        System.out.println("enter your email");
//        String mail = scanner.nextLine();
//        account.setEmail(mail);
//
//        System.out.println("number cell");
//        String cont =scanner.nextLine();
//        int contact = Integer.parseInt(cont);
//        account.setPhoneNumber(contact);

        account.deposits(250);
        account.withdrawal(50);

        Acc Sire = new Acc("Sire","Sire@gmail",787);


    }
}
