package bd_trabalho1;

//Fig. 25.31: DisplayQueryResults.java
//Display the contents of the Authors table in the
//Books database.
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.color.*;

import bd_trabalho1.verhistoricoutente;
import bd_trabalho1.resulttablehistorico;


public class verenfermeiros extends JFrame {
	
	private javax.swing.JButton submitButton;

	// JDBC driver, database URL, username and password
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DATABASE_URL = "jdbc:mysql://localhost/centrodesaude";
	static final String USERNAME= "root";
	static final String PASSWORD= "malmequer";

	// default query retrieves all data from authors table
	static final String DEFAULT_QUERY = "SELECT * FROM mydb.Enfermeiro";

	private resulttablehistorico tableModel;
	

	// create resulttablehistorico and GUI
	public verenfermeiros() 
	{   
	   super( "Enfermeiros no Sistema" );
	     
	   // create resulttablehistorico and display database table
	   try 
	   {
	      // create TableModel for results of query SELECT * FROM authors
	      tableModel = new resulttablehistorico( JDBC_DRIVER, DATABASE_URL, 
	         USERNAME, PASSWORD, DEFAULT_QUERY );

	      // set up JTextArea in which user types queries
	     
	     
	      
	      // create Box to manage placement of queryArea and 
	      // submitButton in GUI
	      Box box = Box.createHorizontalBox();
	      

	      // create JTable delegate for tableModel 
	      JTable resultTable = new JTable( tableModel );
	      resultTable.setBackground(new java.awt.Color(255,204,204));
	      resultTable.setFont(new java.awt.Font("Tahoma", 1, 11));
	      
	   // place GUI components on content pane
	      add( box, BorderLayout.NORTH );
	      add( new JScrollPane( resultTable ), BorderLayout.CENTER );

	      
	   // set up JButton for submitting queries
	      JButton submitButton = new JButton( "VOLTAR" );
	      submitButton.setBackground(new java.awt.Color(153,255,153));
	      submitButton.setFont(new java.awt.Font("Tahoma", 1, 11));
	      box.add( submitButton );
	      
	      
	      // create event listener for submitButton
	      submitButton.addActionListener( 
	      
	         new ActionListener() 
	         {
	            // pass query to table model
	            public void actionPerformed( ActionEvent event )
	            {
	            	new opcaofuncionario();
	            } // end actionPerformed
	         }  // end ActionListener inner class          
	      ); // end call to addActionListener

	      setSize( 1400, 150 ); // set window size
	      setVisible( true ); // display window  
	   } // end try
	   catch ( ClassNotFoundException classNotFound ) 
	   {
	      JOptionPane.showMessageDialog( null, 
	         "MySQL driver not found", "Driver not found",
	         JOptionPane.ERROR_MESSAGE );
	      
	      System.exit( 1 ); // terminate application
	   } // end catch
	   catch ( SQLException sqlException ) 
	   {
	      JOptionPane.showMessageDialog( null, sqlException.getMessage(), 
	         "Database error", JOptionPane.ERROR_MESSAGE );
	            
	      // ensure database connection is closed
	      tableModel.disconnectFromDatabase();
	      
	      System.exit( 1 );   // terminate application
	   } // end catch
	   
	   // dispose of window when user quits application (this overrides
	   // the default of HIDE_ON_CLOSE)
	   setDefaultCloseOperation( DISPOSE_ON_CLOSE );
	   
	   // ensure database connection is closed when user quits application
	   addWindowListener(
	   
	      new WindowAdapter() 
	      {
	         // disconnect from database and exit when window has closed
	         public void windowClosed( WindowEvent event )
	         {
	            tableModel.disconnectFromDatabase();
	            System.exit( 0 );
	         } // end method windowClosed
	      } // end WindowAdapter inner class
	   ); // end call to addWindowListener´
	   
	   setLocationRelativeTo(null);
	     
	} // end DisplayQueryResults constructor

	// execute application
	public static void main( String args[] ) 
	{
	   new verenfermeiros();     
	} // end main
	} // end class DisplayQueryResults
	
	

