package _01_nasty_surprise;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton trickButton = new JButton();
JButton treatButton = new JButton();
	
public void run() {
	frame.setVisible(true);
	frame.add(panel);
	trickButton.setText("trick");
	treatButton.setText("treat");
	trickButton.addActionListener(this);
	treatButton.addActionListener(this);
	
	
	panel.add(trickButton);
	panel.add(treatButton);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	
	if(buttonPressed == trickButton) {
		showPictureFromTheInternet("https://en.bcdn.biz/Images/2016/11/15/776342f0-86f5-4522-84c9-a02d6b11c766.jpg");
	}
	
	else if(buttonPressed == treatButton) {
		showPictureFromTheInternet("https://ih1.redbubble.net/image.674598633.6357/flat,750x,075,f-pad,750x1000,f8f8f8.u4.jpg");
	}
	
}
	
}
