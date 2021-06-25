package 반복문;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		
		
		while (true) {//무한루프
			System.out.println("정신 나갈거 같애");
			String q = JOptionPane.showInputDialog("중단 ㄱ?");
			if (q.equals("x")) {
				//break;
				System.exit(0);
			}
		}

	}

}
