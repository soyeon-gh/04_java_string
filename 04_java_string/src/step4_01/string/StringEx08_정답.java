package step4_01.string;


public class StringEx08_정답 {
//2021-03-03 19:15
	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = "";
				
		System.out.println("문제) 이름과 성적을 하나의 문자열로 연결");
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
			str = (name[i] + "/" + score[i]);
			System.out.print(str);
			if (i < score.length-1) {
				System.out.print(", ");
			}
		}
		
		
	}

}
