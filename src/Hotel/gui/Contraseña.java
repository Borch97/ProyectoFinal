package Hotel.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Hotel.gui.LoginManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Contrase�a extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtContrase�a;
	private LoginManager lm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginManager lm = new LoginManager();
			Contrase�a dialog = new Contrase�a(lm);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param lm 
	 */
	public Contrase�a(LoginManager lm) {
		this.lm = lm;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblUsuario = new JLabel("Usuario:");
			contentPanel.add(lblUsuario);
		}
		{
			txtContrase�a = new JTextField();
			contentPanel.add(txtContrase�a);
			txtContrase�a.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String contrase�a = lm.recuperarContrase�a(txtContrase�a.getText());
						if(contrase�a.length() > 0)
							JOptionPane.showMessageDialog(null, "Contrase�a: " + contrase�a);
						else
							JOptionPane.showMessageDialog(null, "Error el usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
