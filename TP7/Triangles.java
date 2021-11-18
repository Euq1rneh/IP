import java.util.Scanner;
/**
 * The {@code Triangles} class defines a set of procedures that
 * print several types of triangles.
 *
 * The program can be tested using a positive integer
 * given as an argument when running the class.
 *
 *
 * Compile:     javac Triangles.java
 * Run:         java Triangles 6
 *
 * @author antonialopes IP1819
 * @author filipecasal IP1920
 */
public class Triangles {

	public static void main(String[] args) {
/*
		// receive the argument and parse to an int
		int inputValue = Integer.parseInt(args[0]);

		// tests the printing procedures
		if (inputValue > 0) {
			printIsoscelesTriangle(inputValue, '*');
			System.out.print("\n");

			printIsoscelesTriangle(inputValue, 'X');
			System.out.print("\n");
		}
		*/
		Scanner reader = new Scanner(System.in);
		printIsoscelesTriangle(reader);
	}

	/**
	 * Print an isosceles triangle with a given height and symbol
	 *
	 * @param height height of the triangle to be printed
	 * @param symbol symbol to be used when printing
	 * @requires {@code height > 0}
	 */
	public static void printIsoscelesTriangle(Scanner reader) {
		int height = heightValueReader(reader);
		char symbol = symbolReader(reader);

		for (int l = 1; l <= height; l++) {
			printSequence(height - l, ' ');
			printSequence(2 * l - 1, symbol);
			System.out.print("\n");
		}
	}
	private static void printSequence(int n, char symbol){
		System.out.print(generateSequence(n, symbol));
	}
	public static String generateSequence(int n, char c){
		StringBuilder sb = new StringBuilder();

		for(int i = 1; i<=n; i++){
			sb.append(c);
		}
		return sb.toString();
	} 

	public static int heightValueReader(Scanner reader){
		System.out.print("Insira um valor para a altura: ");
		int height = reader.nextInt();

		if(height<=0){
			System.out.println("A altura do triangulo deve ser um numero inteiro positivo");
			heightValueReader(reader);
		}

		return height;
	}
	public static char symbolReader(Scanner reader){
		System.out.print("Insira um simbolo que sera usado para o triangulo: ");
		char symbol = reader.next().charAt(0);

		return symbol;
	}
	
}
