package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class RemoveEmployee extends JFrame implements ActionListener {
    private Choice choiceEMPID;

    private JLabel textName, textPhone, textEmail;
    JButton Delete, Back;

    public RemoveEmployee() {
        // Create UI components
        JLabel label = new JLabel("Employee ID");
        label.setBounds(50, 50, 100, 50);
        label.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label);

        choiceEMPID = new Choice();
        choiceEMPID.setBounds(200, 50, 150, 30);
        add(choiceEMPID);

        // Populate employee IDs
        try {
            conn d1 = new conn();
            ResultSet resultSet = d1.statement.executeQuery("select * from Employee");
            while (resultSet.next()) {
                choiceEMPID.add(resultSet.getString("Employee_ID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create labels and text fields
        JLabel labelname = new JLabel("Name ");
        labelname.setBounds(50, 100, 100, 50);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelname);

        textName = new JLabel();
        textName.setBounds(200, 100, 100, 30);
        add(textName);

        JLabel labelphone = new JLabel("Phone ");
        labelphone.setBounds(50, 150, 100, 50);
        labelphone.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelphone);

        textPhone = new JLabel();
        textPhone.setBounds(200, 150, 100, 30);
        add(textPhone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 200, 100, 30);
        labelemail.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelemail);

        textEmail = new JLabel();
        textEmail.setBounds(200, 200, 100, 30);
        add(textEmail);

        // Set up item listener for choiceEMPID
        choiceEMPID.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    conn c = new conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from Employee where Employee_ID = '" + choiceEMPID.getSelectedItem() + "'");
                    while (resultSet.next()) {
                        textName.setText(resultSet.getString("Name"));
                        textPhone.setText(resultSet.getString("Phone"));
                        textEmail.setText(resultSet.getString("Email"));
                    }
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        //button
        Delete = new JButton("Delete");
        Delete.setBounds(80,300,100,30);
        Delete.setBackground(Color.black);
        Delete.setForeground(Color.WHITE);
        Delete.addActionListener(this);
        add(Delete);

        Back = new JButton("Back");
        Back.setBounds(220,300,100,30);
        Back.setBackground(Color.black);
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);
        // Image in Background and icone setup
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icone/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(700,80,200,200);
        add(img);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icone/delete1.gif"));
        Image i22 = i11.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0,0,1120,630);
        add(image);
        // Set up frame
        setSize(1000, 400);
        setLocation(300, 150);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Delete){
            try{
conn c =new conn();
String query = "delete from employee where Employee_ID = '"+choiceEMPID.getSelectedItem()+"'";
c.statement.executeUpdate(query);
JOptionPane.showMessageDialog(null,"employees data delete successfully");
setVisible(false);
new  Main_class();
            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);

        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}