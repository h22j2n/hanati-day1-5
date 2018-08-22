
public class Calculator {
	
	//메소드 오버로딩(중복정의)
	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static double sum(double x, double y) {
		return x + y;
	}
	
	
	//"main" + ctrl + space = > 
	public static void main(String[] args) {
		System.out.println(sum(5.5,7));
		System.out.println(Calculator.sum(30,50));
		System.out.println(sum(25.3,67.8));
	}
	
}
