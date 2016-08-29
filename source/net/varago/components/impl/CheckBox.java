package net.varago.components.impl;

import java.awt.Cursor;

import javax.swing.JCheckBox;

import net.varago.components.Component;

public class CheckBox extends Component {

	/**
	 * @author: Zaen Khilji
	 */

	public static JCheckBox checkBox;

	@Override
	public void add() {
		checkBox = new JCheckBox("Auto");
		checkBox.setBounds(731, 549, 113, 23);
		checkBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
}