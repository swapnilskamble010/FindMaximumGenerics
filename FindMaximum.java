package findmaximumgeneric;

public class FindMaximum {
	
	private Integer num1, num2, num3, max;

	public FindMaximum(Integer num1, Integer num2, Integer num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void findMax() {
		Integer max = num1;
		if(num2.compareTo(max) > 0)
			max = num2;
		if(num3.compareTo(max) > 0)
			max = num3;
		
		System.out.println("The Maximum Number is: " + max);
	}
}
