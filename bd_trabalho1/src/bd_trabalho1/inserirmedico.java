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

public class inserirmedico extends JFrame {

	public int nBI = 0;
	public String nome = "";
	public String datanascimento = "";
	public int ntelemovel = 0;
	public String mail = "";
	public String morada = "";
	public String codpostal = "";
	public String localidade = "";
	public String sexo = "";
	public String password = "";
	public String horaentrada = "";
	public String horasaida = "";

	private javax.swing.JButton jButton1;
	private javax.swing.JEditorPane jEditorPane2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSlider jSlider1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;

	// JDBC driver name and database URL
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DATABASE_URL = "jdbc:mysql://localhost/centrodesaude";

	// launch the application
	Connection connection = null; // manages connection

	public inserirmedico() {

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Inserir Novo Médico no Sistema");
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
		jLabel1 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jTextField8 = new javax.swing.JTextField();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jTextField10 = new javax.swing.JTextField();
		jTextField11 = new javax.swing.JTextField();
		jTextField12 = new javax.swing.JTextField();
		jScrollPane2 = new javax.swing.JScrollPane();
		jEditorPane2 = new javax.swing.JEditorPane();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel2.setText("B.I.:");

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel3.setText("Data de Nascimento: ");

		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel4.setText("Contacto Telefónico: ");

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel5.setText("Nome:");

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel6.setText("E-mail:");

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setText("Morada:");

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

		jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel14.setText("Código Postal:");

		jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel15.setText("Localidade:");

		jLabel16.setForeground(new java.awt.Color(255, 0, 0));
		jLabel16.setText("*");

		jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel17.setText("Sexo:");

		jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel18.setText("Password:");

		jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel19.setText("Hora de Entrada (hh:mm) :");

		jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel20.setText("Hora de Saída (hh:mm) :");

		jEditorPane2.setBackground(new java.awt.Color(0, 153, 153));
		jEditorPane2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jEditorPane2.setForeground(new java.awt.Color(240, 240, 240));
		jEditorPane2.setText("           INSERIR NOVO MÉDICO NO SISTEMA");
		jScrollPane2.setViewportView(jEditorPane2);

		jLabel21.setForeground(new java.awt.Color(255, 0, 0));
		jLabel21.setText("*");

		jLabel22.setForeground(new java.awt.Color(255, 0, 0));
		jLabel22.setText("*");

		jLabel23.setForeground(new java.awt.Color(255, 0, 0));
		jLabel23.setText("*");

		jLabel24.setForeground(new java.awt.Color(255, 0, 0));
		jLabel24.setText("*");

		jLabel25.setForeground(new java.awt.Color(255, 0, 0));
		jLabel25.setText("*");

		jLabel26.setForeground(new java.awt.Color(255, 0, 0));
		jLabel26.setText("*");

		jLabel27.setForeground(new java.awt.Color(255, 0, 0));
		jLabel27.setText("*");

		jButton1.setBackground(new java.awt.Color(0, 51, 51));
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("VOLTAR");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				new opcaofuncionario();
			}
		});

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				nBI = Integer.parseInt(jTextField1.getText());
			}
		});

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				nome = jTextField2.getText();
			}
		});

		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				datanascimento = jTextField3.getText();
			}
		});

		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				ntelemovel = Integer.parseInt(jTextField4.getText());
			}
		});

		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				mail = jTextField5.getText();
			}
		});

		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				morada = jTextField6.getText();
			}
		});

		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				codpostal = jTextField7.getText();
			}
		});

		jTextField8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				localidade = jTextField8.getText();
			}
		});

		jTextField9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				sexo = jTextField9.getText();
			}
		});

		jTextField10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				password = jTextField10.getText();
			}
		});

		jTextField11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				horaentrada = jTextField11.getText();
			}
		});

		jTextField12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				horasaida = jTextField12.getText();

				new testeinserir5(nBI, nome, datanascimento, ntelemovel, mail,
						morada, codpostal, localidade, sexo, password,
						horaentrada, horasaida);
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
								.addGap(36, 36, 36)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel8)
												.addComponent(jLabel9)
												.addComponent(jLabel12)
												.addComponent(jLabel1)
												.addComponent(jLabel13)
												.addComponent(jLabel16)
												.addComponent(jLabel21)
												.addComponent(jLabel22)
												.addComponent(jLabel23)
												.addComponent(jLabel24)
												.addComponent(jLabel25)
												.addComponent(jLabel26)
												.addComponent(jLabel27))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel20)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField12))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel19)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField11))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel18)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField10))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel17)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField9))
												.addComponent(jLabel11)
												.addComponent(jLabel10)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel3)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField3))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField1))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel5)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField2))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel4)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField4))
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
																		jLabel7)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField6))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel14)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField7,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		390,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel15)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField8)))
								.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										96,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(242, 242, 242))
				.addComponent(jScrollPane2));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jScrollPane2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(41, 41, 41)
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
												.addComponent(jLabel5)
												.addComponent(jLabel1)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(jLabel13)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(jLabel9)
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel6)
																.addComponent(
																		jLabel16))
												.addComponent(
														jTextField5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel7)
																.addComponent(
																		jLabel21))
												.addComponent(
														jTextField6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField7,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel14)
												.addComponent(jLabel22))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel15)
												.addComponent(
														jTextField8,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel23))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel17)
												.addComponent(
														jTextField9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel24))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel18)
												.addComponent(
														jTextField10,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel25))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel19)
												.addComponent(
														jTextField11,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel26))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel20)
																.addComponent(
																		jLabel27))
												.addComponent(
														jTextField12,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										68, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(jLabel12))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel11)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										33,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(15, 15, 15)));

		pack();
		setVisible(true);
		setLocationRelativeTo(null);

	}

	// execute application
	public void main(String args[]) {
		new inserirmedico();

	} // end main

}