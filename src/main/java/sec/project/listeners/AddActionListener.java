package sec.project.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener {

	private JTable table;
	private JTextField name;
	/*
	 * private JTextField email; private JPasswordField password;
	 */

	public AddActionListener(JTable table, JTextField name, JTextField email, JPasswordField password) {
		super();
		this.table = table;
		this.name = name;
		/*
		 * this.email = email; this.password = password;
		 */
	}

	public void actionPerformed(ActionEvent evt) {
		bookActionPerformed(evt);
	}

	private void bookActionPerformed(ActionEvent evt) {
		String n = name.getText();
		/*
		 * String em = email.getText(); String p = password.getText();
		 */
		Object[] r = { n, "Unpaused" };
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(r);
	}
}
