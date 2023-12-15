import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener{
	
	JButton exit,rs100,rs500,rs1000,rs2000,rs5000,rs10000;
	String pinnumber;
	
	FastCash(String pinnumber){
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text=new JLabel("SELECT WITHDRAWAL AMOUNT");
		text.setBounds(210,300, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		rs100=new JButton("Rs 100");
		rs100.setBounds(170,415,150,30);
		rs100.addActionListener(this);
		image.add(rs100);
		
		rs500=new JButton("Rs 500");
		rs500.setBounds(350,415,150,30);
		rs500.addActionListener(this);
		image.add(rs500);
		
		rs1000=new JButton("Rs 1000");
		rs1000.setBounds(170,450,150,30);
		rs1000.addActionListener(this);
		image.add(rs1000);
		
		rs2000=new JButton("Rs 2000");
		rs2000.setBounds(350,450,150,30);
		rs2000.addActionListener(this);
		image.add(rs2000);
		
		rs5000=new JButton("Rs 5000");
		rs5000.setBounds(170,485,150,30);
		rs5000.addActionListener(this);
		image.add(rs5000);
		
		rs10000=new JButton("Rs 10000");
		rs10000.setBounds(350,485,150,30);
		rs10000.addActionListener(this);
		image.add(rs10000);
		
		exit=new JButton("Back");
		exit.setBounds(350,520,150,30);
		exit.addActionListener(this);
		image.add(exit);

		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		getContentPane().setBackground(Color.white);
		setVisible(true);
		
	}


	public static void main(String[] args) {
		new FastCash("");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		 try {
	            String amount = ((JButton)ae.getSource()).getText().substring(3);
	            conn c = new conn();
	            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
	            int balance = 0;
	            while (rs.next()) {
	                if (rs.getString("type").equals("Deposit")) {
	                    balance += Integer.parseInt(rs.getString("amount"));
	                } else {
	                    balance -= Integer.parseInt(rs.getString("amount"));
	                }
	            } 
	            if (ae.getSource() != exit && balance < Integer.parseInt(amount)) {
	                JOptionPane.showMessageDialog(null, "Insuffient Balance");
	                return;
	            }

	            if (ae.getSource() == exit) {
	                this.setVisible(false);
	                new Transactions(pinnumber).setVisible(true);
	            }else{
	                Date date = new Date();
	                c.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')");
	                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
	                    
	                setVisible(false);
	                new Transactions(pinnumber).setVisible(true);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	
	}

}
