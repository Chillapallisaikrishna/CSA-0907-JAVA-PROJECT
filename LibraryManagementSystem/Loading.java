package LibraryManagementSystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.event.*;
import java.sql.*;

class Load extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
	int s;
	Thread th;

	
	public void setUploading() {
           setVisible(false);
            th.start();
        //    home1 h =new home1();
            
	}

	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                       setVisible(false);
                       home1 h =new home1();               
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Load() {
                         
            super("Loading");
            setVisible(true);
            setLayout(null);
            th = new Thread((Runnable) this);
            setLocationRelativeTo(null);
           setBounds(200,100, 600,400);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            contentPane.setBackground(Color.LIGHT_GRAY);

            JLabel lbllibraryManagement = new JLabel("Smart Library v5.1");
            lbllibraryManagement.setForeground(new Color(255,20,147));
            lbllibraryManagement.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
            lbllibraryManagement.setBounds(130, 55, 500, 35);
            contentPane.add(lbllibraryManagement);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBounds(130, 135, 300, 25);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
            lblNewLabel_2.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
            lblNewLabel_2.setForeground(new Color(75,0,130));
            lblNewLabel_2.setBounds(220, 200, 150, 20);
            contentPane.add(lblNewLabel_2);

            
            JPanel panel = new JPanel();
            panel.setBackground(Color.LIGHT_GRAY);
            panel.setBorder(new TitledBorder(new LineBorder(new Color(138,60,226),2),"",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(0,0,226)));
    	    panel.setBounds(40,20,500,320);
    	    panel.setForeground(new Color(255,20,147));

            contentPane.add(panel);
            
            
         
            setUploading();
          

	}
} 

class Loading{
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		   public void run() {
               Load l=new Load();	 //creating Object;	
			
		}
	});
}
}
	    
