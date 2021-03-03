package step4_01.string;

import java.util.Calendar;

public class StringEx05_정답{
//2021-03-02 21:00
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);				// 이번년도
		
		
		String jumin = "890101-2012932";
		
		// 문제 1) 나이 출력
		// 정답 1) 33세
		
		System.out.println("문제 1) 나이 출력");
		
		String juminAge = jumin.substring(0, 2); 		//주민번호 1,2번째 자리 (나이)
		String juminGender = jumin.substring(7, 8);		//주민번호 7번째 자리(성별)
		
		
		String genderString = "";						// 변수 초기화
		int age = 0;
		
		int gender = Integer.parseInt(juminGender);		// String성별 -> Int성별
		
		// 1900~1999년 출생
		if(gender == 1 || gender == 2 || gender == 5 || gender == 6 ) { 	
			
			age = Integer.parseInt(juminAge) + 1900;
			
			//성별
			if(gender == 1 || gender == 5) {
				genderString = "남자";
			} else if(gender == 2 || gender == 6) {
				genderString = "여자";
			}
		}
		
		// 2000년 이후 출생
		else if (gender == 3 || gender == 4 || gender == 7 || gender == 8) { 
			
			age = Integer.parseInt(juminAge) + 2000;
			
			//성별
			if(gender == 3 || gender == 7) {
				genderString = "남자";
			} else if(gender == 4 || gender == 8) {
				genderString = "여자";
			}
		}
		
		int thisYear = ( year - age ) + 1; // 올해 나이 = (만나이) + 1
		
		System.out.println("답 : " + thisYear + "살");
		System.out.println();
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		System.out.println("문제 2) 성별 출력");
		System.out.println("답 : " + genderString);

	}

}
