/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Tables {

    public static void main(String[] args) {
        try {
//            String UserTable = "create table appuser(id int AUTO_INCREMENT primary key,userRole varchar(100),name varchar(200),dob varchar(10),email varchar(200),mobilenumber varchar(10),username varchar(100),password varchar(200),address varchar(200),UNIQUE (email))";
//            String adminDetails = "insert into appuser(userRole,name,dob,email,mobilenumber,username,password,address) values('Admin','Admin','11-11-2011','admin@gmail.com','1234567890','admin','12345','pune')";
//            String adminDetails = "insert into user(name,email,mobilenumber,address,password,securityquestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What is your favourite fruit?','orange','true')";
//            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
//            String medicineTable = "create table medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueID varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)";
            String billTable = "create table bill(id int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint(200),generatedBy varchar(50))";
//            DBOperation.setDataorDelete(UserTable, "appuser table created Successfully");
//            DBOperation.setDataorDelete(adminDetails, "Admin details added Successfully");
//            DBOperations.setDataorDelete(adminDetails, "Admin details added Successfully");
//            DBOperations.setDataorDelete(categoryTable, "Category table created Successfully");
//            DBOperation.setDataorDelete(medicineTable, "medicine table created Successfully");
            DBOperation.setDataorDelete(billTable, "Bill table created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
