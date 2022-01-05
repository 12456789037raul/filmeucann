/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import models.Pessoa;

/**
 *
 * @author vicente-jpro
 */
public class ReadJframe extends JFrame{
    
	// JFrame
	private JFrame frameJF;

	// JButton
	private JButton buttonJB;

	// label to display text
	private JLabel labelJL;

	// text area
	private JTextArea textAriaJT;
        private List<Pessoa> lista;
	
        public ReadJframe(){
     

    }
        
        
    public ReadJframe(List<Pessoa> lista){
        this.lista = new ArrayList<Pessoa>();
        init();

    }

    
    public void init(){
    
    		// create a new frame to store text field and button
		this.frameJF = new JFrame("textfield");

		// create a label to display text
		this.labelJL = new JLabel("nothing entered");

		// create a new button
		this.buttonJB = new JButton("submit");

                

		String text = "";

                for(int i = 0; i<lista.size(); i++){
                
                    text +=  lista.get(i)+"\n";
                
               
                
                }
                
                // create a text area, specifying the rows and columns
		this.textAriaJT = new JTextArea(text);
                
                
                
                
		JPanel p = new JPanel();
		// add the text area and button to panel
		p.add(textAriaJT);
		p.add(buttonJB);
		p.add(labelJL);

		frameJF.add(p);
		// set the size of frame
		frameJF.setSize(300, 300);

		frameJF.show();
                
    
    }
                
}
	
