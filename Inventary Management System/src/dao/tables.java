/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahesh
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
//          st.executeUpdate("create table appuser(appuser_pk int auto_increment primary key,userrole varchar(50),name varchar(200),mobileno varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(50))");
//          st.executeUpdate("insert into appuser(userrole,name,mobileno,email,password,address,status) values ('SuperAdmin','Admin',9164087654,'admin@gmail.com','admin','India','Active' )");
//          st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key,name varchar(200))");
//           st.executeUpdate("create table product(product_pk int AUTO_INCREMENT primary key,name varchar(200),quantity int,price int,description varchar(500),category_fk int)");
//           st.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key,name varchar(200),MobileNumber varchar(50),Email varchar(200))");
            st.executeUpdate("create table orderDetails(order_pk int AUTO_INCREMENT primary key,orderId varchar(200),customer_fk int , orderDate varchar(200),totalPaid int)");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {

            }
        }
    }

}
