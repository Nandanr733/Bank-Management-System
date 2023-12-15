import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupTwo extends JFrame implements ActionListener {
	
	long appno;
	JTextField panTextField,aadharTextField;
	JButton next;
	JRadioButton sencitizenY,sencitizenN,ExistingY,ExistingN;
	JComboBox religion,cat,inco,eduCombo,occupation;
	String formno;
	
	public SignupTwo(String formno) {
			
		this.formno=formno;
			setLayout(null);
			setTitle("New Account Application Form -PAGE 2");

			
			JLabel additionalDetails=new JLabel("Page 2: Additional Details " );
			additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
			additionalDetails.setBounds(290,80,400,30);
			add(additionalDetails);
			
			
			
			
			JLabel rel=new JLabel("Religion:" );
			rel.setFont(new Font("Raleway",Font.BOLD,20));
			rel.setBounds(100,140,100,30);
			add(rel);
			
			String valReligion[]= {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
			religion=new JComboBox(valReligion);
			//religion.setFont(new Font("Raleway",Font.BOLD,20));
			religion.setBackground(Color.white);
			religion.setBounds(300, 140, 400, 30);
			add(religion);
			
			
			
			JLabel category=new JLabel("Category:" );
			category.setFont(new Font("Raleway",Font.BOLD,20));
			category.setBounds(100,190,200,30);
			add(category);
			
			String valCategory[]= {"OBC","General","SC","ST","Other"};
			cat=new JComboBox(valCategory);
			//cat.setFont(new Font("Raleway",Font.BOLD,20));
			cat.setBackground(Color.white);
			cat.setBounds(300, 190, 400, 30);
			add(cat);
			
			
			
			
			JLabel income=new JLabel("income:" );
			income.setFont(new Font("Raleway",Font.BOLD,20));
			income.setBounds(100,240,200,30);
			add(income);
			
			String incomeCategory[]= {"NULL","<1,50,000","<2,50,500","<5,00,000","upto 10,00,000"};
			inco=new JComboBox(incomeCategory);
			//inco.setFont(new Font("Raleway",Font.BOLD,20));
			inco.setBackground(Color.white);
			inco.setBounds(300, 240, 400, 30);
			add(inco);
			
			
			
			
			JLabel education=new JLabel("Educational" );
			//education.setFont(new Font("Raleway",Font.BOLD,20));
			education.setBounds(100,290,200,30);
			add(education);

			
			JLabel qualification=new JLabel("Qualification:" );
			qualification.setFont(new Font("Raleway",Font.BOLD,20));
			qualification.setBounds(100,315,200,30);
			add(qualification);
			
			String eduCategory[]= {"Non-Graduation","Graduate","Post Graduate","Other"};
			eduCombo=new JComboBox(eduCategory);
			//eduCombo.setFont(new Font("Raleway",Font.BOLD,20));
			eduCombo.setBackground(Color.white);
			eduCombo.setBounds(300, 315, 400, 30);
			add(eduCombo);
			
			

			
			JLabel occupational=new JLabel("Occupational :" );
			occupational.setFont(new Font("Raleway",Font.BOLD,20));
			occupational.setBounds(100,390,200,30);
			add(occupational);
			
			String occupationalvalues[]= {"Salaried","Self-employed","Busoness","Student","Others"};
			occupation=new JComboBox(occupationalvalues);
			occupation.setBackground(Color.white);
			occupation.setBounds(300, 390, 400, 30);
			add(occupation);
			
			
			
			
			JLabel pan=new JLabel("Pan No. :" );
			pan.setFont(new Font("Raleway",Font.BOLD,20));
			pan.setBounds(100,440,200,30);
			add(pan);
			
			panTextField=new JTextField();
			panTextField.setFont(new Font("Raleway",Font.BOLD,20));
			panTextField.setBounds(300, 440, 400, 30);
			add(panTextField);
			
			
			
			
			JLabel aadhar=new JLabel("Aadhar No. :" );
			aadhar.setFont(new Font("Raleway",Font.BOLD,20));
			aadhar.setBounds(100,490,200,30);
			add(aadhar);
			
			aadharTextField=new JTextField();
			aadharTextField.setFont(new Font("Raleway",Font.BOLD,20));
			aadharTextField.setBounds(300, 490, 400, 30);
			add(aadharTextField);
			
			
			
			
			JLabel senior=new JLabel("Senior Citizen:" );
			senior.setFont(new Font("Raleway",Font.BOLD,20));
			senior.setBounds(100,540,200,30);
			add(senior);
			
			sencitizenY=new JRadioButton("Yes");
			sencitizenY.setBounds(300, 540, 100, 30);
			sencitizenY.setBackground(Color.white);
			add(sencitizenY);
				
			sencitizenN=new JRadioButton("No");
			sencitizenN.setBounds(450, 540, 100, 30);
			sencitizenN.setBackground(Color.white);
			add(sencitizenN);
				
				
			ButtonGroup sen=new ButtonGroup();
			sen.add(sencitizenY);
			sen.add(sencitizenN);
				
			
			
			
			JLabel existing=new JLabel("Existing Account:" );
			existing.setFont(new Font("Raleway",Font.BOLD,20));
			existing.setBounds(100,590,200,30);
			add(existing);
			
			ExistingY=new JRadioButton("Yes");
			ExistingY.setBounds(300, 590, 100, 30);
			ExistingY.setBackground(Color.white);
			add(ExistingY);
				
			ExistingN=new JRadioButton("No");
			ExistingN.setBounds(450, 590, 100, 30);
			ExistingN.setBackground(Color.white);
			add(ExistingN);
				
				
			ButtonGroup exis=new ButtonGroup();
			exis.add(ExistingY);
			exis.add(ExistingN);
				
			
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
		new SignupTwo("");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String sreligion=(String) religion.getSelectedItem();
		String category=(String) cat.getSelectedItem();
		String income=(String) inco.getSelectedItem();
		String education=(String) eduCombo.getSelectedItem();
		String occup=(String) occupation.getSelectedItem();
		String pan=panTextField.getText();
		String adhar=aadharTextField.getText();
		String seniorCitizen=null;
		if(sencitizenY.isSelected()) {
			seniorCitizen="Yes";
		}else if(sencitizenY.isSelected()){
			seniorCitizen="No";
		}
		
		String existing=null;
		if(ExistingY.isSelected()) {
			existing="Yes";
		}else if(ExistingN.isSelected()) {
			existing="No";
		}
		

		try {
			conn c=new conn();
			String query="insert into signupTwo values('"+formno+"','"+sreligion+"','"+category+"','"+income+"','"+education+"','"+occup+"','"+pan+"','"+adhar+"','"+seniorCitizen+"','"+existing+"')";
			c.s.executeUpdate(query);
			
			setVisible(false);
			new SignupThree(formno).setVisible(true);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
