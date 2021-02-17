import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 74, g = 65, b = 42;
	static Color color = new Color(r, g, b);
	private int order = 0;
	private JButton minus = new JButton("-");
	private JButton plus = new JButton("+");
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(minus);
		panel.add(plus);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (order == 0) {
					return;
				}
				order--;
				/*
				 * if (order < 0) { order = 0; }
				 */
				trianglePanel.setOrder(order);
			}
		});

		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				order++;
				trianglePanel.setOrder(order);
			}
		});

	}

}