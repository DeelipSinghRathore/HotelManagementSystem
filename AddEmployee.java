package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField t1,t2 ,t3,t4,t5,t6,t7,t8;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1,b2;
    AddEmployee() {
        JLabel name = new JLabel("NAME");
        name.setFont(new Font("Tahoma",Font.PLAIN,17));
        name.setBounds(60, 60, 120, 30);
        add(name);
        t1 = new JTextField();
        t1.setBounds(200,60,220,30);
        add(t1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/employee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3  = new JLabel(i3);
        l3.setBounds(500,60,300,300);
        add(l3);

        JLabel age = new JLabel("AGE");
        age.setFont(new Font("Tahoma",Font.PLAIN,17));
        age.setBounds(60, 100, 120, 30);
        add(age);
        t2 = new JTextField();
        t2.setBounds(200,100,220,30);
        add(t2);

        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("Tahoma",Font.PLAIN,17));
        gender.setBounds(60, 140, 120, 30);
        add(gender);
         r1 = new JRadioButton("Male");
         r1.setBounds(200,140,70,30);
        r1.setFont(new Font("Tahoma",Font.PLAIN,17));
        r1.setBackground(Color.WHITE);
         add(r1);
         r2 = new JRadioButton("Female");
         r2.setBounds(280,140,100,30);
        r2.setFont(new Font("Tahoma",Font.PLAIN,17));
        r2.setBackground(Color.WHITE);
        add(r2);

        JLabel job = new JLabel("JOB");
        job.setFont(new Font("Tahoma",Font.PLAIN,17));
        job.setBounds(60, 180, 120, 30);
        add(job);
        String[] str = {"Front Desk Clerks","Porters","HouseKeeping","Kitchen staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
        c1 = new JComboBox(str);
        c1.setBounds(200,180,220,30);
        c1.setBackground(Color.WHITE);
        add(c1);


        JLabel salary = new JLabel("SALARY");
        salary.setFont(new Font("Tahoma",Font.PLAIN,17));
        salary.setBounds(60, 220, 120, 30);
        add(salary);
        t5 = new JTextField();
        t5.setBounds(200,220,220,30);
        add(t5);

        JLabel phone = new JLabel("PHONE");
        phone.setFont(new Font("Tahoma",Font.PLAIN,17));
        phone.setBounds(60, 260, 120, 30);
        add(phone);
        t6 = new JTextField();
        t6.setBounds(200,260,220,30);
        add(t6);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setFont(new Font("Tahoma",Font.PLAIN,17));
        aadhar.setBounds(60, 300, 120, 30);
        add(aadhar);
        t7 = new JTextField();
        t7.setBounds(200,300,220,30);
        add(t7);

        JLabel email= new JLabel("EMAIL");
        email.setFont(new Font("Tahoma",Font.PLAIN,17));
        email.setBounds(60, 340, 120, 30);
        add(email);
        t8 = new JTextField();
        t8.setBounds(200,340,220,30);
        add(t8);
        JLabel l2 = new JLabel("ADD EMPLOYEE DETAILS");
        l2.setForeground(Color.BLUE);
        l2.setBounds(220,15,400,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,30));
        add(l2);
        getContentPane().setBackground(Color.WHITE);
        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(180,390,100,30);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(310,390,100,30);
        b2.addActionListener(this);
        add(b2);
        setLayout(null);
        setBounds(380, 250, 900, 500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2)
        {
            this.setVisible(false);
        }else {
            String name = t1.getText();
            String age = t2.getText();
            String salary = t5.getText();
            String phone = t6.getText();
            String aadhar = t7.getText();
            String email = t8.getText();
            String gender = null;
            if (r1.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            String job = (String) c1.getSelectedItem();
            conn c = new conn();
            String str = "insert into employee values('" + name + "','" + age + "','" + gender + "','" + job + "','" + salary + "','" + phone + "','" + aadhar + "','" + email + "')";
            try {
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "New Employee Added");
                this.setVisible(false);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args)
    {
        new AddEmployee().setVisible(true);
    }
}
