package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;
    Login()
    {
        l1 = new JLabel("Username");
        l1.setBounds(175,50,100,30);
        add(l1);
        l2 = new JLabel("Password");
        l2.setBounds(175,100,100,30);
        add(l2);
        t1 = new JTextField();
        t1.setBounds(245,53,200,30);
        add(t1);
        t2 = new JPasswordField();
        t2.setBounds(245,103,200,30);
        add(t2);
        b1 = new JButton("Login");
        b1.setBounds(210,160,100,30);
        b1.addActionListener(this);
        add(b1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3  = new JLabel(i3);
        l3.setBounds(-50,-40,300,300);
        add(l3);
        b2 = new JButton("Cancle");
        b2.setBounds(330,160,100,30);
        b2.addActionListener(this);
        add(b2);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(500,300,500,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
           String  username= t1.getText();
           String password = t2.getText();
           conn c =  new conn();
           String str = "select * from login where username = '"+username+"' and password = '"+password+"'";
           try {
              ResultSet rs= c.s.executeQuery(str);
              if(rs.next()){
                   new Dashboard().setVisible(true);
                  this.setVisible(false);
              }
              else
              {
                  JOptionPane.showMessageDialog(null,"Invalid username and password");
                  this.setVisible(false);
              }
           }catch (Exception e)
           {

           }
        }
        else if(ae.getSource()==b2)
        {
            System.exit(0);
        }
    }
    public static void main (String[]args)
    {
        new Login();
    }
}
