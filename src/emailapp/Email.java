package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // constructor for first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("E-MAIL CREATED: " + this.firstName + " " + this.lastName);

        // call method for the dept, return dept
        this.department = setDepartment();
        System.out.println("DEPARTMENT SET: " + this.department);

        // call method to generate password;
        this.password = randomPassword(this.defaultPasswordLength);
        System.out.println("YOUR PASSWORD IS: " + this.password);

    }

    // ask for department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES:");
        System.out.print("""
                1 - Sales
                2 - Development
                3 - Accounting
                0 - None
                """);
        System.out.print("Enter department code: ");

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
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-=";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }
    // set mailbox capacity

    // set alternate email

    // change password

}

