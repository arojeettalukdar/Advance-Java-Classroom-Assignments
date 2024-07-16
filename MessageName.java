import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MessageName implements ActionListener
{
	JTextField Tf1, Tf2;
	JButton b1;
	MessageName()
	{
		JFrame f= new JFrame("First Swing Progam");
		Tf1 = new JTextField();
		JLabel l1 = new JLabel("Name");
		l1.setBounds(20,120,120,20);
		Tf1.setBounds(90,120,150,20);
		Tf2 = new JTextField();
		JLabel l2 = new JLabel("result");
		l2.setBounds(20,170,120,20);
		Tf2.setBounds(90,170,300,20);
		b1=new JButton("Name");
		b1.setBounds(50,280,75,50);
		b1.addActionListener(this);
		f.add(Tf1);f.add(Tf2);
		f.add(l1);
		f.add(l2);f.add(b1);
		f.setSize(300,300);
		f.add(b1);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public void actionPerformed(ActionEvent e) {
		String s1=Tf1.getText();
		String s3="";
		if(e.getSource()==b1){
		s3="Welcome "+s1+ " to Advance Java Lab";
		}
		Tf2.setText(s3);
		}
	public static void main(String[] args) {
		new MessageName();
		}
	}
