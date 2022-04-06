package findmaximumgeneric;

public class Generics {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Generics Program");
		FindMaximum maxInt = new FindMaximum();
		maxInt.findMaxInt(45, 33, 38);
		FindMaximum maxFloat = new FindMaximum();
		maxInt.findMaxFloat(45.5f, 38.84f, 48.5f);
		FindMaximum maxString = new FindMaximum();
		maxInt.findMaxString("Apple", "Peach", "Banana");
	}
}
