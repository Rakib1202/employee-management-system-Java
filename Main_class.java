package Employee.Management.System;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {



    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icone/home2.gif"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(img);
        //heading
JLabel heading = new JLabel("Employee Management System");
heading.setBounds(440,25,400,40);
heading.setFont(new Font("Raleway",Font.BOLD,20));
heading.setForeground(Color.cyan);
img.add(heading);

// ADD Button

        JButton add =new JButton("Add Employee");
        add.setBounds(55,155,150,40);
        add.setForeground(Color.black);
        add.setBackground(Color.lightGray);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
new AddEmployee();
setVisible(false);
            }
        });
        img.add(add);

//remove Button

JButton rem =new JButton("Remove Employee ");
rem.setBounds(55,255,155,40);
rem.setForeground(Color.black);
rem.setBackground(Color.lightGray);
rem.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
new RemoveEmployee();

    }
});
img.add(rem);
// View Button

        JButton View =new JButton("View Employee ");
        View.setBounds(55,355,155,40);
        View.setForeground(Color.black);
        View.setBackground(Color.lightGray);
        View.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewEmployee();
                setVisible(false);
            }
        });
        img.add(View);

        setSize(1120,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Main_class();
    }
}