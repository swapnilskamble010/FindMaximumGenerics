package findmaximumgeneric;

public class FindMaximum {
	
	public void findMaxInt(Integer num1, Integer num2, Integer num3) {
		Integer max = num1;
		if(num2.compareTo(max) > 0)
			max = num2;
		if(num3.compareTo(max) > 0)
			max = num3;
		
		System.out.println("The Maximum Integer Number is: " + max);
	}

	public void findMaxFloat(Float num1, Float num2, Float num3) {
		Float max = num1;
		if(num2.compareTo(max) > 0)
			max = num2;
		if(num3.compareTo(max) > 0)
			max = num3;
		
		System.out.println("The Maximum Float Number is: " + max);
	}
	
	public void findMaxString(String str1, String str2, String str3) {
		String max = str1;
		if(str2.compareTo(max) > 0)
			max = str2;
		if(str3.compareTo(max) > 0)
			max = str3;
		
		System.out.println("The Maximum String is: " + max);
	}
}
