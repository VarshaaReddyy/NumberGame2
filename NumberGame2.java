import java.util.Scanner;
public class NumberGame2 {
	public static void guess()
	{
		Scanner s = new Scanner(System.in);
		int a = 1 + (int)(100 * Math.random());
		int b = 10;
		int i, predict;
		System.out.println("A number is chosen between 1 to 100");
		System.out.println("Guess the number within 10 trials:");
	
		    
		
		for (i = 0; i < b; i++) {
			System.out.println("Guess the number:");
			predict = s.nextInt();
			if (a == predict) {
				System.out.println("Congratulations!!! you made it");
				break;
			}
			else if (a > predict && i != b - 1) {
				System.out.println("Oops!! the number you guessed is smalller ");
			}
			else if (a < predict && i != b - 1) {
				System.out.println("Oops!! the number you guessed is greater ");
			}
		}

		if (i == b) {
			System.out.println("ouch!! you are out of trails");

			System.out.println("The number was " + a);
		}
		System.out.println("   your score is: "+i);
		
	}
	
	public static void main(String arg[])
	{

		guess();
	}
}