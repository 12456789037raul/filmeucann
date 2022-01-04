package views;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Enums.FilePathEnum;
import Enums.SexoEnum;
import filePessoa.Write;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Pessoa;
import models.Sexo;




/**
 *
 * @author fdelgado
 */
public class PessoaForm  extends JFrame {
   
    
 private Pessoa pessoa;

private JTextField nomeJT,emailJT,dataCadastroJT,dataNascimentoJt,biJT,loginJT , idJT, telemovelJT;
private JButton salvarJB,limparJB,cancelarJB;
private JCheckBox acessoCKB;
private JRadioButton mRB,fRB;
private JComboBox sexoCB ;
private JPasswordField  passwordJPF;
private JPanel p1,p2,p3,p4,p5,p6,p7;
private String valores [] ={SexoEnum.MASCULINO.nome, SexoEnum.FEMININO.nome}; 



    public PessoaForm()
    {
        super("Formulario Pessoa");
        
        inic();
             
                
        
        this.getContentPane().add(p1,BorderLayout.CENTER);
       this.getContentPane().add(p7,BorderLayout.SOUTH);
        
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void inic()
    {

            nomeJT = new JTextField();
            emailJT = new JTextField();
            dataCadastroJT = new JTextField();
            dataNascimentoJt = new JTextField();
            idJT = new JTextField();
            biJT = new JTextField();
            telemovelJT = new JTextField();
            loginJT  = new JTextField();
            salvarJB = new JButton("Salvar");
            limparJB= new JButton("Limpar");
            cancelarJB= new JButton("Cancelar");

            acessoCKB = new JCheckBox();
            mRB = new JRadioButton("Masculino");
            fRB = new JRadioButton("Femenino");
            sexoCB = new JComboBox(valores) ;
            passwordJPF = new JPasswordField();
            p1 = new JPanel();
            p2 = new JPanel();
            p3 = new JPanel();
            p4 = new JPanel();
            p5 = new JPanel();
            p6 = new JPanel();
            p7  = new JPanel();
            
            
            p1.setLayout(new GridLayout(2,1));
            p1.add(p2);
            p1.add(p3);
            
            
            p2.setLayout(new GridLayout(9,2));
            
            p2.add(new JLabel("Dados Pessoais"));
            p2.add(new JLabel(""));
            
            p2.add(new JLabel("Id"));
            p2.add(idJT);
            
            p2.add(new JLabel("Nome"));
            p2.add(nomeJT);
            
            p2.add(new JLabel("Email"));
            p2.add(emailJT);
            
            p2.add(new JLabel("data de Cadastro"));
            p2.add(dataCadastroJT);
            
            p2.add(new JLabel("Data Nascimento"));
            p2.add(dataNascimentoJt);
            
            p2.add(new JLabel("BI"));
            p2.add(biJT);
            
            p2.add(new JLabel("Telemovel"));
            p2.add(telemovelJT);
            
            p2.add(new JLabel("Sexo"));
            p2.add(sexoCB);
            
            
            
                      
           
            p7.setLayout(new GridLayout(1,3));
            p7.add(salvarJB);
            p7.add(limparJB);
            p7.add(cancelarJB);
    
    
        salvarJB.addActionListener( (e) -> {
            //Pessoa(int idPessoa, String nome, String bi, LocalDate data_nascimento, LocalDate data_cadastro, String Email, String telemovel)
            
            int idPessoa = Integer.parseInt( idJT.getText().trim() );
            LocalDate dataNascimento = LocalDate.parse ((CharSequence) dataNascimentoJt.getText().trim() );
            this.pessoa = new Pessoa( 
                    idPessoa , 
                    nomeJT.getText().trim(), 
                    biJT.getText().trim(), 
                    dataNascimento, 
                    LocalDate.now(), 
                    emailJT.getText().trim(), 
                    telemovelJT.getText().trim()
            );
            String nomeSexo = sexoCB.getSelectedItem().toString();
            pessoa.setSexo( new Sexo( nomeSexo ) );
            System.out.println(FilePathEnum.PESSOA.pathName);
           
                try {
                     Write file = new Write( FilePathEnum.PESSOA.pathName, pessoa);
                    file.writeNow();
                     JOptionPane.showMessageDialog(null, "Dados salvo com sucesso", "Ação", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                     JOptionPane.showMessageDialog(null, "Erro ao salvar os dados", "Ação", JOptionPane.INFORMATION_MESSAGE);
                    Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            
          
        });
    
    
    }
    
}
