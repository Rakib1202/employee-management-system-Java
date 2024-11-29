package Employee.Management.System;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateEmployee extends JFrame implements ActionListener {
    JTextField teducation, tFather_name, taddress,tphone, tNID, temail, tsalary,tdesignation;
    JLabel tEmployee_ID;
    JButton add,back;
    String number;
    UpdateEmployee(String number){

        this.number = number;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icone/Update Employee.gif"));
        Image i2 = i1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,900,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(img);

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("serif", Font.BOLD,25));
        img.add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(name);

        JLabel tname = new JLabel();
        tname.setBounds(200,150,150,30);
        tname.setBackground(new Color(177,252,197));
        img.add(tname);

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(fname);

        tFather_name = new JTextField();
        tFather_name.setBounds(600,150,150,30);
        tFather_name.setBackground(new Color(177,252,197));
        img.add(tFather_name);

        JLabel dob = new JLabel("Date Of Birth");
        dob.setBounds(50,200,150,30);
        dob.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(dob);

        JLabel tdob = new JLabel();
        tdob.setBounds(200,200,150,30);
        tdob.setFont(new Font("Tahoma", Font.BOLD, 20));
        img.add(tdob);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(400,200,150,30);
        salary.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(600,200,150,30);
        tsalary.setBackground(new Color(177,252,197));
        img.add(tsalary);

        JLabel address = new JLabel("Address");
        address.setBounds(50,250,150,30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(address);

        taddress= new JTextField();
        taddress.setBounds(200,250,150,30);
        taddress.setBackground(new Color(177,252,197));
        img.add(taddress);


        JLabel phone = new JLabel("Phone");
        phone.setBounds(400,250,150,30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(phone);

        tphone= new JTextField();
        tphone.setBounds(600,250,150,30);
        tphone.setBackground(new Color(177,252,197));
        img.add(tphone);

        JLabel email = new JLabel("Email");
        email.setBounds(50,300,150,30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(email);

        temail= new JTextField();
        temail.setBounds(200,300,150,30);
        temail.setBackground(new Color(177,252,197));
        img.add(temail);

        JLabel education = new JLabel("Higest Education");
        education.setBounds(400,300,150,30);
        education.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(education);

        teducation= new JTextField();
        teducation.setBounds(600,300,150,30);
        teducation.setBackground(new Color(177,252,197));
        img.add(teducation);

        JLabel NID = new JLabel("NID ");
        NID.setBounds(400,350,150,30);
        NID.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(NID);

        JLabel tNid = new JLabel();
        tNid.setBounds(600,350,150,30);
        tNid.setBackground(new Color(177,252,197));
        img.add(tNid);


        JLabel empid = new JLabel("Employee ID");
        empid.setBounds(50,400,150,30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(empid);

        tEmployee_ID= new JLabel();
        tEmployee_ID.setBounds(200,400,150,30);
        tEmployee_ID.setFont(new Font("SAN_SARIF", Font.BOLD,20));
        tEmployee_ID.setForeground(Color.RED);
        img.add(tEmployee_ID);

        JLabel designation = new JLabel("Designation");
        designation.setBounds(50,350,150,30);
        designation.setFont(new Font("SAN_SERIF", Font.BOLD,20));
        img.add(designation);

        tdesignation= new JTextField();
        tdesignation.setBounds(200,350,150,30);
        tdesignation.setBackground(new Color(177,252,197));
        img.add(tdesignation);

        try {
            conn c = new conn();
            String query = "select * from employee where Employee = '"+number+"'";
            ResultSet resultSet = c.statement.executeQuery(query);
            while (resultSet.next()){
                tEmployee_ID.setText(resultSet.getString("Employee_ID"));
                tname.setText(resultSet.getString("Name"));
                tFather_name.setText(resultSet.getString("Father_name"));
                tdob.setText(resultSet.getString("Date_of_birth"));
                taddress.setText(resultSet.getString("Address"));
                tsalary.setText(resultSet.getString("Salary"));
                tphone.setText(resultSet.getString("Phone"));
                temail.setText(resultSet.getString("Email"));
                teducation.setText(resultSet.getString("Education"));
                tNID.setText(resultSet.getString("NID"));

                tdesignation.setText(resultSet.getString("Designation"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        add = new JButton("UPDATE");
        add.setBounds(450,550,150,40);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        img.add(add);

        back = new JButton("BACK");
        back.setBounds(250,550,150,40);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        img.add(back);


        setSize(900,700);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String Father_name = tFather_name.getText();
            String Salary = tsalary.getText();
            String Address = taddress.getText();
            String Phone = tphone.getText();
            String Email = temail.getText();
            String Education = teducation.getText();
            String Designation = tdesignation.getText();

            try {
                conn  c = new conn();
                String query = "update employee set Father_name = '"+Father_name+"', Salary = '"+Salary+"', Address = '"+Address+"', Phone = '"+Phone+"', Email = '"+Email+"', Education = '"+Education+"', Designation = '"+Designation+"' where Employee = '"+number+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new Main_class();
            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
            new ViewEmployee();
        }
    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}