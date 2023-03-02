package GUIusers;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Usuarios.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CRUD_Users {

	private JFrame frame;
	private JFrame frame_1;
	private JTextField textFieldCorreo;
	private JTextField textFieldContrasena;
	DefaultListModel ModelList = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUD_Users window = new CRUD_Users();
					window.frame_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CRUD_Users() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame_1 = new JFrame();
		frame_1.setResizable(false);
		frame_1.setTitle("Gestor de usuarios");
		frame_1.setSize(650, 350);
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_1.getContentPane().setLayout(null);
		frame_1.setBackground(Color.cyan);
		
		JLabel lblNewLabel = new JLabel("Gestionar usuarios |");
		lblNewLabel.setBounds(27, 24, 110, 28);
		frame_1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(27, 73, 73, 28);
		frame_1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(27, 236, 73, 14);
		frame_1.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo:");
		lblNewLabel_3.setBounds(27, 261, 73, 14);
		frame_1.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña:");
		lblNewLabel_4.setBounds(27, 286, 73, 14);
		frame_1.getContentPane().add(lblNewLabel_4);
		
		JLabel lblTitulo = new JLabel("");
		lblTitulo.setBounds(108, 236, 78, 14);
		frame_1.getContentPane().add(lblTitulo);
		
		JLabel lblOriginal = new JLabel("");
		lblOriginal.setBounds(108, 261, 78, 14);
		frame_1.getContentPane().add(lblOriginal);
		
		JLabel lblPrestable = new JLabel("");
		lblPrestable.setBounds(108, 286, 78, 14);
		frame_1.getContentPane().add(lblPrestable);
		
		JButton btnAgregarUsuario = new JButton("Agregar usuario");
		btnAgregarUsuario.setBounds(256, 159, 125, 23);
		frame_1.getContentPane().add(btnAgregarUsuario);
		
		JButton btnEliminarUsuario = new JButton("Eliminar usuario");
		btnEliminarUsuario.setBounds(256, 227, 125, 23);
		frame_1.getContentPane().add(btnEliminarUsuario);
		
		JList list = new JList();
		list.setBounds(438, 30, 144, 245);
		list.setModel(ModelList);
		frame_1.getContentPane().add(list);
		
		JTextField textFieldNombre = new JTextField();
		textFieldNombre.setBounds(103, 77, 125, 20);
		frame_1.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JButton btnEditarUsuario = new JButton("Editar usuario");
		btnEditarUsuario.setBounds(256, 193, 125, 23);
		frame_1.getContentPane().add(btnEditarUsuario);
		
		JLabel lblNewLabel_5 = new JLabel("Correo:");
		lblNewLabel_5.setBounds(27, 106, 46, 32);
		frame_1.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contraseña:");
		lblNewLabel_6.setBounds(27, 146, 73, 14);
		frame_1.getContentPane().add(lblNewLabel_6);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setBounds(103, 112, 125, 20);
		frame_1.getContentPane().add(textFieldCorreo);
		textFieldCorreo.setColumns(10);
		
		textFieldContrasena = new JTextField();
		textFieldContrasena.setBounds(103, 143, 125, 20);
		frame_1.getContentPane().add(textFieldContrasena);
		textFieldContrasena.setColumns(10);
		
		//Acciones
		btnAgregarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Nombre, Correo, Contrasena;
				try {
					
					Nombre = textFieldNombre.getText();
					Correo = textFieldCorreo.getText();
					Contrasena = textFieldContrasena.getText();
					
					if (Nombre.isEmpty() || Correo.isEmpty() || Contrasena.isEmpty()) {
						
						JOptionPane.showMessageDialog(frame_1, "Debe de rellenar todos los campos!");
					}
					else {
						Usuario objUsuario = new Usuario(Nombre, Correo, Contrasena);
						ModelList.addElement(objUsuario);
						JOptionPane.showMessageDialog(frame_1, "Se ha agregado con exitos el usuario!");
					}
					

					textFieldNombre.setText(null);
					textFieldCorreo.setText(null);
					textFieldContrasena.setText(null);
					
				} catch (Exception ex) {
					System.out.print("Ha ocurrido un error: " + ex);
					JOptionPane.showMessageDialog(frame_1, "Ha ocurrido un error, no se ha podido agregar el usuario");
					textFieldNombre.setText(null);
					textFieldCorreo.setText(null);
					textFieldContrasena.setText(null);
				}
				
				
				
				
			}
		});
	}
}
