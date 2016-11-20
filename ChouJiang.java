//有一些问题，就是输入人名，回车后，不能把人名显示在下面的文本域中

//主要功能 先把观众人名输到文本域中，然后抽奖，最后产生抽奖结果

//用到两个事件监听，第一个是在文本域中加一个按键监听，即按回车
//第二个事件就是按钮的监听


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
				String formatArg = "本次抽取观众人员：\n\t%1$s\n恭喜%1$s成为本次幸运观众"
						+"\n\n我们将为%1$s颁发:\n\t过期的酸奶20箱";
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
