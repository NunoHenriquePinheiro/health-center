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

public class enfermeirocredenciais extends JFrame {

	private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;

	public int BI_enf;
	public String password_enf;

	// JDBC driver name and database URL
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DATABASE_URL = "jdbc:mysql://localhost/centrodesaude";

	// launch the application
	Connection connection = null; // manages connection
	Statement statement = null; // query statement

	public enfermeirocredenciais() {
		
		setTitle("Credenciais do Enfermeiro");
		setResizable(false);


		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Utilizador: Enfermeiro");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("B.I.: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Password:");

        jTextField1.setBackground(new java.awt.Color(153, 204, 255));
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	BI_enf = Integer.parseInt(jTextField1.getText());
            }
        });
        
        jPasswordField1.setBackground(new java.awt.Color(153, 204, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	password_enf = jPasswordField1.getText();
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Submeter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					Class.forName(JDBC_DRIVER); // load database driver class

					// establish connection to database
					connection = DriverManager.getConnection(DATABASE_URL, "root", "malmequer");

					// create Statement for querying database
					statement = connection.createStatement();

					// query database
					ResultSet resultSet = statement.executeQuery("SELECT * FROM mydb.Enfermeiro");

					// process query results
					ResultSetMetaData metaData = resultSet.getMetaData();
					
					int numberOfColumns = metaData.getColumnCount();
					String ColumnName = null;
					
					// CONDICOES PARA VALIDAR ENTRADA DO PESSOAL NO SISTEMA
					
					int indexBI=0;					// TEM DE COMECAR EM 0!!!
					boolean BIAceite=false;
					
					for (int i = 1; i <= numberOfColumns; i++ )
					{
						ColumnName = metaData.getColumnName(i);
						if (ColumnName.equals("n_BI"))
						{
							while (resultSet.next())
							{
								indexBI++;
								int biMed= (Integer) (resultSet.getObject(i));
								
								if (BI_enf == biMed)
								{
									BIAceite= true;
									break;
								}
							}
						}
					}
					
					int contadorPass=0;					// TEM DE COMECAR EM 0!!!
					boolean passAceite=false;
					resultSet.beforeFirst();			// TEMOS DE LIMPAR O RESULTSET.NEXT()
					for (int i = 1; i <= numberOfColumns; i++ )
					{
						ColumnName = metaData.getColumnName(i);
						if (ColumnName.equals("password"))
						{
							while (resultSet.next())
							{
								contadorPass++;
								String passMed = (String) resultSet.getObject(i);
								
								
								if ( (indexBI == contadorPass) && (passMed.equals(password_enf)) )
								{
									passAceite= true;
									break;
								}
							}
						}
					}
					
					// VALIDACAO DA PASSWORD, CONSOANTE O BI
					if (passAceite==true && BIAceite==true)
					{
						
					
						new opcaoenfermeiro();
						
						
					}
					else{
						
						
						new opcaoerroenfermeiro();
						
						
					}
					
				} // end try
				catch (SQLException sqlException) {
					sqlException.printStackTrace();
					System.exit(1);
				} // end catch
				catch (ClassNotFoundException classNotFound) {
					classNotFound.printStackTrace();
					System.exit(1);
				} // end catch
				finally // ensure statement and connection are closed properly
				{
					try {
						statement.close();
						connection.close();
					} // end try
					catch (Exception exception) {
						exception.printStackTrace();
						System.exit(1);
					} // end catch
				} // end finally
			}
		});
            

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
	);

		pack();
		setVisible(true);
		setLocationRelativeTo(null);

	} // end main
		// end class DisplayAuthors
}

