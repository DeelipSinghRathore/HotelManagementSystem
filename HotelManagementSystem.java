package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {
    HotelManagementSystem()
    {
        setBounds(200,200,1366,565);
//        setSize(400,400);
        setLocation(100,200);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1366,565);
        add(l1);
        JLabel l2 = new JLabel("Hotel Management System");
        l2.setBounds(80,410,1500,118);
        l2.setForeground(Color.YELLOW);
        l2.setFont(new Font("serif",Font.PLAIN,100));
        l1.add(l2);
        JButton b1 = new JButton("Next");
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.setBackground(Color.green);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1180,470,150,50);
        b1.addActionListener(this);
        l1.add(b1);
        setLayout(null);
        setVisible(true);
//        while(true)
//        {
//            l2.setVisible(false);
//            try{
//                Thread.sleep(500);
//            }
//            catch (Exception e)
//            {
//
//            }
//            l2.setVisible(true);
//            try{
//                Thread.sleep(500);
//            }
//            catch(Exception e){
//
//            }
//        }

    }
    public void actionPerformed(ActionEvent ae)
    {
        new Login().setVisible(true);
        this.setVisible(false);
    }
    public static void main(String[] args)
    {
       new HotelManagementSystem();
    }
}
