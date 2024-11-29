package Employee.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    public Splash() {
        //image inserting method
ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icone/Blue.gif"));
//image sizing method
        Image i2 = i1.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);

      ImageIcon i3 =new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0,0,1170,650);
      add(image);
        //basic frame display
        setSize(1170,650);
        setLayout(null);
        setVisible(true);
        setLocation(200,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //how many times frame shows
        try{
Thread.sleep(10000);
setVisible(false);
new Login();
            //new AdminPanel();
        }catch (Exception e){
            e.printStackTrace();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {

new Splash();
    }
}
