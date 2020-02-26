package sec.project.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PauseActionListener implements ActionListener {

	private JTable table;
	private JButton pause;
	private JButton unpause;

	public PauseActionListener(JTable table, JButton pause, JButton unpause) {
		this.table = table;
		this.pause = pause;
		this.unpause = unpause;
	}

	public void actionPerformed(ActionEvent evt) {
		pauseActionPerformed(evt);
	}

	private void pauseActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int i = table.getSelectedRow();
		JOptionPane.showInputDialog("Enter Password");
		Object s = "Paused";
		model.setValueAt((Object) s, i, 1);
		pause.setEnabled(false);
		unpause.setEnabled(true);
	}
}
