public class StringMethods
{
	public static void main(String[] args)
	{
		String name = "Rania";

		boolean result = name.equalsIgnoreCase("rania"); //true
				result = name.equals("rania");  //false

		int nameLength = name.length();

		char nameFirstLetter = name.charAt(0);

		int letterIndex = name.indexOf("i");

		boolean emptyOrNot = name.isEmpty();

		String upperCaseName = name.toUpperCase();

		String lowerCaseName = name.toLowerCase();

		String replaceLetter = name.replace('i', 'y');

		System.out.println(result);
		System.out.println(nameLength);
		System.out.println(nameFirstLetter);
		System.out.println(letterIndex);
		System.out.println(emptyOrNot);
		System.out.println(upperCaseName);
		System.out.println(lowerCaseName);
		System.out.println(replaceLetter);
	}
}
