import java.util.*;
import java.lang.*;
public class Email {
    // Encapsulate variables for privacy we make them private
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private String companySuffix= "google.com";
    private String email;

    //Constructor to receive the firstname and lastname
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=setDepartment();
        this.password=randomPassword();
        //System.out.println(department);
        //System.out.println(password);
        this.email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
           }

    //Ask for the department
    private String setDepartment(){
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner sc=new Scanner(System.in);
        int dept_choice=sc.nextInt();
        if(dept_choice==1){return "Sales";}
        else if(dept_choice==2){return "Dev";}
        else if(dept_choice==3){return "Acc";}
        else{return" ";}
    }

    //Generate a random password
    private String randomPassword(){
        String pass="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
        char[] pass_word=new char[10];
        for(int i=0;i<10;i++){
            int rand=(int)(Math.random()*pass.length()); //It is type casted to int because math.random returns double value
            pass_word[i]=pass.charAt(rand);

        }
        return new String(pass_word); //This is for conversion of char array to string
    }

    //Set mailbox capacity
    public void setMailbox(int mailboxCapacity){
        this.mailboxCapacity=mailboxCapacity;
    }

    //Set the alternate email

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }
    //Change the password
    public void setPassword(String password){
        this.password=password;
    }

    public int getMailbox(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String displayInfo(){
        return "Hi "+firstName+ " "+lastName+" Welcome to the company "+
                "\nYour email id is " + email
                +"\n Please adhere to the mailbox capacity " + mailboxCapacity+" mb" +
                "\nHave a nice day!";
    }










}
