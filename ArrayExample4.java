import java.util.Scanner;

/**
 * 레퍼런스타입 배열 선언, 생성, 초기화
 * 
 * @author 조희진
 *
 */

public class ArrayExample4 {
	public static void main(String[] args) {
//		Account account = new Account("1111-2222-3333", "조희진", 1111, 10000);
		Account[] accounts = new Account[100];
		int index = 0;

		// 은행 계좌 개설
		accounts[index] = new Account("1111-2222-3333", "조희진", 1111, 10000);
		index++;

		accounts[index] = new Account("2222-2222-3333", "양의지", 1111, 200000);
		index++;

		accounts[index] = new Account("3333-2222-3333", "박건우", 1111, 300000);
		index++;

		// 전체 계좌 목록 출력
		for (int i = 0; i < index; i++) {
			System.out.println(accounts[i].toString());
		}

		// 계좌번호로 계좌 조회
		String num = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("검색 계좌번호 : ");
		num = sc.nextLine();

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


	}

}
