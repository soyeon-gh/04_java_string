package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int check = -1;
		String text = "Life is too short.";
		System.out.println(text);
		
		
		String[] temp = text.split(" ");

		System.out.println(temp.length);

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
		
//		String[] textArray = new String[4];
//
//		textArray[0] = text.substring(0, 4);
//		textArray[1] = text.substring(5, 7);
//		textArray[2] = text.substring(8, 11);
//		textArray[3] = text.substring(12, 17);
//
//		System.out.println("============================");
//		for (int i = 0; i < textArray.length; i++) {
//			System.out.print(textArray[i] + " ");
//
//		}
//		System.out.println();
//		System.out.println("============================");
		
		
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();

		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals(word)) {
				check = 0;
			} else if (!word.equals(temp[i])) {
				check = -1;
			}
		}

		if (check == 0) {
			System.out.println("TRUE");
		} else if (check == -1) {
			System.out.println("FALSE");
		}

		scan.close();

	}

}
