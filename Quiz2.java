import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
					
		}
		System.out.println("-----------------------");
		Arrays.sort(array);
		for (int value : array) {
			System.out.println(value);
		}
	}

}
