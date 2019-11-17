package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{


	JFrame frame = new JFrame("Simple Calculator");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	JTextField field1 = new JTextField(12);
	JTextField field2 = new JTextField(12);
	
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	
	
	public void run() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		frame.setSize(new Dimension (350, 200));
		
		panel.add(field1);
		panel.add(field2);
		
		panel.add(add);
		add.setText("add");
		add.addActionListener(this);
		
		panel.add(sub);
		sub.setText("sub");
		sub.addActionListener(this);
		
		panel.add(mul);
		mul.setText("mul");
		mul.addActionListener(this);
		
		panel.add(div);
		div.setText("div");
		div.addActionListener(this);
		
		
		panel.add(label);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String bob = field1.getText();
		int notBob = Integer.parseInt(bob);
		
		String joe = field2.getText();
		int notJoe = Integer.parseInt(joe);
		
		if(e.getSource() == add) {
			int george = (notBob + notJoe);
			System.out.println(george);
			String notGeorge = Integer.toString(george);
			label.setText(notGeorge);
			}
		
		else if(e.getSource() == sub) {
			int nelly = (notBob - notJoe);
			String notNelly = Integer.toString(nelly);
			label.setText(notNelly);
			}
		
		else if(e.getSource() == mul) {
			int billy = (notBob * notJoe);
			String notBilly = Integer.toString(billy);
			label.setText(notBilly);
			}
		
		else if(e.getSource() == div) {
			int moesha = (notBob / notJoe);
			String notMoesha = Integer.toString(moesha);
			label.setText(notMoesha);
			}
		
	}


	
}
