package findmaximumgeneric;

public class FindMaximum {
	
	public <T extends Comparable<T>> void findMax(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) > 0)
			max = y;
		if(z.compareTo(max) > 0)
			max = z;
		
		System.out.println("The Maximum is: " + max);
	}

}
