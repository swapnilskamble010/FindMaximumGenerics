package findmaximumgeneric;

public class Generics {

	public static void main(String[] args) {
		System.out.println("Welcome to Generics Program");
		new FindMaximum<Integer>(45, 33, 48, 56);
		new FindMaximum<Float>(45.5f, 38.84f, 48.5f, 58.8f);
		new FindMaximum<String>("Apple", "Peach", "Banana", "Pinapple");
	}
}
