package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.lang.String;
import javax.swing.*;



public class Signup2 extends JFrame implements ActionListener{
    String formno;
    JComboBox comboBox, comboBox2,comboBox3,comboBox4,comboBox5,comboBox6;
    JTextField textPan, textAadhar;
    JButton next;
    JRadioButton s1,s2,e1,e2;
    Signup2(String formno){
        super("APPLICATION FORM");
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); //locating the file 
            Image i2= i1.getImage().getScaledInstance(100,100 , Image.SCALE_DEFAULT);  //scaling the image
            ImageIcon i3 = new ImageIcon(i2); //Creating a New ImageIcon with the Scaled Image
            //This ImageIcon can now be used as a graphical element for the Swing components, i.e for JLabel.
            JLabel image = new JLabel(i3);
            image.setBounds(150, 5, 100, 100);
            add(image);

            this.formno= formno;

            JLabel l1= new JLabel("Page 2:-");
            l1.setFont(new Font("RAleway", Font.BOLD,22));
            l1.setBounds(300,30,600,40);
            add(l1);
            JLabel l2= new JLabel("Additional Details");
            l2.setFont(new Font("RAleway", Font.BOLD,22));
            l2.setBounds(300,60,600,40);
            add(l2);

            JLabel l3= new JLabel("Religion");
            l3.setFont(new Font("RAleway", Font.BOLD,18));
            l3.setBounds(100,120,100,30);
            add(l3);

            String religion[]= {"Christian", "Hindu","Sikh","Muslim", "Other"};
            comboBox= new JComboBox(religion);
            comboBox.setBackground(new Color(192,192,192));
            comboBox.setFont(new Font("Raleway", Font.BOLD,14));
            comboBox.setBounds(350,120,320,30);
            add(comboBox);

            JLabel l4= new JLabel("Category");
            l4.setFont(new Font("RAleway", Font.BOLD,18));
            l4.setBounds(100,170,100,30);
            add(l4);
            String Category[]= {"General", "OBC","SC","ST","BC", "Other"};
            comboBox2= new JComboBox(Category);
            comboBox2.setBackground(new Color(192,192,192));
            comboBox2.setFont(new Font("Raleway", Font.BOLD,14));
            comboBox2.setBounds(350,170,320,30);
            add(comboBox2);

            
            JLabel l5= new JLabel("Income");
            l5.setFont(new Font("RAleway", Font.BOLD,18));
            l5.setBounds(100,220,100,30);
            add(l5);

            String Income[]= {"Null", "Less than 150,000","150,000-250,000","250,000-500,000","Up to 1,000,000", "Above 1,000,000"};
            comboBox3= new JComboBox(Income);
            comboBox3.setBackground(new Color(192,192,192));
            comboBox3.setFont(new Font("Raleway", Font.BOLD,14));
            comboBox3.setBounds(350,220,320,30);
            add(comboBox3);

            JLabel l6= new JLabel("Educational ");
            l6.setFont(new Font("RAleway", Font.BOLD,18));
            l6.setBounds(100,270,150,30);
            add(l6);

            String Educational[]= {"Non-Graduate", "Graduate","Post Graduate","Doctrate","Others"};
            comboBox4= new JComboBox(Educational);
            comboBox4.setBackground(new Color(192,192,192));
            comboBox4.setFont(new Font("Raleway", Font.BOLD,14));
            comboBox4.setBounds(350,270,320,30);
            add(comboBox4);

            JLabel l7= new JLabel("Occupation ");
            l7.setFont(new Font("RAleway", Font.BOLD,18));
            l7.setBounds(100,330,150,30);
            add(l7);

            String Occupation[]= {"Salaried", "Self- Employed","Business","Student","Retired","Others"};
            comboBox5= new JComboBox(Occupation);
            comboBox5.setBackground(new Color(192,192,192));
            comboBox5.setFont(new Font("Raleway", Font.BOLD,14));
            comboBox5.setBounds(350,330,320,30);
            add(comboBox5);

            JLabel l8= new JLabel("PAN Number ");
            l8.setFont(new Font("RAleway", Font.BOLD,18));
            l8.setBounds(100,390,150,30);
            add(l8);


            textPan= new JTextField();
            textPan.setFont(new Font("Raleway", Font.BOLD,16));
            textPan.setBounds(350,390,170,30);
            textPan.setBackground(new Color(192,192,192));
            add(textPan);


            JLabel l9= new JLabel("Aadhar Number ");
            l9.setFont(new Font("RAleway", Font.BOLD,18));
            l9.setBounds(100,450,180,30);
            add(l9);


            textAadhar= new JTextField();
            textAadhar.setFont(new Font("Raleway", Font.BOLD,16));
            textAadhar.setBounds(350,450,170,30);
            textAadhar.setBackground(new Color(192,192,192));
            add(textAadhar);

            JLabel l10= new JLabel("Senior Citizen ");
            l10.setFont(new Font("RAleway", Font.BOLD,18));
            l10.setBounds(100,510,180,30);
            add(l10);

            s1= new JRadioButton("Yes");
            s1.setFont(new Font("RAleway", Font.BOLD,18));
            s1.setBounds(350,510,100,30);
            s1.setBackground(new Color(150,150,150));
            add(s1);

            s2= new JRadioButton("No");
            s2.setFont(new Font("RAleway", Font.BOLD,18));
            s2.setBounds(500,510,180,30);
            s2.setBackground(new Color(150,150,150));
            add(s2);

            ButtonGroup buttonGroup= new ButtonGroup();
            buttonGroup.add(s1);
            buttonGroup.add(s2);

            JLabel l11= new JLabel("Exisiting Account ");
            l11.setFont(new Font("RAleway", Font.BOLD,18));
            l11.setBounds(100,550,180,30);
            add(l11);

            e1= new JRadioButton("Yes");
            e1.setFont(new Font("RAleway", Font.BOLD,18));
            e1.setBounds(350,550,100,30);
            e1.setBackground(new Color(150,150,150));
            add(e1);

            e2= new JRadioButton("No");
            e2.setFont(new Font("RAleway", Font.BOLD,18));
            e2.setBounds(500,550,100,30);
            e2.setBackground(new Color(150,150,150));
            add(e2);

            ButtonGroup buttonGroup1= new ButtonGroup();
            buttonGroup1.add(e1);
            buttonGroup1.add(e2);


            JLabel l12= new JLabel("Form No ");
            l12.setFont(new Font("RAleway", Font.BOLD,14));
            l12.setBounds(700,10,100,30);
            add(l12);

            JLabel l13= new JLabel(formno);
            l13.setFont(new Font("RAleway", Font.BOLD,14));
            l13.setBounds(760,10,60,30);
            add(l13);


            next= new JButton("Next");
            next.setFont(new Font("Raleway", Font.BOLD,14));
            next.setBackground(Color.white);
            next.setForeground(Color.black);
            next.setBounds(570,640,100,30);
            next.addActionListener(this);
            add(next);


            

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(150,150,150));



       setVisible(true);
   }

@Override
public void actionPerformed(ActionEvent e) {
   String rel= (String) comboBox.getSelectedItem();
   String cate= (String) comboBox2.getSelectedItem();
   String inc = (String) comboBox3.getSelectedItem();
   String edu = (String) comboBox4.getSelectedItem();
   String occ= (String) comboBox5.getSelectedItem();

   String pan = textPan.getText();
   String aadhar = textAadhar.getText();

   String scitizen= null;
   if((s1.isSelected())){
    scitizen= "Yes";
   }else if((s2.isSelected())){
    scitizen= "No";
   }

   String eAccount = " ";
   if((e1.isSelected())){
    eAccount = "Yes";
   }else if(e2.isSelected()){
    eAccount = "No";
   }

   try {
        if(textPan.getText().equals("") || textAadhar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        }else{
            Conn c1= new Conn();
            String q= "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
            c1.statement.executeUpdate(q);
            new Signup3(formno);
            setVisible(false);

        }
   } catch (Exception E) {
    E.printStackTrace();
   }

   
   
    
}

public static void main(String[] args) {
    new Signup2("");
}

}
