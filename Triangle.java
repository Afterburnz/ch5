import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = in.nextInt();
		System.out.print("Enter b: ");
		int b = in.nextInt();
		System.out.print("Enter c: ");
		int c = in.nextInt();
	
		if (a == 0 || b == 0 || c == 0) {
		System.out.println("Lengths can't be zero");
		} else if (a < 0 || b < 0 || c < 0) {
		System.out.println("Lengths can't be negative") ;
		} else {
		if (a >= b+c || b >= a+c || c >= a+b) {
		System.out.println("Can't form a triangle");
		} else {
		System.out.println("Can form a triangle");
		}
		}
	}


}
