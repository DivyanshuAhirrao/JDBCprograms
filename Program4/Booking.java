package Program4;

import java.sql.*;
import java.util.Scanner;

public class Booking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity of Tickets...");
        int quantity = sc.nextInt();
        System.out.println("Enter the Price of a Ticket...");
        double price = sc.nextDouble();

        Connection con;
        CallableStatement cstmt;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/1emj9", "root", "Dadu@1699");
            cstmt = con.prepareCall("{?= call bookTicket (?,?)}");

            cstmt.setInt(2,quantity);
            cstmt.setDouble(3,price);

            cstmt.registerOutParameter(1, Types.DOUBLE);

            cstmt.execute();

            System.out.println("The Total Amount is :- "+cstmt.getDouble(1));

        } catch (SQLException e) {
            System.out.println(e);
    }

}}
