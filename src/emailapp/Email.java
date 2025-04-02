package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // constructor for first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("E-MAIL CREATED: " + this.firstName + " " + this.lastName);

        // call method for the dept, return dept
    }

    // ask for department

    private String setDepartment() {
        System.out.println("Enter the department");
        System.out.print("""
                1 - Sales
                2 - Development
                3 - Accounting
                0 - None""");

        Scanner scanner = new Scanner(System.in);
        int deptChoice = scanner.nextInt();

        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Development";
        } else if (deptChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }

    }

    // generate random password

    // set mailbox capacity

    // set alternate email

    // change password

}

