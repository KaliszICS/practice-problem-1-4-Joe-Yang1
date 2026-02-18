/**
	* Lesson: Input
	* Author: Joe Yang
	* Date Created: February 9, 2023
	* Date Last Modified: February 17, 2023
	*/

import java.util.Scanner;
public class PracticeProblem {
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
	Scanner input = new Scanner(System.in);
	String nom;
	System.out.print("What is your name: ");
	nom = input.nextLine();
	System.out.println(nom);

	}

	public static void q2() {
		//Write question 2 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a whole number: ");
	int num;
	num = input.nextInt();
	System.out.println(num * 2 + 2);

	}

	public static void q3() {
		//Write question 3 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a radius: ");
	double rad;
	rad = input.nextDouble();
	double circle;
	circle = (2 * 3.14);
	System.out.println(circle * rad);
	
	}

	public static void q4() {
		//Write question 4 code here
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input a first name: ");
	String fname;
	fname = input.nextLine();
	System.out.print("Input a last name: ");
	String lname;
	lname = input.nextLine();
	System.out.print("Input an age: ");
	String age;
	age = input.nextLine();
	String infor;
	infor = (lname  + fname + age);
	System.out.println(infor);
	}

	public static void q5() {
		//Write question 5 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a first name: ");
	String _name;
	_name = input.nextLine();
	System.out.print("Input an age: ");
	int _age;
	_age = input.nextInt();
	int _iq;
	_iq = (_age);
	_age = (_age + 3);
	System.out.println(_name + _age + _iq);
	}

}
