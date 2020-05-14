package bd_trabalho1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JFrame;

public class inserirhistorico extends JFrame {

	public int utenBI = 0;
	public int medBI = 0;
	public int enfBI = 0;
	public int funcBI = 0;
	public String ultimaConsulta = "";
	public String infoImportante = "";

	private javax.swing.JButton jButton1;
	private javax.swing.JEditorPane jEditorPane1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;

	// JDBC driver name and database URL
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DATABASE_URL = "jdbc:mysql://localhost/centrodesaude";

	// launch the application
	Connection connection = null; // manages connection

	public inserirhistorico() {

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Inserir Novo Histórico do Utente:");
		setResizable(false);

		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jEditorPane1 = new javax.swing.JEditorPane();
		jScrollPane1 = new javax.swing.JScrollPane();
		jLabel1 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel2.setText("B.I. Utente:");

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel3.setText("B.I. Médico:");

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel4.setText("B.I. Enfermeiro:");

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel5.setText("B.I. Funcionário:");

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel6.setText("Data Última Consulta (YYYY-MM-DD):");

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setText("Informações Importantes:");

		jLabel8.setForeground(new java.awt.Color(255, 0, 0));
		jLabel8.setText("*");

		jLabel9.setForeground(new java.awt.Color(255, 0, 0));
		jLabel9.setText("*");

		jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
		jLabel10.setText("Indica carácter obrigatório;");

		jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
		jLabel11.setText("Inserir um ENTER no fim de cada preenchimento.");

		jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(255, 0, 0));
		jLabel12.setText("*");

		jLabel1.setForeground(new java.awt.Color(255, 0, 0));
		jLabel1.setText("*");

		jLabel13.setForeground(new java.awt.Color(255, 0, 0));
		jLabel13.setText("*");

		jButton1.setBackground(new java.awt.Color(0, 51, 51));
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("VOLTAR");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				new opcaofuncionario();
			}
		});

		jEditorPane1.setBackground(new java.awt.Color(0, 51, 51));
		jEditorPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jEditorPane1.setForeground(new java.awt.Color(255, 255, 255));
		jEditorPane1.setText("                 INSERIR HISTÓRICO DO UTENTE");
		jScrollPane1.setViewportView(jEditorPane1);

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				utenBI = Integer.parseInt(jTextField1.getText());
			}
		});

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				medBI = Integer.parseInt(jTextField2.getText());
			}
		});

		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				enfBI = Integer.parseInt(jTextField3.getText());
			}
		});

		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				funcBI = Integer.parseInt(jTextField4.getText());
			}
		});

		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				ultimaConsulta = jTextField5.getText();
			}
		});

		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				infoImportante = jTextField6.getText();

				new testeinserir3(utenBI, medBI, enfBI, funcBI, ultimaConsulta,
						infoImportante);
				// new inserirregistoclinico( dataRegistoClinico,
				// biMedRegistoClinico, biUtenRegistoClinico, exameRotina,
				// exameEspecial, descricaoClinico, observacoesClinico );

			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(271, 271, 271)
								.addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										96,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))
				.addComponent(jScrollPane1)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(36, 36, 36)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel8)
												.addComponent(jLabel9)
												.addComponent(jLabel12)
												.addComponent(jLabel1)
												.addComponent(jLabel13))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(jLabel11)
												.addComponent(jLabel10)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel4)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField3))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel6)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField5))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel5)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField4))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel3)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField2))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		412,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel7)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField6)))
								.addGap(23, 100, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(42, 42, 42)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jLabel8)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel13))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(jLabel9)
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(13, 13, 13)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(
														jTextField5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(
														jTextField6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(64, 64, 64)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(jLabel12))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel11)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										10, Short.MAX_VALUE)
								.addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										33,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(19, 19, 19)));

		pack();
		setVisible(true);
		setLocationRelativeTo(null);

	}

	// execute application
	public void main(String args[]) {
		new inserirhistorico();

	} // end main

}
