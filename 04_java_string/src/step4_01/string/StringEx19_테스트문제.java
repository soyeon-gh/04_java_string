package step4_01.string;

/*
 * 
 * 문제) 전체 성적(총점)이 1등인 학생 이름 출력
 * 
 *  학생 정보와 성적이 담긴 데이터 이다 
 * 	student => 1.이름 2.주소 3.번호
 *  score   => 1.번호 2.국어 3.수학 4.영어 점수
 *  
 *  
 * */

public class StringEx19_테스트문제 {

	public static void main(String[] args) {

		String[][] students = { 
				{ "제임스 고슬링", "신촌", "1001" }, 
				{ "스티브워즈니악", "강남", "1002" }, 
				{ "데니스리치", "대치", "1003" },
				{ "팀버너스리", "강동", "1004" } };

		String[][] scores = { 
				{ "1001", "100", "20", "30" }, 
				{ "1002", "10", "60", "60" }, 
				{ "1003", "23", "63", "31" },
				{ "1004", "45", "30", "35" }, };

		int[] sum = new int[4];
		int max = 0;
		int index = 0;
		

		System.out.println("┌───────────────────────────────────────────────┐");
		System.out.println("│             StringEx19_테스트문제             │");
		System.out.println("├───────────────────────────────────────────────┤");
		System.out.println("│ 문제) 전체 성적(총점)이 1등인 학생 이름 출력  │");
		System.out.println("└───────────────────────────────────────────────┘");
		System.out.println("  student >> ");
	
		for (int i = 0; i < students.length; i++) {
			System.out.println("  번호 : " + students[i][2] + ", 이름 : " + students[i][0]);
		}
		
		System.out.println();
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("  성적 : ");
			for (int j = 1; j < scores.length; j++) {
				
				System.out.print(scores[i][j]);
				if (j < scores.length - 1) {
					System.out.print(", ");
				}
				sum[i] += Integer.parseInt(scores[i][j]);
				if (max < sum[i]) {
					max = sum[i];
					index = Integer.parseInt(scores[i][0]);
				}
			}
			System.out.println();
		}

		System.out.println();
		
		for (int i = 0; i < students.length; i++) {

			if (index == Integer.parseInt(students[i][2])) {
				System.out.println("학생의 점수 : " + max);
				System.out.println(students[i][0]);
			}

		}

	}

}
