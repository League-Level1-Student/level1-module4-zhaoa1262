package _08_calculator;

import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator{


	JFrame frame = new JFrame("Simple Calculator");
	JPanel panel = new JPanel();
	
	JTextField field1 = new JTextField();
	JTextField field2 = new JTextField();
	
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	
	
	public void run() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
		field1.setSize(100, 10);
		field2.setSize(100, 10);
		
		panel.add(field1);
		panel.add(field2);
		
		
		panel.add(add);
		add.setText("add");
		
		panel.add(sub);
		sub.setText("sub");
		
		panel.add(mul);
		mul.setText("mul");
		
		panel.add(div);
		div.setText("div");
		
		
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	
}
