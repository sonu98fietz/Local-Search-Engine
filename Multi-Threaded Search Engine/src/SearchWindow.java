

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SearchWindow extends JFrame
{
       JPanel jp = new JPanel();
       JLabel jl = new JLabel();
       JTextField jt1 = new JTextField(30);
       JLabel jl2 = new JLabel();
       JButton jb = new JButton("Search");
 
      

       public SearchWindow()
       {
    	 
              setTitle("Search Window");
              setSize(600, 600);
              setDefaultCloseOperation(EXIT_ON_CLOSE);
              jp.setLayout(null);
              JCheckBox c1 = new JCheckBox("C: Drive");
              JCheckBox c2 = new JCheckBox("E: Drive");
              JCheckBox c3 = new JCheckBox("F: Drive");
        
              c1.setBounds(10,20, 80,25); 
              c2.setBounds(180,20, 80,25); 
              c3.setBounds(330,20, 80,25); 
              jp.add(c1);
              jp.add(c2);
              jp.add(c3);

              JLabel label = new JLabel("Enter the file name to search : ");
              label.setFont(new Font("Verdana", Font.PLAIN, 18));
              label.setBounds(10,50, 300,25); 
              jp.add(label);
              jt1.setBounds(310,55, 250,25); 
              jp.add(jt1);

              jp.add(jb);
              jb.setBounds(200,90, 80,25); 
              jl2.setBounds(10,130, 560,400); 
              jl.setBounds(10,130, 560,400); 
              jt1.addActionListener(new ActionListener()
              {
                     public void actionPerformed(ActionEvent e)
                     {
                           String input = jt1.getText();
                           jl.setText(input); 
                     }
              });
              jb.addActionListener(new ActionListener()
              {
                      public void actionPerformed(ActionEvent e)
                      {
                             String input = jt1.getText();
                             jl.setText(input);
                      }
              });
              jp.add(jl2);
              jp.add(jl,BorderLayout.NORTH);
              setVisible(true);
              add(jp);
            
          
       }

       public static void main(String[] args)
       {
    	   SearchWindow t = new SearchWindow();
       }
}
