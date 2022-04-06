package findmaximumgeneric;

public class Generics {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Generics Program");
		FindMaximum<Integer> maxInt = new FindMaximum<Integer>(45, 33, 38, 56);
		FindMaximum<Float> maxFloat = new FindMaximum<Float>(45.5f, 38.84f, 48.5f, 58.8f);
		FindMaximum<String> maxString = new FindMaximum<String>("Apple", "Peach", "Banana", "Pinapple");
	}
}
