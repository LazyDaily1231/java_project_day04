package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
	
	String id = JOptionPane.showInputDialog("아이디 입력");
	String pw = JOptionPane.showInputDialog("패스워드 입력");
	
	String id2 = "root";//회원 가입시 가입한 id
	String pw2 = "pass";//회원 가입시 가입한 id
	
	
	//기본형 데이터가 아니면 연산자를 가지고 비교할 수 없다
	System.out.println(id.equals(id2));
	System.out.println(pw.equals(pw2));
	System.out.println(id.equals(id2) && pw.equals(pw2));
	
	
	
	//&& 연산자인 경우, 중요한 체크를 비교를 첫번째에 넣는다.
	//첫번째 비교에서 false가 나오면, 이후의 비교연산자는 실행되지 않는다.
	if (id.equals(id2) && pw.equals(pw2)) {
		JOptionPane.showMessageDialog(null, "로그인 완료");
	} else {
		JOptionPane.showMessageDialog(null, "가입 정보를 확인하세요");
	}
	
	}

}
