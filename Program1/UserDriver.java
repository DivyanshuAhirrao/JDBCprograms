package Program1;

import java.util.Scanner;

public class UserDriver {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        UserOperations user = new UserOperations();


            System.out.println("------------Welcome to User Interface----------");
            System.out.println("=============================================");
            System.out.println();
            System.out.println("1.) Insert Record");
            System.out.println("2.) Display Record");
            System.out.println("-----------------------------------------");
            System.out.println("Enter your Choice...");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Redirecting......");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Enter the User Name...");
                String name = sc.next();
                System.out.println("Enter the User password...");
                String pswd = sc.next();
                System.out.println("Enter the User Age...");
                int age = sc.nextInt();
                System.out.println("Enter the User Contact Number...");
                int cno = sc.nextInt();
                System.out.println("Enter the User City...");
                String city = sc.next();

                user.addUser(name, pswd, age, cno, city);
            }
            else if (choice == 2) {
                user.displayName();
            }
            else {
                System.out.println("Invalid input...");
            }
      }
}


