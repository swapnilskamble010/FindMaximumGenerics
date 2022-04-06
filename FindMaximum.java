package findmaximumgeneric;

public class FindMaximum<T extends Comparable<T>> {
	T x, y, z;
	
	public FindMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
		findMax(x, y, z);
	}
	
	public <T extends Comparable<T>> void findMax(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) > 0)
			max = y;
		if(z.compareTo(max) > 0)
			max = z;
		
		System.out.println("The Maximum is: " + max);
	}

}
