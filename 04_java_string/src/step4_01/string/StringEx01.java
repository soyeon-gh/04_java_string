package step4_01.string;

import java.util.Scanner;

public class StringEx01 {
	/*
	 * 
	 * 문자열 입력
	 * 
	 * 1) next() : 공백을 기준으로 한단어만 입력받는다.
	 * 2) nextLine() : enter입력전까지 전체를 입력 받는다.
	 * 
	 *  nextLine()은 버퍼관련 이슈가 생길 수 있으니 버퍼를 정리해 주어야 한다.
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		
		String name = sc.next(); 	 	// 띄어 쓰기를 제외한 문자열을 입력받는다.
		String nema = sc.nextLine(); 	// 띄어쓰기를 포함한 문자열을 입력받는다.
		
		System.out.println("name : " + name);
		
		//////////////////////////////////////////
		
		// 버퍼 관련 이슈
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("age : " + age);
		
		sc.nextLine(); // 버퍼에 있는 enter를 제거 (버퍼 비우기)
		
		System.out.print("특이사항을 입력하세요 : ");
		String comment = sc.nextLine();
		System.out.println("comment : " + comment);
		
		sc.close();
	}

}
