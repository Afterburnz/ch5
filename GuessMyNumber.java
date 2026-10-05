import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class GuessMyNumber {
	
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
		System.out.println("Can you guess what it is?");
		Scanner in = new Scanner(System.in);
		System.out.print("Type a number: ");
        int guess = in.nextInt();        
        if (guess == number) {System.out.println("You win");}
        if (guess > number) {
			System.out.println("Too big");
			System.out.print("Type another number: ");
			guess = in.nextInt();
			if (guess > number){
				System.out.println("Too big");
				System.out.print("Type another number: ");
				guess = in.nextInt();	
				if (guess > number || guess < number) {
					System.out.println("You fail, the number was " + number);
				} 
			} else {
				System.out.println("Too small");
				System.out.print("Type another number: ");
				guess = in.nextInt();
				if (guess < number || guess > number) {
					System.out.println("You fail, the number was " + number);
				}        
			}

	}	else {
		System.out.println("Too small");
		System.out.print("Type another number: ");
		guess = in.nextInt();
			if (guess < number){
				System.out.println("Too small");
				System.out.print("Type another number: ");
				guess = in.nextInt();	
				if (guess > number || guess < number) {
					System.out.println("You fail, the number was " + number);
				} 
			} else {
				System.out.println("Too big");
				System.out.print("Type another number: ");
				guess = in.nextInt();
				if (guess < number || guess > number) {
					System.out.println("You fail, the number was " + number);
				}        
			}
	}
		
}
}
