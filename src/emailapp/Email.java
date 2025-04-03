package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String companySuffix = "thecompany.com";
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // constructor for first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // call method for the dept, return dept
        this.department = setDepartment();

        // call method to generate password;
        this.password = randomPassword(this.defaultPasswordLength);
        System.out.println("YOUR PASSWORD IS: " + this.password);

        // set email
        this.email = this.firstName.toLowerCase().replace(" ","") + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.companySuffix.toLowerCase();
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
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // set alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // change password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + this.firstName + this.lastName
                + "\nCOMPANY EMAIL: " + this.email
                + "\nMAILBOX CAPACITY: " + this.mailboxCapacity;
    }
}

