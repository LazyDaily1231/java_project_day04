package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 정리문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(450,650);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setBounds(-12, 55, 197, 37);
		lblNewLabel.setFont(new Font("NanumSquare", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(lblNewLabel);
		
		
		t1 = new JTextField();
		t1.setBounds(173, 55, 235, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("NanumSquare", Font.BOLD, 20));
		lblNewLabel_1.setBounds(-12, 195, 197, 37);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(173, 195, 235, 37);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("NanumSquare", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(-12, 347, 197, 37);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(173, 348, 235, 37);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("수학 점수");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("NanumSquare", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(-12, 463, 197, 37);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(173, 464, 235, 37);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 자동으로 이 함수 실행
				//버튼을 클릭했을 때 처리내용을 넣으면 됨
				String s1 = t1.getText();//아메리카노
				String s2 = "아메리카노";
				String s3 = "주스";
				String s4 = "차";
				
				if (s1.equals(s2) || s1.equals(s3) || s1.equals(s4)){
					JOptionPane.showMessageDialog(null, "Go Café");
				} else {
					JOptionPane.showMessageDialog(null, "Go Home");
				}
		}
		});
		
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("NanumSquare", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(79, 119, 284, 48);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s5 = t2.getText();
				
				int age = Integer.parseInt(s5);
				JOptionPane.showMessageDialog(null,(age +1) + "살" );
			}
		});
		btnNewButton_1.setFont(new Font("NanumSquare", Font.PLAIN, 18));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(79, 266, 284, 48);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("두 과목의 평균은");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s6 = t3.getText();
			String s7 = t4.getText();
			
			double sc1 = Double.parseDouble(s6);
			double sc2 = Double.parseDouble(s7);
			
			double avg =(sc1+sc2)/2.0;
			JOptionPane.showMessageDialog(f, avg+"점");
			
			}
		});
		btnNewButton_1_1.setFont(new Font("NanumSquare", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(79, 544, 284, 48);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);
		
		
		
		
	}
}
