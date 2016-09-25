import java.util.Scanner;


public class Zork {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Would you rather be able to fly are run at super speed?");
		
		String answer = "";
		while(!answer.equals("fly") && !answer.equals("super speed")){
		answer = scan.nextLine();
		switch(answer){
		case "fly":
			System.out.println("Well that would be nice wouldn't it. To bad you cant do that.");
			break;
		case "super speed":
			System.out.println("Well that would be nice wouldn't it. To bad you cant do that.");
			break;
		default:
			System.out.println("Not an option.");
		}
		}
		
		System.out.println("Insert a number between 1 and 10");
		String answer2 = "";
		while(!answer2.equals("7")){
		answer2 = scan.next();
		switch(answer2){
		case "7":
			System.out.println("Good, now guess the password.");
			break;
		default:
			System.out.println("Wrong!");
			break;
		}
		}
		
		String answer3 = "";
		while(!answer3.equals("password")){
			answer3 = scan.next();
			switch(answer3){
			case "password":
				System.out.println("Hmmmmm you're pretty good at this.");
				break;
			default:
				System.out.println("Incorrect!");
				break;
			}
		}
	}
		
		
		}
	
