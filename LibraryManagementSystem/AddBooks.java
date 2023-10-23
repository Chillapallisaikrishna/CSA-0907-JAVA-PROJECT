package LibraryManagementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import LibraryManagementSystem.home;
import LibraryManagementSystem.conn;

//class AddBooks 
class AddBooks1 extends JFrame implements ActionListener {
	
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JTextField t1,t2,t3,t4,t5,t6,t7;
	JPanel contentPane;
	private JPanel panel;
	private JButton b1,b2;
	JComboBox comboBox;
	
    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(1000 + 1));
    }

    //----------------CONSTRUCTOR-------------------
	AddBooks1(){
		
		setLayout(null);
		
		//Setting the Frame
		 setVisible(true); //making frame visible
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closing the frame properly
		 setSize(570,500);//setting Size: width and height of frame
		 setLocationRelativeTo(null);//Locating frame in the Center
		 
		
		//ADDING A CONTAINER 
				contentPane=new JPanel();
				setContentPane(contentPane);
				contentPane.setLayout(null);
				//contentPane.setBackground(new Color(220,220,220));
                 contentPane.setBackground(new Color(210,180,140));
				//ADDING LABEL:Book_id
		       l1=new JLabel("Book id :");
		       l1.setBounds(68,58,400,30);
		       l1.setFont(new Font("Arial Black",Font.BOLD,12));
	           l1.setForeground(Color.BLACK);
		       contentPane.add(l1);
		
	    //ADDING LABEL:Name
				l2=new JLabel("Name :");
				l2.setBounds(68,97,400,30);
				l2.setFont(new Font("Arial Black",Font.BOLD,12));
                l2.setForeground(Color.BLACK);
				contentPane.add(l2);
				
	   //ADDING LABEL:ISBN
				l3=new JLabel("ISBN :");
				l3.setBounds(68,138,400,30);
				l3.setFont(new Font("Arial Black",Font.BOLD,12));
				l3.setForeground(Color.BLACK);
				contentPane.add(l3);
				
	  //ADDING LABEL:PUBLISHER
				l4=new JLabel("Publisher :");
				l4.setBounds(68,178,400,30);
				l4.setFont(new Font("Arial Black",Font.BOLD,12));
				l4.setForeground(Color.BLACK);
				setForeground(Color.BLACK);
				contentPane.add(l4);
				
				
	 //ADDING LABEL:EDITION
				l5=new JLabel("Edition :");
				l5.setBounds(68,217,400,30);
				l5.setFont(new Font("Arial Black",Font.BOLD,12));
				l5.setForeground(Color.BLACK);
				contentPane.add(l5);
				
    //ADDING LABEL:PRICE
				l6=new JLabel("Price :");
				l6.setBounds(68,258,400,30);
				l6.setFont(new Font("Arial Black",Font.BOLD,12));
				l6.setForeground(Color.BLACK);
				contentPane.add(l6);
				
	 //ADDING LABEL:PAGES
				l7=new JLabel("Pages :");
				l7.setBounds(68,300,400,30);
				l7.setFont(new Font("Arial Black",Font.BOLD,12));
				l7.setForeground(Color.BLACK);
				contentPane.add(l7);
				
	//-------------ADDING TEXT FIELDS AND COMBO BOX------------
				
				//text field 1
				t1=new JTextField();
				t1.setBounds(200,65,220,20);
				t1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
				contentPane.add(t1);
                t1.setEditable(false);
               // t1.setground(Color.black);
				
				//text field 2
				t2=new JTextField();
				t2.setBounds(200,105,220,20);
				t2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
				contentPane.add(t2);
				
				//text field 3
				t3=new JTextField();
				t3.setBounds(200,145,220,20);
				t3.setFont(new Font("Trebuchet MS",Font.BOLD,14));
				contentPane.add(t3);
				
				//text field 4
				t4=new JTextField();
				t4.setBounds(200,185,220,20);
				t4.setFont(new Font("Trebuchet MS",Font.BOLD,14));
				contentPane.add(t4);
				
				//Combo BOX 
				comboBox=new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"1","2","3","4","5","6","7","8","9"}));
				comboBox.setBounds(200,225,220,20);
				contentPane.add(comboBox);
				
				//text field 5
				t5=new JTextField();
				t5.setBounds(200,265,220,22);
				t5.setFont(new Font("Trebuchet MS",Font.BOLD,14));
				contentPane.add(t5);
				
				//text field 6
				t6=new JTextField();
				t6.setBounds(200,305,220,22);
				t6.setFont(new Font("Trebuchet MS",Font.BOLD,14));
				contentPane.add(t6);
				
				//ADDING BUTTON B1 AND B2 
				b1=new JButton("ADD");
				b2=new JButton("BACK");
				b1.setBounds(140,370,100,28);
				b1.addActionListener(this);
				b2.addActionListener(this);
				b2.setBounds(280,370,100,28);
				contentPane.add(b1);
				contentPane.add(b2);
				b1.setBackground(new Color(128,0,0));
				b2.setBackground(new Color(128,0,0));
				b1.setForeground(Color.white);
				b2.setForeground(Color.white);
				b1.setBorder(new LineBorder(new Color(128,0,0), 2, true));
				
				b2.setBorder(new LineBorder(new Color(128,0,0), 2, true));
			
				
				
  //----------------TEXT FIELD COMPLETED----------------------------	
						
	   //ADDING Border to panel container
     	panel=new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0),1),"ADD BOOKS  ",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(165,42,42)));
		panel.setBounds(40,30, 476, 400);
		//panel.setBackground(new Color(220,220,220));
		panel.setBackground(new Color(210,180,140));
		contentPane.add(panel);
        random();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
			 try{
		            conn con = new conn();
		            if(e.getSource() == b1)
		            {
		        String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages) values(?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement st = con.c.prepareStatement(sql);
		                // st.setInt(1, Integer.parseInt(textField.getText()));
				st.setString(1, t1.getText());
				st.setString(2, t2.getText());
				st.setString(3, t3.getText());
				st.setString(4, t4.getText());
				st.setString(5, (String) comboBox.getSelectedItem());
				st.setString(6, t5.getText());
				st.setString(7, t6.getText());

				int rs = st.executeUpdate();
				if (rs > 0)
		                    JOptionPane.showMessageDialog(null, "Successfully Added");
				else
		                    JOptionPane.showMessageDialog(null, "Error");
		               t1.setText("");
		                t2.setText("");
		                t3.setText("");
		                t4.setText("");
		                t5.setText("");
		                t6.setText("");
		                random();
				   //   AddBooks1 b= new AddBooks1();
				st.close();
		            }

		            if(e.getSource() == b2)
		            {
		                this.dispose();
		            	home1 h=new home1();
		            }
		            con.c.close();
		        }
			 catch(Exception ex){
		            
		        }
		    }
		}


			
				
	
//------------Main Class--------------
		class AddBooks{
	   	public static void main(String [] args) {
	   		SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					AddBooks1 object=new AddBooks1(); //creating Object;	
					
				}
			});
	   	    
	   	
	      
		
		 
		
			
		}
	}



