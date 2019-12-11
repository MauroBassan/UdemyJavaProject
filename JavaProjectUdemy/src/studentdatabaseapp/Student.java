package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// constructor: prompt user to enter student's name & year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student's first name: ");
		this.firstName = in.nextLine();

		System.out.println("\nEnter student's last name: ");
		this.lastName = in.nextLine();

		System.out.println("\n 1 Freshman \n 2 Sophomore\n 3 Junior\n 4 Senior \nEnter student's class level: ");
		this.gradeYear = in.nextInt();

		setStudentID();

		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);



	}
	// generate id
	private void setStudentID() {
		//grade level + id
		id++;
		this.studentID = gradeYear + "" + id;	
	}

	// enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {

				break;
			}
		}while (true);
		//System.out.println("Enrolled in: " + courses);
	}

	// view balance pay tuition
	public void viewBalance() {
		System.out.println("Your Balance is: " + tuitionBalance);
	}
	
	// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner in = new Scanner (System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Tnk you for your payment of: " + payment);
		viewBalance();
	}

	// show status
	public String toString() {
		return "Name: " + firstName + " " + lastName + 
				"\nGradeLevel: " + gradeYear +
				"\nStudentID: " + studentID + 
				"\nCourses Enrolled: " + courses + 
				"\nBalance: " + tuitionBalance;		
	}
}
