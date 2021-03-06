package net.varago;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.varago.utils.Utils;

public class Launcher {

	/**
	 * @author: Zaen Khilji
	 */

	private JFrame frame;

	private static long bootTime;

	public static void main(String[] args) {
		bootTime = System.currentTimeMillis();
		System.out.println("Attempting to launch " + Settings.NAME + "...");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		System.err.println(Settings.NAME + " has launched - took "
				+ (Utils.currentTimeMillis() - bootTime)
				+ " milliseconds to launch.");
	}

	public Launcher() {
		init();
	}

	private void init() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 600);
		frame.getContentPane().setLayout(null);

		JCheckBox chckbxAutoupdate = new JCheckBox("Auto-update");
		chckbxAutoupdate.setBounds(731, 549, 113, 23);
		chckbxAutoupdate.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(chckbxAutoupdate);

		JLabel label = new JLabel("");
		label.setBounds(6, 6, 149, 566);
		label.setOpaque(true);
		label.setBackground(new Color(0, 0, 0, 25));
		frame.getContentPane().add(label);
		frame.setName(Settings.NAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}