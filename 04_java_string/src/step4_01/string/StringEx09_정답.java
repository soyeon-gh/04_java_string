package step4_01.string;

import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */
//2021-03-03 19:31
public class StringEx09_정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] words = { "java", "mysql", "jsp", "spring" };
		String[] temp = new String[4];
		boolean isRunning = true;
	
		
		
		for (int i = 0; i < words.length; i++) {
			int randomWordNumber = (int) (Math.random() * 4);
			temp[i] = words[randomWordNumber]; 
		}
		
		
		
		
		while (isRunning) {
			
			System.out.print("temp { ");
			for (int i = 0; i < temp.length; i++) {
				System.out.print(temp[i]);
				if (i < temp.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println(" }");
			System.out.println("=====================");
			System.out.print("words { ");
			for (int i = 0; i < words.length; i++) {
				System.out.print(words[i]);
				if (i < words.length - 1) {
					System.out.print(", ");
				}
			}
			int i = 0;
			System.out.println(" }");
			System.out.println("=====================");
			System.out.println("타자연습 게임");
			System.out.println();
			System.out.println("문제 : " + temp[i] );
			System.out.print("입력 : ");
			String getString = sc.nextLine();

//			if (getString == words[randomWordNumber]) {
//				i++;
//			}

		}
		sc.close();

	}

}
