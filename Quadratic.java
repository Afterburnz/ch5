import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = in.nextInt();
		System.out.print("Enter b: ");
		int b = in.nextInt();
		System.out.print("Enter c: ");
		int c = in.nextInt();
		
		double discriminant = Math.pow(b,2) - 4*a*c;
		double solution1 = (-b + Math.sqrt(discriminant)) / 2*a;
		double solution2 = (-b - Math.sqrt(discriminant)) / 2*a;
		
		if (discriminant < 0) {
		System.out.println("Discriminant can't be negative");
		} else if (a == 0) {
		System.out.println("Denominator can't be zero");
		} else {
			if (discriminant == 0) {
			System.out.println("One solution: x = " + solution1);
			} else {
			System.out.println("Two solutions: x = " + solution1 + ", " + solution2);
		} 
		
		}
	}
}
