//Write a user defined exception class to authenticate the user name and password.


import java.util.Scanner;

public class authentication {

    public static void main(String[] args) {
    	System.out.println("Merin Magi Telson");
	System.out.println("23MCA043");
	System.out.println("15/04/2024");
        String username = "Merin";
        String password = "Maggie";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username");
        String u1 = sc.nextLine();
        System.out.println("Enter the Password");
        String u2 = sc.nextLine();
        try {
            if ((u1.equals(username)) && (u2.equals(password))) {
                System.out.println("Acess Granted");
            }
            else  {
                throw  new credentialexception("Invalid Credentials");
            }
        }
        catch (credentialexception e){
            System.out.println(e.getMessage());

        }


}}
