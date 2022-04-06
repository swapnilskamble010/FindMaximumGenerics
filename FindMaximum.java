package findmaximumgeneric;

public class FindMaximum<T extends Comparable<T>> {
	T x, y, z, a;
	
	public FindMaximum(T x, T y, T z, T a) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
		findMax(x, y, z, a);
	}
	
	public <T extends Comparable<T>> void findMax(T x, T y, T z, T a) {
		T max = x;
		if(y.compareTo(max) > 0)
			max = y;
		if(z.compareTo(max) > 0)
			max = z;
		if(a.compareTo(max) > 0)
			max = a;
		
		System.out.println("The Maximum is: " + max);
	}

}
