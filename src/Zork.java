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
		answer2 = scan.nextLine();
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
			answer3 = scan.nextLine();
			switch(answer3){
			case "password":
				System.out.println("Hmmmmm you're pretty good at this.");
				break;
			default:
				System.out.println("Incorrect!");
				break;
			}
		}
		
		System.out.println("The door opened. Would you like to go left or right?");
		String answer4 = "";
		while(!answer4.equals("right") && !answer4.equals("left")){
		answer4 = scan.nextLine();
		switch(answer4){
		case "left":
			System.out.println("Now there is a long hallway. Would you like to continue left or turn back?");
			break;
		case "right":
			System.out.println("Now there is another door. Would you like to continue right or turn back?");
			break;
		default:
			System.out.println("Not an option");
			break;
		}
		}
		
		String answer5 = "";
		while(!answer5.equals("continue left") && !answer5.equals("continue right") && !answer5.equals("turn back")){
			answer5 = scan.nextLine();
			switch(answer5){
			case "continue left":
				System.out.println("There is a cute puppy sitting at the end of the hallway");
				break;
			case "continue right":
				System.out.println("The room is dark. You should look around for a light switch");
				break;
			case "turn back":
				
			default :
				System.out.println("Not an option");
				break;
			}
	}
	}
		
		
		}
	
