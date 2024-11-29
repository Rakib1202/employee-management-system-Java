package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    // use for typing user name and password
    JTextField tusername;
    JPasswordField tpassword;
    // Use for button
    JButton login, back,signUp;
    // Use for show password checkbox
    JCheckBox showPassword;

    public Login() {
        // Set the layout manager section
        setLayout(null);

        // Create and add labels with proper bounds for Username section
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(40, 20, 100, 30);
        add(usernameLabel);

        // Create JTextField for username section
        tusername = new JTextField();
        tusername.setBounds(150, 20, 200, 30);
        add(tusername);

        // Create and add labels with proper bounds for Password section
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(40, 70, 100, 30);
        add(passwordLabel);

        // Create JPasswordField for Password section
        tpassword = new JPasswordField();
        tpassword.setBounds(150, 70, 200, 30);
        add(tpassword);

        // Create and add JCheckBox for show password section
        showPassword = new JCheckBox("Show Password");
        showPassword.setBounds(150, 110, 150, 30);
        showPassword.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                tpassword.setEchoChar((char) 0);
            } else {
                tpassword.setEchoChar('•');
            }
        });
        add(showPassword);

        // Button login section
        login = new JButton("LOGIN");
        login.setBounds(150, 150, 150, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);




        // Button back
            back = new JButton("BACKS");
        back.setBounds(150, 190, 150, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);



        //background Image  section
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icone/Login1.gif"));
        Image i2 =  i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img =new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);


        // Set the  Basic frame properties section
        setSize(600, 300);
        setLocation(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


  @Override
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == login){
          try {
              String username = tusername.getText();
              String password = tpassword.getText();

              conn conn = new conn();
              //Checking whether the databases are in the database at all
              String query = "select * from login where username = '"+ username +"' and password = '"+password+"'";
              ResultSet resultSet = conn.statement.executeQuery(query);
              if (resultSet.next()){
                  setVisible(false);
                  new Main_class();
              }else {
                  JOptionPane.showMessageDialog(null,"Invalid username or password");
              }

          }catch (Exception E){
              E.printStackTrace();
          }

      } else if (e.getSource() == back) {
          System.exit(5);
      }
  }

    public static void main(String[] args) {
        new Login();
    }
}