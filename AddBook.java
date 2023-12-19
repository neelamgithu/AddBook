import java.util.*;
class Contact{
    
String first_name  ;
    String last_name;
    String address;
    String city;
    String state;
    int zip;
    String phone_number;
    String email;
    public Contact(String first_name, String last_name, String address, String city, String state, int zip,
                    String phone_number, String email) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_number = phone_number;
        this.email = email;

    }
}

public class AddBook {
    // scanner class is used to take input from keyboard file etc
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact> con = new ArrayList<Contact>();
    // creating objects and giving inputs from constructor

    public static void main(String[] args) {
         System.out.println("Welcome to AddressBook");
        ArrayList<Contact> con = new ArrayList<Contact>();

        public static void add_contact() {
           // sc.nextLine();// to avoid /n issue in after taking integer as input
            System.out.println("enter first name ");
            String first_name = sc.nextLine();
            System.out.println("enter last name ");
            String last_name = sc.nextLine();
            System.out.println("enter address ");
            String address = sc.nextLine();
            System.out.println("enter  city");
            String city = sc.nextLine();
            System.out.println("enter  state");
            String state = sc.nextLine();
            System.out.println("enter zip-code");
            int zip = sc.nextInt();
            //sc.nextLine();
            System.out.println("enter phone number");
            String phone_number = sc.nextLine();
            System.out.println("enter email");
            String email = sc.nextLine();
            Contact cont = new Contact(first_name, last_name, address, city, state, zip, phone_number, email);///class ob created 
             con.add(cont);//built in method 
         
    }
    }