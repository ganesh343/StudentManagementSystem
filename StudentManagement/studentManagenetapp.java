package StudentManagement;

import java.util.Scanner;

public class studentManagenetapp {
    public static void main(String[] args){
//        students stu = new students();
        //ask how many users that needs to be added
        System.out.println("Enter number of students: ");
        Scanner in = new Scanner(System.in);
        int numOfStud = in.nextInt();
        students[] stud = new students[numOfStud];

        //create n number of student
        for (int n = 0; n < numOfStud; n++) {
            stud[n] = new students();
            stud[n].enroll();
            stud[n].payTuition();
            System.out.println(stud[n].toString());
        }

    }
}