package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
	 JFrame f = new JFrame();
	 f.setSize(500,500);
	 f.getContentPane().setLayout(null);
	 
	 JLabel lblNewLabel = new JLabel("계산기");
	 lblNewLabel.setBounds(0, 25, 500, 58);
	 lblNewLabel.setFont(new Font("NanumSquare", Font.BOLD, 50));
	 lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	 f.getContentPane().add(lblNewLabel);
	 
	 JLabel lblNewLabel_1 = new JLabel("숫자1");
	 lblNewLabel_1.setFont(new Font("NanumSquare", Font.BOLD, 40));
	 lblNewLabel_1.setBounds(49, 153, 96, 77);
	 f.getContentPane().add(lblNewLabel_1);
	 
	 JLabel lblNewLabel_1_1 = new JLabel("숫자2");
	 lblNewLabel_1_1.setFont(new Font("NanumSquare", Font.BOLD, 40));
	 lblNewLabel_1_1.setBounds(49, 263, 96, 77);
	 f.getContentPane().add(lblNewLabel_1_1);
	 
	 t1 = new JTextField();
	 t1.setBounds(157, 162, 316, 58);
	 f.getContentPane().add(t1);
	 t1.setColumns(10);
	 
	 t2 = new JTextField();
	 t2.setColumns(10);
	 t2.setBounds(157, 272, 316, 58);
	 f.getContentPane().add(t2);
	 
	 JButton btnNewButton = new JButton("더하기");
	 btnNewButton.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
	 		String s1 = t1.getText();
	 		String s2 = t2.getText();
	 		
	 		
	 		int n1 = Integer.parseInt(s1);
	 		int n2 = Integer.parseInt(s2);
	 		
	 		JOptionPane.showMessageDialog(null, n1 + n2);
	 		
	 	}
	 });
	 btnNewButton.setFont(new Font("NanumSquare", Font.BOLD, 30));
	 btnNewButton.setBounds(59, 402, 152, 64);
	 f.getContentPane().add(btnNewButton);
	 
	 JButton btnNewButton_1 = new JButton("빼기");
	 btnNewButton_1.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
	 		String s1 = t1.getText();
	 		String s2 = t2.getText();
	 		
	 		
	 		int n1 = Integer.parseInt(s1);
	 		int n2 = Integer.parseInt(s2);
	 		
	 		JOptionPane.showMessageDialog(null, n1 - n2);
	 		
	 	}
	 });
	 btnNewButton_1.setFont(new Font("NanumSquare", Font.BOLD, 30));
	 btnNewButton_1.setBounds(290, 402, 152, 64);
	 f.getContentPane().add(btnNewButton_1);
	 f.setVisible(true);
	}
}
