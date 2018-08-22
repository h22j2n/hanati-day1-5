/**
 * LIFO 구조의 스택 구현
 * @author 조희진
 *
 */
public class Stack {
	private int[] array;
	int index=-1;
	
	/**
	 * @param num	배열 크기
	 */
	Stack(int num){
		array = new int[num];
	}
	
	/**
	 * @param value	stack에 들어갈 값
	 */
	public void push(int value) {
		index++;
		array[index] = value;
		
	}
	
	/**
	 * @return	stack에서 꺼낼 값
	 */
	public int pop() {
		int popval =  array[index];
		array[index]=0;
		index--;
		return popval;
		
	}
	
	/**
	 * @return	stack 길이
	 */
	public int length() {
		int len;
		if(index<0) {
			len = 0;
		}
		else {
			len = index+1;
		}
		
		return len;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack(100);
		stack.push(5);
		stack.push(1);
		System.out.println(stack.length());
		stack.push(9);
		
		// 테스트를 위한 출력
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.length());
		
		
	}

}
