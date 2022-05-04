import java.util.Scanner;

public class CalculationOfTriangleHypotenuse
{
	public static void main(String[] args)
	{
		double firstSide;
		double secondSide;
		double triangleHypotenuse;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter first side of the triangle");
		firstSide = keyboard.nextDouble();

		System.out.println("Enter second side of the triangle");
		secondSide = keyboard.nextDouble();

		triangleHypotenuse = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));
		System.out.println("Triangle h2ypotenuse is " + triangleHypotenuse);
	}
}
