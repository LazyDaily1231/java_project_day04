package 문제풀이;

public class 문제2 {

	public static void main(String[] args) {
		// 1.기본데이터 확인 문제
		//1학기 성적
			//체육:66점
			//수학:77점
			//영어:88점
			//국어:99점
		//모든 점수를 합해, 평균을 구하세요
		int pe = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		
		int sum = pe + math + eng + kor;
		System.out.println("총합은 " + sum + "점");
		
		int count = 4;
		double avg = sum/(double)count;
		
		System.out.println("평균 점수는 " + avg + "점");
		
		//2. 원의 면적 구하기
		double pi = 3.14;
		double r = 2.2;		
		
		double circle = pi*(r*2);
		System.out.println(circle);
		
		
		
	}

}
