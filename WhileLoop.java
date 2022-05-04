import java.util.Scanner;

public class WhileLoop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name = "";

		while(name.isBlank())
		{
			System.out.print("Enter your name: ");

			name = keyboard.nextLine();
		}

		System.out.println("Hello " + name);
	}
}
