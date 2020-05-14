package bd_trabalho1;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.*;


import java.awt.*;

public class programaprincipal extends JFrame {
	
	public programaprincipal(){
		iniciar1();
	}
	
	
	private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
	
    
    
    //*****************TABELA INICIAL********************
    //***************************************************
    //ESCOLHER QUAL O UTILIZADOR, A PARTIR DE BOTOES
    //PODE SER MEDICO, ENFERMEIRO OU FUNCIONARIO
	private void iniciar1() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();

        //CONSTRUCAO DO PRIMEIRO MENU
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfis");
        setResizable(false);

        jLabel1.setFont(new Font("Tahoma", 1, 18)); 
        jLabel1.setForeground(new Color(0, 102, 102));
        jLabel1.setText("BEM-VINDO AO CENTRO DE SAÚDE!");

        jLabel2.setFont(new Font("Tahoma", 1, 14)); 
        jLabel2.setForeground(new Color(0, 102, 204));
        jLabel2.setText("Introduza o seu tipo de perfil:");

        //BOTAO1 - MEDICO
        jButton1.setBackground(new Color(204,255,255));
        jButton1.setText("MÉDICO");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            	//CARREGANDO NO BOTAO DE MEDICO, IRA APARECER UM NOVO MENU, PARA SE INTRODUZIR AS CREDENCIAIS
            	
            	new medicocredenciais();
            }
        });
        
        
      //BOTAO2 - ENFERMEIRO
        jButton2.setBackground(new Color(204,255,255));
        jButton2.setText("ENFERMEIRO");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               
            	//CARREGANDO NO BOTAO DE ENFERMEIRO, IRA APARECER UM NOVO MENU, PARA SE INTRODUZIR AS CREDENCIAIS
            	new enfermeirocredenciais();
            }
        });
        
        
      //BOTAO3 - FUNCIONARIO
        jButton3.setBackground(new Color(204,255,255));
        jButton3.setText("FUNCIONÁRIO");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               
            	//CARREGANDO NO BOTAO DE FUNCIONARIO, IRA APARECER UM NOVO MENU, PARA SE INTRODUZIR AS CREDENCIAIS
            	new funcionariocredenciais();
            }
        });
        
        
        //********ORGANIZACAO DE ESPACOS NA PRIMEIRA TABELA INICIAL*********
        //******************************************************************
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );


       pack();
        
        setVisible( true );
        setLocationRelativeTo(null);
    }
	
	
	
	// execute application
	public static void main( String args[] ) 
	{
	   new programaprincipal();     
	} // end main
} // end class DisplayQueryResults






