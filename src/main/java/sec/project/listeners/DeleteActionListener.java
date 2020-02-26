package sec.project.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DeleteActionListener implements ActionListener {
	private JTable table;
	private JButton pause;
	private JButton unpause;
	private JButton delete;

	public DeleteActionListener(JTable table, JButton pause, JButton unpause, JButton delete) {
		this.table = table;
		this.pause = pause;
		this.unpause = unpause;
		this.delete = delete;
	}

	public void actionPerformed(ActionEvent evt) {
		deleteActionPerformed(evt);
	}

	private void deleteActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i = table.getSelectedRow();
		JOptionPane.showInputDialog("Enter Password");
		if (i != -1) {
			model.removeRow(i);
		}
		pause.setEnabled(false);
		unpause.setEnabled(false);
		delete.setEnabled(false);
	}
}
