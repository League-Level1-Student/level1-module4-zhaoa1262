package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JButton jokeButton = new JButton();
	JButton punchlineButton = new JButton();
	JPanel panel = new JPanel();
	
	void makeButtons() {
		frame.setVisible(true);
		jokeButton.setText("joke");
		punchlineButton.setText("punchline");
		panel.add(jokeButton);
		panel.add(punchlineButton);
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jokeButton.addActionListener(this);
		punchlineButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == jokeButton) {
			JOptionPane.showMessageDialog(null, "hi");
		}
		if (buttonPressed == punchlineButton) {
			JOptionPane.showMessageDialog(null, "hi");
		}
		*/
		if(e.getSource() == jokeButton) {
			JOptionPane.showMessageDialog(null, "Why do we tell actors to break a leg?");
		}
		
		if(e.getSource() == punchlineButton) {
			JOptionPane.showMessageDialog(null, "Because every play has a cast. -_-");
		}
		
	}
}
