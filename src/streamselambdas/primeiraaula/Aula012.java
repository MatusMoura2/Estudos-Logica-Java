package primeiraaula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Aula012 {
	public static void main(String[] args) {

		JButton button = new JButton();

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ola Mundo!");

			}
		});

		JButton button2 = new JButton();

		button2.addActionListener(e -> System.out.println("Ola Mundo!"));
	}
}
