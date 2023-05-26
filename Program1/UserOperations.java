package Program1;

import java.sql.*;
import java.util.Scanner;

public class UserOperations {
    static Connection con;

    static {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1emj9", "root", "Dadu@1699");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void addUser(String name, String pswd, int age, int cno, String city) {
        Statement stsmt = null;

        String query = "insert into user_info(user_name, user_pswd, user_age, user_cno, user_city) values('" +name+ "','" +pswd+ "', " +age+ ", " +cno+ ", '" +city+ "')";

        try {
            stsmt = con.createStatement();
            int count = stsmt.executeUpdate(query);
            System.out.println(count + " User Adding Done..!!");
            System.out.println("User added Successfully ...");
            System.out.println("..........Thank-you......");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void displayName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the User Name...");
        String Uname = sc.next();
        String query = "select * from user_info where user_name = '"+Uname+"'";

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("Following are the Student Details >>>>>>>>>>>> ");
                System.out.println("Student ID         :- " + rs.getInt(1));
                System.out.println("Student Name       :- " + rs.getString(2));
                System.out.println("Student Pass       :- " + rs.getString(3));
                System.out.println("Student Age        :- " + rs.getInt(4));
                System.out.println("Student ContactNo  :- " + rs.getInt(5));
                System.out.println("Student City       :- " + rs.getString(6));


                System.out.println("===============xxxxxxx---xxxxxx==============");
            } else {
                System.out.println("Name  not Found...");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }


}
