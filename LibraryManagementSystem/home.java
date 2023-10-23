package LibraryManagementSystem;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;

/*import LibraryManagement.BookDetails;
import LibraryManagement.Login_user;
import LibraryManagement.StudentDetails;
import LibraryManagement.aboutUs;
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
class home1 extends JFrame implements ActionListener
{
	
	JButton b1,b2,b3,b4,b5,b6;
	
     JPanel contentPane,panel,panel1;
	public home1()
	 {
		 setVisible(true);
		 setSize(850,750);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("HOME PAGE");
		 setLocationRelativeTo(null);
		 setLayout(null);
		 setBackground(new Color(169, 169, 169));	
		
			
    
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
   	    contentPane.setBackground(new Color(210,180,140));
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED,new Color(128,0,0),new Color(128,0,0)));
        menuBar.setBackground(new Color(128,0,0));
        menuBar.setBounds(0, 10, 1000, 35);
        contentPane.add(menuBar);

        JMenu mnExit = new JMenu("Exit");
        mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mnExit.setForeground(Color.white); 
        
        JMenuItem mntmLogout = new JMenuItem("Logout");
        mntmLogout.setBackground(new Color(211, 211, 211));
        mntmLogout.setForeground(new Color(105, 105, 105));
        mntmLogout.addActionListener(this);
        mnExit.add(mntmLogout);
        
        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.setForeground(new Color(105, 105, 105));
        mntmExit.setBackground(new Color(211, 211, 211));
        mntmExit.addActionListener(this);
        mnExit.add(mntmExit);
            
        

        JMenu mnHelp = new JMenu("Help");
        mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mnHelp.setForeground(Color.white); 

        JMenuItem mntmReadme = new JMenuItem("Read Me");
        mntmReadme.setBackground(new Color(211, 211, 211));
        mntmReadme.setForeground(new Color(105, 105, 105));
        mntmReadme.addActionListener(this);
        mnHelp.add(mntmReadme);
        

        JMenuItem mntmAboutUs = new JMenuItem("About Us");
        mntmAboutUs.setForeground(new Color(105, 105, 105));
        mntmAboutUs.setBackground(new Color(211, 211, 211));
      mntmAboutUs.addActionListener(this);
        mnHelp.add(mntmAboutUs);

        JMenu mnRecord = new JMenu("Record");
        mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mnRecord.setForeground(Color.white); 

        JMenuItem bookdetails = new JMenuItem("Book Details");
        bookdetails.addActionListener(this);
        bookdetails.setBackground(new Color(211, 211, 211));
        bookdetails.setForeground(Color.DARK_GRAY);
        mnRecord.add(bookdetails);

        JMenuItem studentdetails = new JMenuItem("Student Details");
        studentdetails.setBackground(new Color(211, 211, 211));
        studentdetails.setForeground(Color.DARK_GRAY);
        studentdetails.addActionListener(this);
        mnRecord.add(studentdetails);
        
        menuBar.add(mnRecord);
        menuBar.add(mnHelp);
        menuBar.add(mnExit);

        
        JLabel l1 = new JLabel("Library Management System");
        l1.setForeground(new Color(165,42,42));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(200, 30, 701, 100);
        contentPane.add(l1);

        JLabel l2 = new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/addb.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(60, 140, 159, 152);
        contentPane.add(l2);

        JLabel l3 = new JLabel("");
        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/stat.png"));
        Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(300, 160, 134, 128);
        contentPane.add(l3);

        JLabel l4 = new JLabel("");
        ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/adds.png"));
        Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(530, 140, 225, 152);
        contentPane.add(l4);

        b1 = new JButton("Add Books");
        b1.addActionListener(this);
        b1.setBackground(new Color(128,0,0));
        b1.setForeground(Color.white);
        b1.setBounds(60, 320, 159, 44);
        b1.setBorder(new LineBorder(new Color(128,0,0), 2, true));
        contentPane.add(b1);

        b2 = new JButton("Statistics");
          b2.addActionListener(this);
        b2.setBackground(new Color(128,0,0));
        b2.setForeground(Color.white);
        b2.setBounds(313, 320, 139, 44);
        b2.setBorder(new LineBorder(new Color(128,0,0), 2, true));
        contentPane.add(b2);

        b3 = new JButton("Add Student");
        b3.addActionListener(this);
        b3.setBackground(new Color(128,0,0));
        b3.setForeground(Color.white);
        b3.setBounds(562, 320, 167, 44);
        b3.setBorder(new LineBorder(new Color(128,0,0), 2, true));
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0), 2), "Operation", TitledBorder.LEADING,
			TitledBorder.TOP, null,new Color(165,42,42)));
        panel.setBounds(20, 120, 750, 260);
        panel.setBackground(new Color(210,180,140));
        contentPane.add(panel);

        b4 = new JButton("Issue Book");
       b4.addActionListener(this);
       b4.setBackground(new Color(128,0,0));
       b4.setForeground(Color.white);
       b4.setBounds(76, 620, 143, 41);
       b4.setBorder(new LineBorder(new Color(128,0,0), 2, true)); 
       contentPane.add(b4);

        b5 = new JButton("Return Book");
        b5.addActionListener(this);
        b5.setBackground(new Color(128,0,0));
        b5.setForeground(Color.white);
        b5.setBounds(310, 620, 159, 41);
        b5.setBorder(new LineBorder(new Color(128,0,0), 2, true));
        contentPane.add(b5);

        b6 = new JButton("About Us");
       b6.addActionListener(this);
       b6.setBackground(new Color(128,0,0));
       b6.setForeground(Color.white);
       b6.setBounds(562, 620, 159, 41);
       b6.setBorder(new LineBorder(new Color(128,0,0), 2, true)); 
       contentPane.add(b6);

      JLabel l5 = new JLabel("");
        ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/issue.png"));
        Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(60, 440, 159, 163);
        contentPane.add(l5);

        JLabel l6 = new JLabel("");
        ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/return.png"));
        Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(332, 440, 139, 152);
        contentPane.add(l6);

        JLabel l7 = new JLabel("");
        ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/about.png"));
        Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(562, 440, 157, 152);
        contentPane.add(l7);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0), 2), "Action", TitledBorder.LEADING,
			TitledBorder.TOP, null, new Color(165,42,42)));
        panel2.setBounds(20, 420, 750, 270);
        panel2.setBackground(new Color(210,180,140));
        contentPane.add(panel2);
        
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
	
        String msg = e.getActionCommand();
        
        if(msg.equals("Logout"))
        {
            setVisible(false);
	        form f=new form();
        }
        else if(msg.equals("Exit"))
        {
            System.exit(ABORT);
        
        }
        else if(msg.equals("Read Me"))
        {
            Readmee hh=new Readmee();
        	
        }
        else if(msg.equals("About Us"))
        {
        //    setVisible(false);
	        about ab=new about();
        
        }
        else if(msg.equals("Book Details"))
        {
            setVisible(false);
	      detailb db=new detailb();
        }
        else if(msg.equals("Student Details"))
        {
            setVisible(false);
            studentd sd=new studentd();
		
        }
		
		if(e.getSource()==b1)
		{
			
			this.dispose();
            AddBooks1 a1=new AddBooks1();  
        	}
		if(e.getSource()==b2)
		{
			
			this.dispose();

			Stat obj=new Stat();
          
    
		
		}
		if(e.getSource()==b3)
		{
			
			this.dispose();
            AddStudent1 s1=new AddStudent1();
           
		
		}
		if(e.getSource()==b4)
		{
			
			this.dispose();
          Issue i=new Issue();
           		
		}
		if(e.getSource()==b5)
		{
			
			this.dispose();
            Return r=new Return();
           		
		}
		
		if(e.getSource()==b6)
		{
			
            about ab=new about(); 
		}
		
	}
	

}
class home
{
  public static void main(String[] args)

  {
	  
   SwingUtilities.invokeLater(new Runnable() {
	
	@Override
	public void run() {
	
		home1 h1= new home1();	
	}
});
	
	  
	  
  }

}
