package Employee.Management.System;


import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewEmployee extends JFrame implements ActionListener {
JTable table;
Choice choice_Employee_id;
    JButton searchbtn, print, update, back;
    public ViewEmployee() {
// Drop Down menu
        choice_Employee_id = new Choice();
        choice_Employee_id.setBounds(180,20,150,20);
        add(choice_Employee_id);
        try{
            conn d = new conn();
            ResultSet result =d.statement.executeQuery("select * from Employee");
while (result.next()){

    choice_Employee_id.add(result.getString("Employee_ID"));
}
        }catch (Exception e){
            e.printStackTrace();
        }
        table =new JTable();

        try{

            conn d2 =new conn();
            ResultSet result2 =d2.statement.executeQuery("select * from Employee");
            table.setModel(DbUtils.resultSetToTableModel(result2));
        }catch (Exception e){
            e.printStackTrace();
        }
JScrollPane jp =new JScrollPane(table);
        jp.setBounds(0,100,900,600);
        add(jp);

// button

        searchbtn = new JButton("Search");
        searchbtn.setBounds(20,70,80,20);
        searchbtn.addActionListener(this);
        add(searchbtn);



        update = new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320,70,80,20);
        back.addActionListener(this);
        add(back);


        // Basic fram
        getContentPane().setBackground(new Color(255,131,122));
        JLabel Search =new JLabel("Search by employee id");
        Search.setBounds(20,20,150,20);
        add(Search);
        setSize(900,700);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==searchbtn){
            String query ="select * from Employee where Employee_ID = '"+choice_Employee_id.getSelectedItem()+"'" ;
      try{
conn d3 = new conn();
ResultSet result2 = d3.statement.executeQuery(query);
table.setModel(DbUtils.resultSetToTableModel(result2));
      }catch (Exception E){

E.printStackTrace();
      }

        } else if (e.getSource()== print) {
try{

}catch (Exception E){
E.printStackTrace();
}

        } else if (e.getSource()== update) {

            setVisible(false);
            new UpdateEmployee(choice_Employee_id.getSelectedItem());
        }else {
            setVisible(false);
          new  Main_class ();
        }
    }


    public static void main(String[] args) {
        new ViewEmployee();
    }
}
