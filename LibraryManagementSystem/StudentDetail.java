package LibraryManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import LibraryManagementSystem.home;
import LibraryManagementSystem.StudentDetail;
import LibraryManagementSystem.conn;
import net.proteanit.sql.DbUtils;

class studentd extends JFrame implements ActionListener{

	JLabel l;
	JButton search, del, back;
	JPanel contentPane;
	Font f;
	JTextField jf1;
    JTable table;
    public void student() {
        try {
            conn con = new conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {

        }
    }

	public studentd() {
		setVisible(true);
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("BOOK DETAILS");
		setLocationRelativeTo(null);
		setLayout(null);
		f = new Font("Segoe UI Semilight", Font.BOLD, 30);

		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setBackground(new Color(210,180,140));
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 133,730,400);
		//scrollPane.setForeground(Color.LIGHT_GRAY);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent arg0) {
	                int row = table.getSelectedRow();
		        	jf1.setText(table.getModel().getValueAt(row, 1).toString());
	            }
		});
		table.setBackground(new Color(210,180,140));
		table.setForeground(Color.DARK_GRAY);
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		scrollPane.setViewportView(table);




		l = new JLabel("Student Details");
		l.setFont(f);
		//l.setForeground(new Color(199, 21, 133));
		l.setBounds(200, 24, 800, 30);
		l.setForeground(new Color(128,0,0));
	    l.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 30));
	     
		contentPane.add(l);

		jf1 = new JTextField(15);
		jf1.setBackground(new Color(255, 240, 245));
		jf1.setBorder(new LineBorder(new Color(128,0,0), 2, true));
		jf1.setForeground(new Color(47, 79, 79));
		jf1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
		
		jf1.setBounds(140, 90, 350, 30);
		contentPane.add(jf1);

		search = new JButton("Search");
		contentPane.add(search);
		search.setBounds(500, 90, 120, 30);
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/search.png"));
        Image i5 = i4.getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        search.setIcon(i6);
		search.setBorder(new LineBorder(new Color(128,0,0), 2, true));
		search.addActionListener(this);
		search.setBackground(new Color(128,0,0));
		search.setForeground(Color.white);

		back = new JButton("Back");
		contentPane.add(back);
		back.setBounds(50, 90,80, 30);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/back.png"));
        Image i2 = i1.getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        back.setIcon(i3);
		back.addActionListener(this);
		back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               setVisible(false);
               home1 h = new home1();
		      
               //setVisible(true);
            }
	});
	
		back.setBorder(new LineBorder(new Color(128,0,0), 2, true));
		back.setBackground(new Color(128,0,0) );
		back.setForeground(Color.white);

		del = new JButton("Delete");
		contentPane.add(del);
		del.setBounds(640, 90, 120, 30);
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/pictures/close.png"));
        Image i8 = i7.getImage().getScaledInstance(24, 24, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        del.setIcon(i9);
		del.setBorder(new LineBorder(new Color(120,0,0), 2, true));
		del.addActionListener(this);
		del.setBackground(new Color(128,0,0));
		del.setForeground(Color.white);

		 JPanel panel = new JPanel();
	     panel.setBorder(new TitledBorder(new LineBorder(new Color(128,0,0), 2), "Book_Details", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(165,42,42)));
	     panel.setBounds(20,60, 750, 480);
         panel.setBackground(new Color(210,180,140));
         contentPane.add(panel);
         student();
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

        try{
            
            conn con = new conn();
            if( ae.getSource() == search){
                String sql = "select * from student where concat(name, student_id) like ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, "%" + jf1.getText() + "%");
		ResultSet rs = st.executeQuery();

		table.setModel(DbUtils.resultSetToTableModel(rs));
		rs.close();
		st.close();
            }
    
            if(ae.getSource() == del){
                String sql = "delete from student where name = '" + jf1.getText() + "'";
		PreparedStatement st = con.c.prepareStatement(sql);

		JDialog.setDefaultLookAndFeelDecorated(true);
		int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
		JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.NO_OPTION) {

		} else if (response == JOptionPane.YES_OPTION) {
                    int rs = st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Deleted !!");
                    studentd s= new  studentd();
		} else if (response == JOptionPane.CLOSED_OPTION) {
                
                }
		st.close();
		
            }
            con.c.close();
        }catch(Exception e){
            
        }
    }

	}



class StudentDetail {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				studentd sd = new studentd();
			}
		});

	}

}



