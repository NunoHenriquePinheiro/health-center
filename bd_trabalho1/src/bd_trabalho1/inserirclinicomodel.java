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

public class inserirclinicomodel extends JFrame {

	public String dataRegistoClinico = "";
	public int biMedRegistoClinico = 0;
	public int biUtenRegistoClinico = 0;
	public String exameRotina = "";
	public String exameEspecial = "";
	public String descricaoClinico = "";
	public String observacoesClinico = "";

	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;

	// JDBC driver name and database URL
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DATABASE_URL = "jdbc:mysql://localhost/centrodesaude";

	// launch the application
	Connection connection = null; // manages connection

	public inserirclinicomodel() {

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Inserir Novo Registo Clinico");
		setResizable(false);

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 153, 153));
		jLabel1.setText("INSERIR NOVO REGISTO CLINICO:");

		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel2.setText("Data do Registo (YYYY-MM-DD):");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
		jLabel3.setText("Inserir um ENTER no fim de cada preenchimento;");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
		jLabel4.setText("Indica carácter obrigatório.");

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel5.setText("B.I. do Médico:");

		jLabel6.setForeground(new java.awt.Color(255, 0, 0));
		jLabel6.setText("*");

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setText("B.I. do Utente:");

		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel8.setText("Exame de Rotina:");

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel9.setText("Exame Especial:");

		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel10.setText("Descrição do Exame:");

		jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel11.setText("Observações ao Utente:");

		jLabel12.setForeground(new java.awt.Color(255, 0, 0));
		jLabel12.setText("*");

		jLabel13.setForeground(new java.awt.Color(255, 0, 0));
		jLabel13.setText("*");

		jLabel14.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
		jLabel14.setForeground(new java.awt.Color(255, 0, 0));
		jLabel14.setText("*");

		jButton1.setBackground(new java.awt.Color(204, 204, 255));
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jButton1.setText("VOLTAR");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				new opcaomedico();
			}
		});

		jTextField1.setBackground(new java.awt.Color(204, 255, 204));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				dataRegistoClinico = jTextField1.getText();
			}
		});

		jTextField2.setBackground(new java.awt.Color(204, 255, 204));
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				biMedRegistoClinico = Integer.parseInt(jTextField2.getText());
			}
		});

		jTextField3.setBackground(new java.awt.Color(204, 255, 204));
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				biUtenRegistoClinico = Integer.parseInt(jTextField3.getText());
			}
		});

		jTextField4.setBackground(new java.awt.Color(204, 255, 204));
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				exameRotina = jTextField4.getText();
			}
		});

		jTextField5.setBackground(new java.awt.Color(204, 255, 204));
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				exameEspecial = jTextField5.getText();
			}
		});

		jTextField6.setBackground(new java.awt.Color(204, 255, 204));
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				descricaoClinico = jTextField6.getText();
			}
		});

		jTextField7.setBackground(new java.awt.Color(204, 255, 204));
		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				observacoesClinico = jTextField7.getText();
				
				
				new testeinserir1( dataRegistoClinico, biMedRegistoClinico, biUtenRegistoClinico, exameRotina, exameEspecial, descricaoClinico, observacoesClinico );
				//new inserirregistoclinico( dataRegistoClinico, biMedRegistoClinico, biUtenRegistoClinico, exameRotina, exameEspecial, descricaoClinico, observacoesClinico );
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(41, 41,
																		41)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLabel6)
																				.addComponent(
																						jLabel12)
																				.addComponent(
																						jLabel13))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel5)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextField2))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel2)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextField1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										283,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel7)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextField3))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel8)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextField4))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel9)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextField5))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel10)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextField6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										347,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel11)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextField7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										328,
																										javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(69, 69,
																		69)
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		454,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(69, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(14, 14,
																		14)
																.addComponent(
																		jLabel14)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						422,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel4)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(231,
																		231,
																		231)
																.addComponent(
																		jButton1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		108,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										46,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(43, 43, 43)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jLabel6)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel5)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel12))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
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
												.addComponent(jLabel8)
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel9)
												.addComponent(
														jTextField5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														47,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel10))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField7,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														47,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel11))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										46, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jLabel14,
														javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jLabel4,
														javax.swing.GroupLayout.Alignment.TRAILING))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel3)
								.addGap(18, 18, 18)
								.addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(21, 21, 21)));

		pack();
		setVisible(true);
		setLocationRelativeTo(null);

	}

	// execute application
	public void main(String args[]) {
		new inserirclinicomodel();
		
	} // end main

}