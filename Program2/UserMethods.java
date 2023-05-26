package Program2;

import java.sql.*;

public class UserMethods {
    static Connection con;
    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1emj9", "root", "Dadu@1699");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void countCity() {
        Statement stmt;
        ResultSet rs;
        String query = "select user_city, user_name, count(*), product_category from user_info group by user_city";

        try {
            stmt= con.createStatement();
            rs = stmt.executeQuery(query);
            System.out.println("Query Displayed Successfully....");
            while (rs.next()) {
                System.out.print("City   :- " + rs.getString(1));
                System.out.print("Name :- " +rs.getInt(2));
                System.out.println("Count  :- " + rs.getString(3));
            }
        }
        catch (
                SQLException e) {
            System.out.println(e);
        }
    }

    public void order() {
        Statement stmt;
        ResultSet rs;
        String query = "select * from user_info order by (user_name)desc";

        try {
            stmt= con.createStatement();
            rs = stmt.executeQuery(query);
            System.out.println("Query Displayed Successfully....");

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}


