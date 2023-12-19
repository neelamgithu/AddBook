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
         
    }
    }