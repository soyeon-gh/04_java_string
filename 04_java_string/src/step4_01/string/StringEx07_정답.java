package step4_01.string;
//2021-03-02 21:40

public class StringEx07_정답 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		name[0] = str.substring(0, 3);
		name[1] = str.substring(7, 10);
		name[2] =  str.substring(14, 17);
		
		String scoreString1 = str.substring(4, 6);
		String scoreString2 = str.substring(11, 13);
		String scoreString3 = str.substring(18, 20);
		
		score[0] = Integer.parseInt(scoreString1);
		score[1] = Integer.parseInt(scoreString2);
		score[2] = Integer.parseInt(scoreString3);
		
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + " / " +score[i]);
			if (i < score.length - 1) {
				System.out.print(", ");
			}
		}

	}

}
