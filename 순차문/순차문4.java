package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
	
	//숫자1 입력 : 333
	//숫자2 입력 : 222
	String num1 = JOptionPane.showInputDialog("숫자1을 입력하세요");
	String num2 = JOptionPane.showInputDialog("숫자2을 입력하세요");
	
	int num3 = Integer.parseInt(num1);
	int num4 = Integer.parseInt(num2);
	
	int result1 = num3 + num4;
	int result2 = num3 - num4;
	
	System.out.println("덧셈의 결과는 " + result1);
	System.out.println("뺄셈의 결과는 " + result2);
	
	}

}
