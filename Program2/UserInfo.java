package Program2;

import Program1.UserOperations;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserMethods Muser = new UserMethods();

        System.out.println(" Select your choice...");
        System.out.println("1: City wise count of users");
        System.out.println("2: Display users in descending order");
        int choice = sc.nextInt();

        if (choice == 1) {
            Muser.countCity();
        } else if (choice == 2) {
          //  Muser.Order();

        }

    }
}
