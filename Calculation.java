public class Calculation
{
	public static void main(String[] args)
	{
		double firstNumber = 3.265;
		double secondNumber = -20;

		double maxNumber = Math.max(firstNumber, secondNumber);

		double minNumber = Math.min(firstNumber, secondNumber);

		double absoluteNumber = Math.abs(secondNumber);

		double sqrtOfAbsoluteNumber = Math.sqrt(absoluteNumber);

		double roundOfMaxNumber = Math.round(maxNumber);

		double roundUpOfMaxNumber = Math.ceil(maxNumber);

		System.out.println(maxNumber);
		System.out.println(minNumber);
		System.out.println(absoluteNumber);
		System.out.println(sqrtOfAbsoluteNumber);
		System.out.println(roundOfMaxNumber);
		System.out.println(roundUpOfMaxNumber);
	}
}
