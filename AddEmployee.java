package Employee.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddEmployee extends JFrame implements ActionListener {
    Random ran =new Random();
    int number =ran.nextInt(999999);
    //textile globally declared
    JTextField tname,tfather_name,tmother_name,tAddress,tEmail,tNID,tPhone,tSalary,tDesignstion;
         JLabel   tempid;
 JDateChooser tdate_of_birth;
 JComboBox educationBox;
 JButton  Submit,Back;
    AddEmployee() {
         //img
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icone/add2.gif"));
         Image i2 = i1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel img = new JLabel(i3);
         img.setBounds(0,0,900,700);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         add(img);
         //Background colour
         //getContentPane().setBackground(new Color(163,255,188));

         JLabel heading = new JLabel("ADD Employee Detail");
         heading.setBounds(280,20,500,50);
         heading.setFont(new Font("serif",Font.ITALIC,25));
         heading.setForeground(new Color(255, 160, 122));
         img.add(heading);
        //Label creation Employee ID
        JLabel Employee_ID  = new JLabel("Employee ID =  ");
        Employee_ID.setBounds(10,70,150,30);
        Employee_ID.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        Employee_ID.setForeground(new Color(177,252,197));
        img.add(Employee_ID);
        //JTextField Name
        tempid = new JLabel(""+number);
        tempid.setBounds(140,70,150,30);
        tempid.setFont(new Font( "SAN_SARIF",Font.BOLD,25));
        tempid.setForeground(Color.cyan);
        img.add(tempid);

         //Label creation Name
        JLabel name = new JLabel("Full Name");
        name.setBounds(15,110,150,30);
        name.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        name.setForeground(new Color(0,0,0));
        img.add(name);
        //JTextField Name
        tname = new JTextField();
        tname.setBounds(130,110,150,30);
        tname.setBackground(new Color(255,255,255));
        img.add(tname);

        //Label creation father_name
        JLabel father_name = new JLabel("Father Name ");
        father_name.setBounds(5,150,150,30);
        father_name.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        father_name.setForeground(new Color(0,0,0));
        img.add(father_name);
        //JTextField father_name
        tfather_name = new JTextField();
        tfather_name.setBounds(130,150,150,30);
        tfather_name.setBackground(new Color(177,252,197));
        img.add(tfather_name);

        //Label creation tmother_name
        JLabel mother_name = new JLabel("Mother Name");
        mother_name.setBounds(5,190,150,30);
        mother_name.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        mother_name.setForeground(new Color(0,0,0));
        img.add(mother_name);
        //JTextField Mother_name
        tmother_name = new JTextField();
        tmother_name.setBounds(130,190,150,30);
        tmother_name.setBackground(new Color(255,255,255));
        img.add(tmother_name);
//Date of birth
        JLabel dod = new JLabel("Date of birth");
        dod.setBounds(10,250,150,30);
        dod.setFont( new Font("SAN_SERIF",Font.BOLD,20));
        img.add(dod);

        tdate_of_birth =new JDateChooser();
        tdate_of_birth.setBounds(130,250,150,30);
        tdate_of_birth.setBackground(new Color(177,252,197));
        img.add(tdate_of_birth);


        //Label creation Salary
        JLabel Salary = new JLabel("Salary");
        Salary.setBounds(5,290,150,30);
        Salary.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        Salary.setForeground(new Color(0,0,0));
        img.add(Salary);
        //JTextField Salary
        tSalary= new JTextField();
        tSalary.setBounds(130,290,150,30);
        tSalary.setBackground(new Color(255,255,255));
        img.add(tSalary);
//Label creation Address
        JLabel Address = new JLabel("Address");
        Address.setBounds(10,340,150,30);
        Address.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        Address.setForeground(new Color(0,0,0));
        img.add(Address);
        //JTextField Mother_name
        tAddress= new JTextField();
        tAddress.setBounds(130,340,150,30);
        tAddress.setBackground(new Color(255,255,255));
        img.add(tAddress);

        //Label creation Phone
        JLabel Phone = new JLabel("Phone");
        Phone.setBounds(10,390,150,30);
        Phone.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        Phone.setForeground(new Color(0,0,0));
        img.add(Phone);
        //JTextField Phone
        tPhone= new JTextField();
        tPhone.setBounds(130,390,150,30);
        tPhone.setBackground(new Color(255,255,255));
        img.add(tPhone);

        //Label creation Email
        JLabel Email = new JLabel("Email");
        Email.setBounds(10,440,150,30);
        Email.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        Email.setForeground(new Color(0,0,0));
        img.add(Email);
        //JTextField Email
        tEmail= new JTextField();
        tEmail.setBounds(130,440,150,30);
        tEmail.setBackground(new Color(255,255,255));
        img.add(tEmail);

        // JLabel education qualification
        JLabel education = new JLabel("Education Qualification");
        education.setBounds(10,490,150,30);
        education.setFont(new Font("SAN_SERIF",Font.BOLD,25));
img.add(education);
String items []={"Phd","Doctorate","Master's","Bachelor","Hons","HSC","SSC","Under SSC"};
educationBox = new JComboBox(items);
educationBox.setBackground(new Color(177,252,197));
educationBox.setBounds(130,490,150,30);
img.add(educationBox);


        //Label creation NID
        JLabel NID = new JLabel("NID");
        NID.setBounds(10,540,150,30);
        NID.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        NID.setForeground(new Color(0,0,0));
        img.add(NID);
        //JTextField NID
        tNID= new JTextField();
        tNID.setBounds(130,540,150,30);
        tNID.setBackground(new Color(255,255,255));
        img.add(tNID);


        //Label creation tDesignstion
        JLabel Designstion = new JLabel("Designstion");
        Designstion.setBounds(10,590,150,30);
        Designstion.setFont(new Font("SAN_SERIF",Font.ITALIC,20));
        Designstion.setForeground(new Color(0,0,0));
        img.add(Designstion);
        //JTextField Email
        tDesignstion= new JTextField();
        tDesignstion.setBounds(130,590,150,30);
        tDesignstion.setBackground(new Color(255,255,255));
        img.add(tDesignstion);

        //Button
        Submit =new JButton("Submit");
        Submit.setBounds(350,500,150,40);

        Submit.setBackground(Color.CYAN);
        Submit.setForeground(Color.white);
        img.add(Submit);
        Submit.addActionListener(this);
        //Button Back

        Back =new JButton("Back");
        Back.setBounds(550,500,150,40);

        Back.setBackground(Color.black);
        Back.setForeground(Color.white);
        img.add(Back);
Back.addActionListener(this);


// Basic Fram
setSize(900,700);
setLayout(null);
setLocation(300,50);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Submit){
            String Name =tname.getText();
            String Father_name =tfather_name.getText();
            String Mother_name = tmother_name.getText();
            String Date_of_birth = ((JTextField)tdate_of_birth.getDateEditor().getUiComponent()).getText();
            String Salary = tSalary.getText();
            String Address =tAddress.getText();
            String Phone = tPhone.getText();
            String Email =tEmail.getText();
            String Education = (String)educationBox.getSelectedItem();
        String NID =tNID.getText();
        String Designstion =tDesignstion.getText();
        String Employee_ID = tempid.getText();



        try{
            conn data = new conn();
            String query ="insert into employee values('"+Employee_ID+"','"+Name+"','"+Father_name+"','"+Mother_name+"','"+Date_of_birth+"','"+Salary+"','"+Address+"','"+Phone+"','"+Email+"','"+Education+"','"+NID+"','"+Designstion+"')";
data.statement.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Data Insert Successful");
setVisible(false);
new Main_class();

        }catch (Exception E){
            E.printStackTrace();

                    }

        }else {
            setVisible(false);
            new Main_class();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();

    }
}
