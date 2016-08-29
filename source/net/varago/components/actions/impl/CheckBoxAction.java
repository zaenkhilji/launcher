package net.varago.components.actions.impl;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;

import net.varago.components.actions.Action;
import net.varago.components.impl.CheckBox;

public class CheckBoxAction extends Action {

	/**
	 * @author: Zaen Khilji
	 */

	@Override
	public void handle() {
		CheckBox.checkBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e))
					System.out.println("Left mouse clicked at checkbox");
			}
		});
	}
}