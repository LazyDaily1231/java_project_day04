package 조건문;

public class 조건문1 {

	public static void main(String[] args) {
		
		//1.입력
		int score  = 88;
		
		//2.처리:학점 부여
		String result  = null;//변수를 선언할 때 반드시 초기값 넣기, 변수의 초기화(initialize)
		
		
		if (score>=90) {
			result= "A학점";
		}else if (score>=80) {
			result = "B학점";
		}else if (score>=70) {
			result = "C학점";
		}else {
			result = "D학점";
		}
		//3.출력
		
		System.out.println(result);

	}

}
