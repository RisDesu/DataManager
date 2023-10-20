/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import common.Validation;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DataList {
    
    private static final Scanner in = new Scanner(System.in);
    private static final String PHONE_VALID = "^[0-9]{10}$";
    private static final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
    
    public String checkInputPhone() {
        while (true) {
            System.out.print("Phone number: ");
            String phoneNumber = in.nextLine().trim();

            try {
                if (!phoneNumber.matches(PHONE_VALID)) {
                    Long.parseLong(phoneNumber); // Kiểm tra xem có phải là số nguyên không
                    System.err.println("Phone number must be exactly 10 digits");
                    return phoneNumber;
                }
            } catch (NumberFormatException ex) {
                System.err.println("Phone number must be number");
            }
        }
    }

    public String checkInputDate() {
        while (true) {
            System.out.println("Date: ");
            try {
                
                String dateCheck = Validation.checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                return dateCheck;
            } catch (ParseException ex) {
              //  System.out.print("Date: ");
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }

    public String checkInputEmail() {
        while (true) {
            String emailCheck = Validation.checkInputString();
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.out.println("Email: "); emailCheck = in.nextLine();
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }

}

