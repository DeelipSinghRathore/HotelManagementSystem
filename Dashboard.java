package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4;
    Dashboard(){
         mb = new JMenuBar();
         add(mb);
         m1 = new JMenu("HOTEL MANAGEMENT");
         m1.setForeground(Color.RED);
         mb.add(m1);
         m2 = new JMenu("ADMIN");
         m2.setForeground(Color.RED);
         mb.add(m2);
         i1 = new JMenuItem("RECEPTION");
         i1.setForeground(Color.GREEN);
         i1.addActionListener(this);
         m1.add(i1);
         i2 = new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
         i2.setForeground(Color.green);
         m2.add(i2);
         i3 = new JMenuItem("ADD ROOMS");
        i3.addActionListener(this);
         i3.setForeground(Color.GREEN);
         m2.add(i3);
         i4 = new JMenuItem("ADD DRIVER");
        i4.addActionListener(this);
         i4.setForeground(Color.GREEN);
         m2.add(i4);
         mb.setBounds(0,0,1950,30);
         ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("Hotel/Management/System/icons/third.jpg"));
         Image img2 = img1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
         ImageIcon img3 = new ImageIcon(img2);
         JLabel l1 = new JLabel(img3);
         l1.setBounds(-200,0,1950,1000);
         add(l1);
         JLabel l2 = new JLabel("THE TAJ GROUP WELCOMES YOU");
         l2.setBounds(520,100,1000,100);
         l2.setForeground(Color.white);
         l2.setFont(new Font("Tahoma",Font.PLAIN,60));
         l1.add(l2);
         setLayout(null);
         setBounds(0,0,1530,800);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("RECEPTION"))
        {
             new Reception().setVisible(true);
        }
        else if(ae.getActionCommand().equals("ADD EMPLOYEE"))
        {
            new AddEmployee().setVisible(true);
        }
        else if(ae.getActionCommand().equals("ADD ROOMS"))
        {
            new AddRooms().setVisible(true);
        }
        else if(ae.getActionCommand().equals("ADD DRIVER")){
            new AddDriver().setVisible(true);
        }
    }
    public static void main(String[]args)
    {
       new Dashboard().setVisible(true);
    }
}
