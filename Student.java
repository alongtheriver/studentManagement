package studentManagement;

import java.util.Random;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private String major;
	private int studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private int costOfCourse = 546;
	
	// constructor with introduction
	public void Student() {
		Scanner cin = new Scanner(System.in); 
		System.out.println("Please enter the student's first name: ");
		this.firstName = cin.nextLine();
		
		System.out.println("Please enter the student's last name: ");
		this.lastName = cin.nextLine(); 
		
		System.out.println("What is your major?");
		this.major = cin.nextLine(); 
		
		System.out.println("Welcome, " + firstName + " " + lastName + " Your major is: " + major);
		
		studentID();
		enroll();
		
	}  
	
	// getting student ID number
	private void studentID() {
		Random rand = new Random();
		int studentID = Math.abs(rand.nextInt());
		System.out.println("Your student ID number is: " + studentID);
	} 
	
	// enrolling in courses
	private void enroll() {
		do {
			System.out.println("Enter the course to enroll (Q for exit):");
			Scanner cin = new Scanner(System.in);
			String course = cin.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = (tuitionBalance + costOfCourse);
			} 
			else {
				System.out.println("Break");
				break;
			}
		} while(1 != 0);
		
		System.out.println("Enrolled: " + courses);
		System.out.println("Tuition Balance is: " + tuitionBalance);
		
	} 
	
	// Viewing the amount of balance is being payed off
	private void viewBalance() {
		System.out.println("Your balance is $" + tuitionBalance);
	} 
	
	public void payTuition() {
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter the amount of payment:");
		int payments = cin.nextInt();
		tuitionBalance = tuitionBalance - payments;
		System.out.println("Thank you for your payment of $" + payments);
		viewBalance();
		
	} 
	
	// Overview of enrollment
	public void status() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Courses: " + courses);
		System.out.println("Tuition Balance: " + tuitionBalance);
		
	}

}
