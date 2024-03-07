package pack;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AAA_running {

	public static void main(String[] args) {
		
		System.out.println("this is my GIT TP");
		System.out.println("I will push to github now");
		System.out.println("chaning this so I can pull a dif version");
		System.out.println("added more stuff to it");
		System.out.println("new");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setSize(500, 500);
		frame.add(panel);
		frame.pack();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
