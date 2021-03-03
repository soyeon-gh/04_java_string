package step4_01.string;

import java.util.Scanner;

/*
 * 
 * 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 
 * */

public class StringEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = "제임스고슬링";

		System.out.print("# 이름을 입력하세요 : ");
		String getName = sc.next();

		// 비교불가
		if (name == getName)
			System.out.println("== 연산자 : 일치");
		else
			System.out.println("== 연산자 : 불일치");

		if (name.equals(getName))
			System.out.println("equals 메서드 : 일치");
		else
			System.out.println("equals 메서드 : 불일치");

		// (참고)
		if (!name.equals(getName)) {
			
		} // name과 getName이 같지 않으면 > 다르면

		sc.close();

	}

}
