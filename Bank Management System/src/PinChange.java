import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;


public class PinChange extends JFrame implements ActionListener{
	
	JPasswordField pintextField,repintextField;
	JButton change,cancel;
	 String pinnumber;
	
	PinChange(String pinnumber){
		pinnumber=this.pinnumber;
		setLayout(null);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text=new JLabel("CHANGE YOUR PIN");
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Raleway",Font.BOLD,16));
		text.setBounds(250,280,500,35);
		image.add(text);
		
		JLabel pintext=new JLabel("New PIN");
		pintext.setForeground(Color.WHITE);
		pintext.setFont(new Font("Raleway",Font.BOLD,16));
		pintext.setBounds(165,320,180,25);
		image.add(pintext);
		
		pintextField=new JPasswordField();
		pintextField.setFont(new Font("Raleway",Font.BOLD,25));
		pintextField.setBounds(330,320,180,25);
		image.add(pintextField);
		
		
		
		JLabel repintext=new JLabel("Re-Enter New PIN");
		repintext.setForeground(Color.WHITE);
		repintext.setFont(new Font("Raleway",Font.BOLD,16));
		repintext.setBounds(165,360,180,25);
		image.add(repintext);
		
		repintextField=new JPasswordField();
		repintextField.setFont(new Font("Raleway",Font.BOLD,25));
		repintextField.setBounds(330,360,180,25);
		image.add(repintextField);
		
		change=new JButton("CHANGE");
		change.setBounds(355,485,150,30);
		change.addActionListener(this);
		image.add(change);
		
		cancel=new JButton("BACK");
		cancel.setBounds(355,520,150,30);
		cancel.addActionListener(this);
		image.add(cancel);
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new PinChange("").setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		try{        
			String npin=pintextField.getText();
			String rpin=repintextField.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            
            if(ae.getSource()==change){
                if (pintextField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (repintextField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                conn c1 = new conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
                String q3 = "update signupThree set pin_number = '"+rpin+"' where pin_number = '"+pinnumber+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            
            }else if(ae.getSource()==cancel){
                new Transactions(pinnumber).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


