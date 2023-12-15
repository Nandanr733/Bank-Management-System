import java.awt.Color;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupOne extends JFrame implements  ActionListener{
	
	long appno;
	JTextField nameTextField,fnameTextField,emailTextField,addTextField,stateTextField,pinTextField,cityTextField;
	JButton next;
	JDateChooser dateChooser;
	JRadioButton male,female,other,married,unmarried;
	
	SignupOne(){
	
		
		
		setLayout(null);
		
		Random ran=new Random();
		appno=Math.abs(ran.nextLong()%9000L+1000L);
		
		
		JLabel formno=new JLabel("APPLICATION FROM NO. " + appno );
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		JLabel PersonalDetails=new JLabel("Page 1: Personal Details " );
		PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		PersonalDetails.setBounds(290,80,400,30);
		add(PersonalDetails);
		
		
		
		
		JLabel name=new JLabel("Name:" );
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		add(name);
		
		nameTextField=new JTextField();
		nameTextField.setFont(new Font("Raleway",Font.BOLD,20));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);
		
		
		
		JLabel fname=new JLabel("Father's Name:" );
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
		fnameTextField=new JTextField();
		fnameTextField.setFont(new Font("Raleway",Font.BOLD,20));
		fnameTextField.setBounds(300, 190, 400, 30);
		add(fnameTextField);
		
		
		
		
		JLabel dob=new JLabel("Date of Birth:" );
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		dateChooser=new JDateChooser() ;
		dateChooser.setBounds(300, 240, 200, 30);
		add(dateChooser);
		
		
		
		
		JLabel gender=new JLabel("Gender:" );
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		male=new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.white);
		add(male);
		
		
		female=new JRadioButton("Female");
		female.setBounds(450, 290, 80, 30);
		female.setBackground(Color.white);
		add(female);
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		
		
		JLabel emai=new JLabel("Email Address:" );
		emai.setFont(new Font("Raleway",Font.BOLD,20));
		emai.setBounds(100,340,200,30);
		add(emai);
		
		emailTextField=new JTextField();
		emailTextField.setFont(new Font("Raleway",Font.BOLD,20));
		emailTextField.setBounds(300, 340, 400, 30);
		add(emailTextField);
		
		
		
		
		JLabel mrital=new JLabel("Marital Status:" );
		mrital.setFont(new Font("Raleway",Font.BOLD,20));
		mrital.setBounds(100,390,200,30);
		add(mrital);
		
		 married=new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried=new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 100, 30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		other=new JRadioButton("Other");
		other.setBounds(600, 390, 100, 30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup marr=new ButtonGroup();
		marr.add(married);
		marr.add(unmarried);
		marr.add(other);
		
		
		
		
		JLabel address=new JLabel("Address:" );
		address.setFont(new Font("Raleway",Font.BOLD,20));
		address.setBounds(100,440,200,30);
		add(address);
		
		addTextField=new JTextField();
		addTextField.setFont(new Font("Raleway",Font.BOLD,20));
		addTextField.setBounds(300, 440, 400, 30);
		add(addTextField);
		
		
		
		
		JLabel city=new JLabel("City:" );
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
		cityTextField=new JTextField();
		cityTextField.setFont(new Font("Raleway",Font.BOLD,20));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);
		
		
		
		
		JLabel state=new JLabel("State:" );
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		stateTextField=new JTextField();
		stateTextField.setFont(new Font("Raleway",Font.BOLD,20));
		stateTextField.setBounds(300, 540, 400, 30);
		add(stateTextField);
		
		
		
		JLabel pincode=new JLabel("Pincode:" );
		pincode.setFont(new Font("Raleway",Font.BOLD,20));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
		pinTextField=new JTextField();
		pinTextField.setFont(new Font("Raleway",Font.BOLD,20));
		pinTextField.setBounds(300, 590, 400, 30);
		add(pinTextField);
		
		next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new SignupOne();
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		String formno=""+appno;
		String name=nameTextField.getText();
		String fname=fnameTextField.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(male.isSelected()) {
			gender="Male";
		}else if(female.isSelected()){
			gender="Female";
		}
		
		String email=emailTextField.getText();
		String marital=null;
		if(married.isSelected()) {
			marital="Married";
		}else if(unmarried.isSelected()) {
			marital="Unmarried";
		}else if(other.isSelected()) {
			marital="Other";
		}
		
		String address=addTextField.getText();
		String city=cityTextField.getText();
		String state=stateTextField.getText();
		String pin=pinTextField.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}else {
				conn c=new conn();
				String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
