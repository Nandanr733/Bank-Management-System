import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	String formno;
	SignupThree(String formno){
		this.formno=formno;
		setLayout(null);
		
		JLabel l1=new JLabel("Page 3:Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(280,40,400,40);
		add(l1);
		
		JLabel type=new JLabel("Account Type");
		type.setFont(new Font("Raleway",Font.BOLD,22));
		type.setBounds(100,140,200,30);
		add(type);
		
		r1=new JRadioButton("Savings Account");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100,180,160,20);
		add(r1);
		
		r2=new JRadioButton("Current Account");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBackground(Color.WHITE);
		r2.setBounds(100,220,160,20);
		add(r2);
		
		r3=new JRadioButton("RD Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setBackground(Color.WHITE);
		r3.setBounds(350,220,130,20);
		add(r3);
		
		r4=new JRadioButton("Fixed Deposit Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350,180,210,20);
		add(r4);
		
		ButtonGroup acc=new ButtonGroup();
		acc.add(r1);
		acc.add(r2);
		acc.add(r3);
		acc.add(r4);
		
		
		JLabel card=new JLabel("Card Number");
		card.setFont(new Font("Raleway",Font.BOLD,22));
		card.setBounds(100,300,200,30);
		add(card);
		
		JLabel number=new JLabel("XXXX-XXXX-XXXX-4106");
		number.setFont(new Font("Raleway",Font.BOLD,22));
		number.setBounds(330,300,300,30);
		add(number);
		
		JLabel carddetail=new JLabel("Your 16 digit card Number ");
		carddetail.setFont(new Font("Raleway",Font.BOLD,12));
		carddetail.setBounds(100,330,300,20);
		add(carddetail);
		
		
		
		JLabel pin=new JLabel("PIN: ");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
		pin.setBounds(100,370,200,30);
		add(pin);
		
		JLabel pinnumber=new JLabel("XXXX");
		pinnumber.setFont(new Font("Raleway",Font.BOLD,22));
		pinnumber.setBounds(330,370,300,30);
		add(pinnumber);
		
		JLabel pindetail=new JLabel("Your 4 digit Password ");
		pindetail.setFont(new Font("Raleway",Font.BOLD,12));
		pindetail.setBounds(100,400,300,20);
		add(pindetail);
		
		JLabel services=new JLabel("Services Required :");
		services.setFont(new Font("Raleway",Font.BOLD,22));
		services.setBounds(100,450,220,30);
		add(services);
		
		c1=new JCheckBox("ATM CARD");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(100,500,220,30);
		add(c1);
		
		c2=new JCheckBox("Internet Banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(350,500,230,30);
		add(c2);
		
		c3=new JCheckBox("Mobile Banking");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100,550,230,30);
		add(c3);
		
		c4=new JCheckBox("Email & SMS Alerts");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(350,550,230,30);
		add(c4);
		
		c5=new JCheckBox("Cheque Book");
		c5.setBackground(Color.white);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(100,600,230,30);
		add(c5);
		
		c6=new JCheckBox("E-Ststement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(350,600,220,30);
		add(c6);
		
		c7=new JCheckBox("I hereby declare that above entered details are correct to the best of my knowledge");
		c7.setBackground(Color.white);
		c7.setFont(new Font("Raleway",Font.BOLD,16));
		c7.setBounds(100,680,700,30);
		add(c7);
		
		submit=new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.white);
		submit.setFont(new Font("Raleway",Font.BOLD,14));
		submit.setBounds(100,720,100,30);
		submit.addActionListener(this);
		add(submit);
		
		cancel=new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.white);
		cancel.setFont(new Font("Raleway",Font.BOLD,14));
		cancel.setBounds(650,720,100,30);
		cancel.addActionListener(this);
		add(cancel);
		
		
		setSize(850,820);
		getContentPane().setBackground(Color.WHITE);
		setLocation(350,0);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SignupThree("");

	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==submit) {
			String accountType=null;
			if(r1.isSelected()) {
				accountType="Savings Account";
			}
			else if(r2.isSelected()) {
				accountType="Current Account";
			}
			else if(r3.isSelected()) {
				accountType="RD Account";
			}
			else if(r4.isSelected()) {
				accountType="Fixed Deposit Account";
			}
			
			Random random=new Random();
			String cardnumber=" " +Math.abs((random.nextLong()%90000000L+5040936000000000L));
			
			String pinnumber=""+Math.abs((random.nextLong()%9000L+1000L)); 
			
			String facility="";
			if(c1.isSelected()) {
				facility=facility+"ATM CARD";
			}
			else if(c2.isSelected()) {
				facility=facility+"Internet Banking";
			}
			else if(c3.isSelected()) {
				facility=facility+" Mobile Banking";
			}
			else if(c4.isSelected()) {
				facility=facility+"Email and SMS alerts" ;
			}
			else if(c5.isSelected()) {
				facility=facility+"Cheque Book";
			}
			else if(c6.isSelected()) {
				facility=facility+"E-statement";
			}
			
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Select the Account type");
				}else {
				conn c=new conn();
				String query1="insert into signupThree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
				String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
				c.s.executeUpdate(query1);
				c.s.executeUpdate(query2);
				JOptionPane.showMessageDialog(null, "Card number :"+cardnumber+"\n pin number:"+pinnumber);
				
				setVisible(false);
				new Deposit(pinnumber).setVisible(true);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(ae.getSource()==cancel){
			setVisible(false);
			new Login().setVisible(true);
		}
		
	}

}
