package findmaximumgeneric;

public class FindMaximum<T extends Comparable<T>> {
	T x, y, z, a, max;
	
	public FindMaximum(T x, T y, T z, T a) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
		findMax();
	}
	
	public void findMax() {
		max = x;
		if(y.compareTo(max) > 0)
			max = y;
		if(z.compareTo(max) > 0)
			max = z;
		if(a.compareTo(max) > 0)
			max = a;
		
		printMax();
	}
	
	public void printMax() {
		System.out.println("The Maximum of " + x + ", " + y + ", " + z + " and " + a + " is " + max);
	}

}
