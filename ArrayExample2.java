/**
 * 다차원 배열 테스트
 * @author 조희진
 *
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		char[][] array;
		array = new char[10][10];
		array[0][0] = 'A';
		array[9][9] = 'Z';
		
		for (int i = 0; i < array.length; i++) {
			//array[i].length : array의 i 번째가 가르키는 배열의 length
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j] + "\t");
				
			}
			System.out.println();
		}
		
		int[][] array2 = new int[][] {{1,2,3},{4,5,6},{7,8,9}}; //new int[][] 여기에 사이즈 넣으면 안됨!!!
		
		int[][] gugudan = new int[8][9];
		for (int i = 0; i < gugudan.length; i++) {
			for (int j = 0; j < gugudan[i].length; j++) {
				gugudan[i][j] = (i+2) * (j+1);
				System.out.print((i+2) + "*" + (j+1) + "=" + gugudan[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
