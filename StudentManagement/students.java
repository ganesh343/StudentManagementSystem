package StudentManagement;
import java.util.*;

public class students {
    private String lastName;
    private String firstName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int feeBalance = 0;
    private  static int costPerCourse = 600;
    private static int id = 1000;

    //constructor: prompt user to enter student's name and year
    public students(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student's class year: \n1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior");
        this.gradeYear = in.nextInt();

        setstudentID();
//        System.out.println(lastName + " " + firstName    + " " + gradeYear + " " + studentID);

    }
    //generate ID
    private void setstudentID() {
        id++;
        //grade level + id
        this.studentID =  gradeYear + "" + id;
    }
    //enroll in courses
    public void enroll() {
        //get inside a loop, users hit 0
        do {
            System.out.print("Enter course to enroll(Q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                feeBalance = feeBalance + costPerCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
        System.out.println("EROLLED IN: "+ courses);
//        System.out.println("TUITION BALANCE: " + feeBalance);
    }
    //view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" +feeBalance);
    }
    //pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment amount: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        feeBalance = feeBalance - payment;
        System.out.println("Thanks you for your payment: $"+payment);
        viewBalance();
    }
    //show status
    //Names, courses enrolled, balance
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled: " + courses +
                "\nBalance due $" + feeBalance;
    }
}
