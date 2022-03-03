import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    int firstNumber = input.nextInt();
    System.out.print("Input the second number: ");
    int secondNumber = input.nextInt();
    int sum = firstNumber + secondNumber;
    System.out.println();
    System.out.println("Sum: "+sum);
  }
}
