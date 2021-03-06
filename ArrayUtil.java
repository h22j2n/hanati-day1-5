/**
 * 배열 관련한 공통 기능 정의
 * @author 조희진
 *
 */
/**
 * @author 조희진
 *
 */
public class ArrayUtil {

	/**
	 * 배열 복사
	 * 
	 * @param src        복사하고자 하는 원본 배열
	 * @param increament 증가치
	 * @return 복사된 배열
	 */
	public static int[] copy(int[] src, int increament) {
		int[] array = new int[src.length + increament];
		for (int i = 0; i < src.length; i++) {
			array[i] = src[i];
		}
		return array;
	}

	// 값을 복사하는게 아니니까 return이 아님 => void

	/**
	 * 배열 오름차순 정렬
	 * 
	 * @param src 원본배열
	 */
	public static void sort(int[] src) {
		int num;
		for (int i = 0; i < src.length - 1; i++) {
			for (int k = i + 1; k < src.length; k++)
				if (src[i] > src[k]) {
					num = src[i];
					src[i] = src[k];
					src[k] = num;
				}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 9, 7 };
		int[] copy = ArrayUtil.copy(array, 4);

		for (int i : copy) {
			System.out.print(i + "\t");
		}
		System.out.println();
		ArrayUtil.sort(array);
		for (int i : array) {
			System.out.print(i + "\t");
		}
	}

}
