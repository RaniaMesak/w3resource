public class Main
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("What is your name?");
    String name = keyboard.nextLine();
    
    System.out.prinln("How old are you?");
    int age = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.println("What is your favorite food?");
    String food = keyboard.nextLine();
    
    System.out.println("Hello " + name);
    System.out.println("You are " + age + " years old");
    System.out.prinln("You like " + food);
  }
} 
