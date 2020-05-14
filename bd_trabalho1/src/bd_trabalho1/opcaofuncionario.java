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

public class opcaofuncionario extends JFrame {

	private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;

	// JDBC driver name and database URL
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DATABASE_URL = "jdbc:mysql://localhost/centrodesaude";

	// launch the application
	Connection connection = null; // manages connection

	public opcaofuncionario() {

		jLabel1 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jRadioButton3 = new javax.swing.JRadioButton();
		jRadioButton4 = new javax.swing.JRadioButton();
		jRadioButton5 = new javax.swing.JRadioButton();
		jRadioButton6 = new javax.swing.JRadioButton();
		jRadioButton7 = new javax.swing.JRadioButton();
		jRadioButton8 = new javax.swing.JRadioButton();
		jRadioButton9 = new javax.swing.JRadioButton();
		jRadioButton10 = new javax.swing.JRadioButton();
		jRadioButton11 = new javax.swing.JRadioButton();
		jRadioButton12 = new javax.swing.JRadioButton();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Escolher Opção");
		setResizable(false);
		
		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("ESCOLHA UMA DAS SEGUINTES OPÇÕES:");

        //VER HISTORICO UTENTE
        jRadioButton1.setText("Ver Histórico Utente");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new verhistoricoutenteFunc();
            }
        });

        jRadioButton2.setText("Inserir Histórico Utente");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new inserirhistorico();
            }
        });
        
        //VER CONSULTAS
        jRadioButton3.setText("Ver Consultas");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new verconsultas();
            }
        });
        
        

        jRadioButton4.setText("Inserir Consulta");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new inserirconsulta();
            }
        });

        //VER MEDICOS
        jRadioButton5.setText("Ver Médicos");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new vermedicos();
            }
        });

        jRadioButton6.setText("Inserir Médico");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new inserirmedico();
            }
        });

        //VER ENFERMEIROS
        jRadioButton7.setText("Ver Enfermeiros");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new verenfermeiros();
            }
        });
        
        

        jRadioButton8.setText("Inserir Enfermeiro");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new inserirenfermeiro();
            }
        });

        
        //VER FUNCIONARIOS
        jRadioButton9.setText("Ver Funcionários");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new verfuncionarios();
            }
        });

        jRadioButton10.setText("Inserir Funcionário");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new inserirfuncionario();
            }
        });

      //VER UTENTES
        jRadioButton11.setText("Ver Utentes");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new verutentes();
            }
        });
        
        
        jRadioButton12.setText("Inserir Utente");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	new inserirutente();
            }
        });
       

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton3)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(27, 27, 27)
                                .addComponent(jRadioButton4)
                                .addGap(9, 9, 9)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton12))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
		setLocationRelativeTo(null);
        
	}

}
