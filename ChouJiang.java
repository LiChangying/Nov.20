//��һЩ���⣬���������������س��󣬲��ܰ�������ʾ��������ı�����

//��Ҫ���� �Ȱѹ��������䵽�ı����У�Ȼ��齱���������齱���

//�õ������¼���������һ�������ı����м�һ�����������������س�
//�ڶ����¼����ǰ�ť�ļ���


import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChouJiang {

	private JFrame frame;
	private JTextField nameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChouJiang window = new ChouJiang();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChouJiang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u5728\u573A\u89C2\u4F17\u59D3\u540D\uFF0C\u6309\u56DE\u8F66");
		lblNewLabel.setBounds(20, 10, 152, 15);
		frame.getContentPane().add(lblNewLabel);
		
		nameField = new JTextField();
		nameField.setBounds(10, 35, 64, 21);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		nameField.addActionListener(new ActionListener(){
			protected void keyPressed(KeyEvent e){
				if(e.getKeyChar()!='\n') {
				String name = nameField.getText();
				if(name.isEmpty()) return;
				personnelArea.append(name + "\n");
				nameField.selectAll();
				}
			}
		});
		
		JTextArea personnelArea = new JTextArea();
		personnelArea.setBounds(10, 66, 64, 130);
		frame.getContentPane().add(personnelArea);
		
		JTextArea resultArea = new JTextArea();
		resultArea.setBounds(125, 34, 193, 167);
		frame.getContentPane().add(resultArea);
		
		JButton btnNewButton = new JButton("\u62BD\u53D6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String perstring = personnelArea.getText();
				String[] personnelArray = perstring.split("\n{1,}");
				int index = (int)(Math.random()*personnelArray.length);
				String formatArg = "���γ�ȡ������Ա��\n\t%1$s\n��ϲ%1$s��Ϊ�������˹���"
						+"\n\n���ǽ�Ϊ%1$s�䷢:\n\t���ڵ�����20��";
				String info = String.format(formatArg, personnelArray[index]);
				resultArea.setText(info);
			}
		});
		btnNewButton.setBounds(339, 135, 73, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u9000\u51FA");
		btnNewButton_1.setBounds(339, 184, 73, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
