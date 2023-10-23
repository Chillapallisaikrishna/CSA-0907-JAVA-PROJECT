package LibraryManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;



class main extends JFrame implements ActionListener 
{


    JLabel l1;
    JButton b1;
    
    public main() {
	
    	    setVisible(true);
            setSize(1266,430);
            setLayout(null);
            setLocationRelativeTo(null);

        	l1 = new JLabel("");
            b1 = new JButton("Next");
            
           
            
            
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/lms.jpg"));
            Image i3 = i1.getImage().getScaledInstance(1366,490,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            l1 = new JLabel(i2);
            l1.setBounds(0,0,585,701);            
           
            b1.setBounds(1050,250,140,60);
        	b1.setBackground(new Color(51,26,0));
        	b1.setForeground(Color.white);
        	b1.setFont(new Font("Mongolian Baiti",Font.PLAIN,25));
            l1.setBounds(0, 0, 1366, 390);
            
            l1.add(b1);
	        add(l1);
            
            b1.addActionListener(this);
}
    
    public void actionPerformed(ActionEvent ae){
           
    	this.dispose();
    	form f=new form();
    }
}
 class MainFrame{
	 
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				   main lms = new main();
			         				
			}
		});
    }
           			
}


