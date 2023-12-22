package sistemaEscolar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaAlumno {

	private JFrame frmSistemaEscolar;
	private JTextField txtNumeroControl;
	private JTextField txtNombreAlumno;
	private JTextField txtApellidoPaterno;
	private JTextField txtApellidoMaterno;
	private JTextField txtCarrera;
	private JTextField txtGrupo;

	NegocioAlumno ng = new NegocioAlumno();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaAlumno window = new PantallaAlumno();
					window.frmSistemaEscolar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaAlumno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaEscolar = new JFrame();
		frmSistemaEscolar.setTitle("SISTEMA ESCOLAR");
		frmSistemaEscolar.setBounds(100, 100, 611, 489);
		frmSistemaEscolar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaEscolar.getContentPane().setLayout(null);

		JLabel lblNumeroControl = new JLabel("NumeroControl");
		lblNumeroControl.setBounds(133, 70, 125, 13);
		frmSistemaEscolar.getContentPane().add(lblNumeroControl);

		JLabel lblNombreAlumno = new JLabel("NombreAlumno");
		lblNombreAlumno.setBounds(133, 109, 125, 13);
		frmSistemaEscolar.getContentPane().add(lblNombreAlumno);

		JLabel lblApellidoPaterno = new JLabel("ApellidoPaterno");
		lblApellidoPaterno.setBounds(133, 148, 125, 13);
		frmSistemaEscolar.getContentPane().add(lblApellidoPaterno);

		JLabel lblApellidoMaterno = new JLabel("ApellidoMaterno");
		lblApellidoMaterno.setBounds(133, 185, 125, 13);
		frmSistemaEscolar.getContentPane().add(lblApellidoMaterno);

		JLabel lblCarrera = new JLabel("Carrera");
		lblCarrera.setBounds(133, 224, 125, 13);
		frmSistemaEscolar.getContentPane().add(lblCarrera);

		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(133, 263, 125, 13);
		frmSistemaEscolar.getContentPane().add(lblGrupo);

		txtNumeroControl = new JTextField();
		txtNumeroControl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if (txtNumeroControl.getText().length() >= 12) {

					e.consume();

				}

			}
		});
		txtNumeroControl.setBounds(268, 64, 206, 19);
		frmSistemaEscolar.getContentPane().add(txtNumeroControl);
		txtNumeroControl.setColumns(10);

		txtNombreAlumno = new JTextField();
		txtNombreAlumno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if (txtNombreAlumno.getText().length() >= 30) {

					e.consume();

				}

			}
		});
		txtNombreAlumno.setBounds(268, 103, 206, 19);
		frmSistemaEscolar.getContentPane().add(txtNombreAlumno);
		txtNombreAlumno.setColumns(10);

		txtApellidoPaterno = new JTextField();
		txtApellidoPaterno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if (txtApellidoPaterno.getText().length() >= 30) {

					e.consume();

				}

			}
		});
		txtApellidoPaterno.setBounds(268, 142, 206, 19);
		frmSistemaEscolar.getContentPane().add(txtApellidoPaterno);
		txtApellidoPaterno.setColumns(10);

		txtApellidoMaterno = new JTextField();
		txtApellidoMaterno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if (txtApellidoMaterno.getText().length() >= 30) {

					e.consume();

				}

			}
		});
		txtApellidoMaterno.setBounds(268, 179, 206, 19);
		frmSistemaEscolar.getContentPane().add(txtApellidoMaterno);
		txtApellidoMaterno.setColumns(10);

		txtCarrera = new JTextField();
		txtCarrera.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if (txtCarrera.getText().length() >= 20) {

					e.consume();

				}

			}
		});
		txtCarrera.setBounds(268, 218, 206, 19);
		frmSistemaEscolar.getContentPane().add(txtCarrera);
		txtCarrera.setColumns(10);

		txtGrupo = new JTextField();
		txtGrupo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				if (txtGrupo.getText().length() >= 10) {

					e.consume();

				}

			}
		});
		txtGrupo.setBounds(268, 257, 206, 19);
		frmSistemaEscolar.getContentPane().add(txtGrupo);
		txtGrupo.setColumns(10);

		JButton btnInsertar = new JButton("INSERTAR");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ng.setNumeroControl(txtNumeroControl.getText());
				ng.setNombreAlumno(txtNombreAlumno.getText());
				ng.setApellidoPaterno(txtApellidoPaterno.getText());
				ng.setApellidoMaterno(txtApellidoMaterno.getText());
				ng.setCarrera(txtCarrera.getText());
				ng.setGrupo(txtGrupo.getText());

				if (ng.insertar()) {

					JOptionPane.showMessageDialog(null, "SE INSERTO CORRECTAMENTE");

					limpiar();

				} else {

					JOptionPane.showMessageDialog(null, "ACCION FALLIDA");

				}

			}
		});
		btnInsertar.setBounds(40, 386, 125, 21);
		frmSistemaEscolar.getContentPane().add(btnInsertar);

		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					String id = JOptionPane.showInputDialog("INTRODUCE EL NUMERO DE CONTROL A ELIMINAR");

					ng.setNumeroControl(id);

					if (ng.eliminar()) {

						JOptionPane.showMessageDialog(null, "SE ELIMINA CORRECTAMENTE EL REGISTRO");

					} else {

						JOptionPane.showMessageDialog(null, "ACCION FALLIDA");

					}

				} catch (Exception e2) {

					JOptionPane.showMessageDialog(null, "ERROR");

				}

			}
		});
		btnEliminar.setBounds(175, 386, 125, 21);
		frmSistemaEscolar.getContentPane().add(btnEliminar);

		JButton btnCargar = new JButton("CARGAR");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					String id = JOptionPane.showInputDialog("INTRODUCE EL NUMERO DE CONTROL A MOSTRAR");

					ng.setNumeroControl(id);

					if (ng.cargar()) {

						txtNumeroControl.setText("" + ng.getNumeroControl());
						txtNombreAlumno.setText("" + ng.getNombreAlumno());
						txtApellidoPaterno.setText("" + ng.getApellidoPaterno());
						txtApellidoMaterno.setText("" + ng.getApellidoMaterno());
						txtCarrera.setText("" + ng.getCarrera());
						txtGrupo.setText("" + ng.getGrupo());

						JOptionPane.showMessageDialog(null, "SE MUESTRA CORRECTAMENTE LOS DATOS");

					} else {

						JOptionPane.showMessageDialog(null, "ACCION FALLIDA");

					}

				} catch (Exception e2) {

					JOptionPane.showMessageDialog(null, "ERROR");

				}

			}
		});
		btnCargar.setBounds(310, 386, 125, 21);
		frmSistemaEscolar.getContentPane().add(btnCargar);

		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ng.setNumeroControl(txtNumeroControl.getText());
				ng.setNombreAlumno(txtNombreAlumno.getText());
				ng.setApellidoPaterno(txtApellidoPaterno.getText());
				ng.setApellidoMaterno(txtApellidoMaterno.getText());
				ng.setCarrera(txtCarrera.getText());
				ng.setGrupo(txtGrupo.getText());

				if (ng.actualizar()) {

					JOptionPane.showMessageDialog(null, "SE ACTUALIZA CORRECTAMENTE");

					limpiar();

				} else {

					JOptionPane.showMessageDialog(null, "ACCION FALLIDA");

				}

			}
		});
		btnActualizar.setBounds(445, 386, 125, 21);
		frmSistemaEscolar.getContentPane().add(btnActualizar);
	}

	public void limpiar() {

		txtNumeroControl.setText("");
		txtNombreAlumno.setText("");
		txtApellidoPaterno.setText("");
		txtApellidoMaterno.setText("");
		txtCarrera.setText("");
		txtGrupo.setText("");

	}

}
