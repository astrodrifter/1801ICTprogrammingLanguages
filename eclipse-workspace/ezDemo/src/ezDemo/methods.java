package ezDemo;

public class Methods {
	public static void main(String[] args) {
		int num;
		num = sum(2,3);
		System.out.println(num);
	}
	
	static int sum(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}
}
