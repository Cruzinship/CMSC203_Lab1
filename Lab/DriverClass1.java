import java.util.Scanner;
public class DriverClass1 extends Movie{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		System.out.println("What is the title of this movie: ");
		String title = input.nextLine();
		
				
		System.out.println("What is the rating of this movie: ");
		String rating = input.nextLine();
		
		System.out.println("How many tickets tickets did this movie sell: ");
		int ticket = input.nextInt();
		
		input.nextLine();
		
	
		Movie movie = new Movie(title, rating, ticket);
		
		System.out.println(movie.toString());
		
		input.close();
		
		System.out.println("Goodbye");
		
		
		
	}
}

