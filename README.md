# 하나금융티아이 20180822

- alt + shift + J => 주석 자동완성
- 과제 낼 때 주석 달아서 내기
- 배열은 class 취급
- int array []; : 문법적으로 문제 없음

- Call by Reference : 공유개념 / 변형하면 같이 변형됨
- Call by Value : 값이 복사되서 전달됨 / 영향 X
- Alt + Shift + R : 단어 한꺼번에 바꾸기
- return 하는게 아니면 => public static void ~
- return 하면 => public static ~

``` java
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
```

## 2차원 배열

- 자바는 정방형 배열 안만들어짐

``` java
int[][] array2 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
//new int[][] 여기에 사이즈 넣으면 안됨!!! 시험!!!!!!!!!!!!!!!
int[][] array2 = {{1,2,3},{4,5,6},{7,8,9}}; // 같은 얘기
```



``` java
int[][] gugudan = new int[8][9];
for (int i = 0; i < gugudan.length; i++) {
	for (int j = 0; j < gugudan[i].length; j++) {
		gugudan[i][j] = (i+2) * (j+1);
		System.out.print((i+2) + "*" + (j+1) + "=" + gugudan[i][j] + "\t");
	}
	System.out.println();
}
```

``` java
/**
 * 레퍼런스타입 배열 선언, 생성, 초기화
 * @author 조희진
 *
 */
public class ArrayExample3 {
	public static void main(String[] args) {
		String[] teams;
		teams = new String[10];
		//teams[0] : 레퍼런스 변수
		teams[0] = "두산 베어스";
		teams[1] = "SK 와이번즈";
		teams[2] = "한화 이글즈";
		teams[9] = "NC 다이노스";
		for (int i = 0; i < teams.length; i++) {
			int count =0;
			if(teams[i]!=null) {
				count = teams[i].length();			
			}

			System.out.println((i+1)+"위 "+teams[i]+"("+count+")");
		}
				
	}

}
```

``` java
public class ArrayExample4 {
	public static void main(String[] args) {
//		Account account = new Account("1111-2222-3333", "조희진", 1111, 10000);
		Account[] accounts = new Account[100];
		int index = 0;
		
		//은행 계좌 개설
		accounts[index] = new Account("1111-2222-3333", "조희진", 1111, 10000);
		index++;
		
		accounts[index] = new Account("2222-2222-3333", "양의지", 1111, 200000);
		index++;
		
		accounts[index] = new Account("3333-2222-3333", "박건우", 1111, 300000);
		index++;
		
		//전체 계좌 목록 출력
		for (int i = 0; i<index;i++) {
			System.out.println(accounts[i].toString());
		}
	}

}
-------------------------------------------------------------------------------
//전체 계좌 목록 출력할 때 쉽게 하기 위해 Account class에 method 를 추가
    public String toString() {
    	return accountNum+"\t"+accountOwner+"\t"+"****"+"\t"+restMoney;
    }
```

``` java
		Account account = null;
		for (int i = 0; i < index; i++) {
//	         Account account = accounts[i];
//	         String numm = acc.getAccountNum();
//	         boolean eq = numm.equals(num);
			if (accounts[i].getAccountNum().equals(num)) { // == 이걸로 비교하면 주소값비교하는거라서 안됩니다. equals로 하면 true, false로 나오기
															// 때문에 훨씬 간단하게 비교가능.
				account = accounts[i];
				break;
			}
		}
		if (account != null) {
			System.out.println(account.toString());
		} else {
			System.out.println("검색된 계좌는 존재하지 않는 계좌입니다.");
		}

```

``` java
		for (int i = 0; i < index; i++) {
			if (accounts[i].getAccountNum().equals(num)) {
				System.out.println(accounts[i].toString());
				break;
			}
			if (i == index - 1 && !(accounts[i].getAccountNum().equals(num))) {
				System.out.println("계좌가 존재하지 않습니다.");

			}
```

## Command Line Argument

``` java
//java FileReader [읽고자 하는 파일명]
public class FileReader {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("사용법 : java FileReader [읽고자 하는 파일명1][읽고자 하는 파일명2]");
			return;
		}
		String fileName1 = args[0];
		String fileName2 = args[1];
		System.out.println(fileName1);
		System.out.println(fileName2);
		

	}

}
```

