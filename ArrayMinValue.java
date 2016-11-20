import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class ArrayMinValue {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayMinValue window = new ArrayMinValue();
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
	public ArrayMinValue() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 242, 227);
		frame.getContentPane().add(panel);
		
		JLabel lbl = new JLabel("\u8BF7\u8F93\u5165\u4E00\u7EC4\u6570\u5B57\uFF0C\u5404\u4E2A\u6570\u5B57\u4E4B\u95F4\u4EE5\u7A7A\u683C\u5206\u5F00\uFF0C\u4F8B\u5982\uFF1A1 2 3 45 55 66 123");
		panel.add(lbl);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(30);
		
		JButton btnNewButton = new JButton("\u8BA1\u7B97");
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String arrayStr = textField.getText().trim();
				for(int i=0;i<arrayStr.length();i++){
					char charAt = arrayStr.charAt(i);
					if(!Character.isDigit(charAt)&&charAt !=' '){
						//JOptionPane.showMessageDialog(null,"输入包含非数字内容")；
						textField.setText("");
						return;
					}
				}
				String[] numStrs = arrayStr.split("{1,}");
				int[] numArray = new int[numStrs.length];
				//转换输入为整数数组
				for(int i=0;i<numArray.length;i++){
					numArray[i] = Integer.valueOf(numStrs[i]);
				}
				int min = numArray[0];
				for(int j = 0;j<numArray.length;j++){
					if(min>numArray[j]){
						min = numArray[j];
					}
				}
				//label.setText("数组中最小的数是："+min);
			}
		});
		
		JLabel label = new JLabel("\u8F93\u5165\u6570\u5B57\u4E2D\u6700\u5C0F\u7684\u6570\u5B57\u662F\uFF1A");
		panel.add(label);
	}
}
