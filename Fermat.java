import java.util.Scanner;
public class Fermat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a:");
		double a = in.nextDouble();
		System.out.println("Enter b:");
		double b = in.nextDouble();
		System.out.println("Enter c:");
		double c = in.nextDouble();
		System.out.println("Enter n:");
		double n = in.nextDouble();
		
		if (n > 2 && Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)) {
		System.out.println("Holy smokes, Fermat was wrong!");
		} else {
		System.out.println("No, that doesn’t work.");
		}
	}
}
