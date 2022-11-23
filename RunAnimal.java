import java.util.Scanner;
public class RunAnimal{
	public static void main (String args []){
		Scanner KWIN = new Scanner(System.in);
		
		System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
		String input = KWIN.nextLine();
		
		if (input.equalsIgnoreCase("B")){
			Bird bird = new Bird();
			bird.eat();
			bird.sleep();
			bird.makesound();
			}
			
		else if(input.equalsIgnoreCase("C")){
			Cat cat = new Cat();
			cat.eat();
			cat.sleep();
			cat.makesound();
			}
			
		else if(input.equalsIgnoreCase("D")){
			Dog dog = new Dog();
			dog.eat();
			dog.sleep();
			dog.makesound();
			}
			
		else {
			System.out.println("Invalid Input");
		}
	}
}