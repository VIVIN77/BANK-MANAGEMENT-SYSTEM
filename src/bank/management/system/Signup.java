package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    Random ran = new Random();
    long first4= (ran.nextLong() % 9000L) +1000L;
    String first = " "+ Math.abs(first4);

    JTextField textName, textFname, textEmail, textMsField,textAdd,textCity,textPin,textState;
    JDateChooser dateChooser;
 
    Signup(){

        super("APPLICATION FORM");

            ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); //locating the file 
            Image i2= i1.getImage().getScaledInstance(100,100 , Image.SCALE_DEFAULT);  //scaling the image
            ImageIcon i3 = new ImageIcon(i2); //Creating a New ImageIcon with the Scaled Image
            //This ImageIcon can now be used as a graphical element for the Swing components, i.e for JLabel.
            JLabel image = new JLabel(i3);
            image.setBounds(25, 10, 100, 100);
            add(image);

            JLabel label1 = new JLabel("APPLICATION FORM NO: "+ first);
            label1.setBounds(160,20,600,40);
            label1.setFont(new Font("Raleway", Font.BOLD, 38));
            add(label1);

            JLabel label2= new JLabel("Page 1");
            label2.setFont(new Font("Raleway", Font.BOLD, 22));
            label2.setBounds(380, 70, 600, 30);
            add(label2);

            JLabel label3= new JLabel("Personal Details");
            label3.setFont(new Font("Raleway", Font.BOLD, 22));
            label3.setBounds(330, 110, 600,30);
            add(label3);

            JLabel labelName= new JLabel("Name : ");
            labelName.setFont(new Font("Raleway", Font.BOLD,20));
            labelName.setBounds(100,190,100,30);;
            add(labelName);

            textName = new JTextField();
            textName.setFont(new Font("Raleway", Font.BOLD,14));
            textName.setBounds(300, 190,400,30);
            add(textName);

            JLabel labelFName= new JLabel("Father's Name :");
            labelFName.setFont(new Font("Raleway", Font.BOLD,20));
            labelFName.setBounds(100,240,200,30);;
            add(labelFName);

            textFname = new JTextField();
            textFname.setFont(new Font("Raleway", Font.BOLD,14));
            textFname.setBounds(300, 240,400,30);
            add(textFname);

            JLabel Dob= new JLabel("Date Of Birth :");
            Dob.setFont(new Font("Raleway", Font.BOLD,20));
            Dob.setBounds(100,340,200,30);;
            add(Dob);

            dateChooser = new JDateChooser();
            dateChooser.setForeground(new Color(105,105,105));
            dateChooser.setBounds(300, 340, 400, 30);
            add(dateChooser);

            JLabel label6= new JLabel("Gender :");
            label6.setFont(new Font("Ralway", Font.BOLD, 20));
            label6.setBounds(100, 290,200,30);
            add(label6);
            

            r1= new JRadioButton("Male");
            r1.setFont(new Font("Raleway", Font.BOLD, 16));
            r1.setBackground(new Color(222,255,228));
            r1.setBounds(300,290,60,30);
            add(r1);

            r2= new JRadioButton("Female");
            r2.setFont(new Font("Raleway", Font.BOLD, 16));
            r2.setBackground(new Color(222,255,228));
            r2.setBounds(450,290,90,30);
            add(r2);

            ButtonGroup buttonGroup= new ButtonGroup();
            buttonGroup.add(r1);
            buttonGroup.add(r2);

            JLabel labelEmail= new JLabel("Email Address :");
            labelEmail.setFont(new Font("Raleway", Font.BOLD,20));
            labelEmail.setBounds(100,390,200,30);
            add(labelEmail);

            textEmail = new JTextField();
            textEmail.setFont(new Font("Raleway", Font.BOLD,14));
            textEmail.setBounds(300, 390,400,30);
            add(textEmail);

            JLabel textms= new JLabel("Marital Status :");
            textms.setFont(new Font("Raleway", Font.BOLD,20));
            textms.setBounds(100,440,200,30);
            add(textms);

            m1=new JRadioButton("Unmarried");
            m1.setFont(new Font("Raleway",Font.BOLD,16));
            m1.setBackground(new Color(222,255,228));
            m1.setBounds(300, 440,150, 30);
            add(m1);

            m2= new JRadioButton("Married");
            m2.setFont(new Font("Raleway",Font.BOLD,16));
            m2.setBackground(new Color(222,255,228));
            m2.setBounds(450, 440,90, 30);
            add(m2);

            
            m3= new JRadioButton("Other");
            m3.setFont(new Font("Raleway",Font.BOLD,16));
            m3.setBackground(new Color(222,255,228));
            m3.setBounds(600, 440,90, 30);
            add(m3);

            ButtonGroup buttonGroup2= new ButtonGroup();
            buttonGroup2.add(m1);
            buttonGroup2.add(m2);
            buttonGroup2.add(m3);

            


            JLabel labelAdd= new JLabel("Address : ");
            labelAdd.setFont(new Font("Raleway", Font.BOLD,20));
            labelAdd.setBounds(100,490,200,30);
            add(labelAdd);

            textAdd = new JTextField();
            textAdd.setFont(new Font("Raleway", Font.BOLD,14));
            textAdd.setBounds(300, 490,400,30);
            add(textAdd);

            JLabel labelCity= new JLabel("City : ");
            labelCity.setFont(new Font("Raleway", Font.BOLD,20));
            labelCity.setBounds(100,540,200,30);
            add(labelCity);
            
            textCity = new JTextField();
            textCity.setFont(new Font("Raleway", Font.BOLD,14));
            textCity.setBounds(300, 540,400,30);
            add(textCity);

            
            JLabel labelPin= new JLabel("Pin : ");
            labelPin.setFont(new Font("Raleway", Font.BOLD,20));
            labelPin.setBounds(100,590,200,30);
            add(labelPin);
            
            textPin = new JTextField();
            textPin.setFont(new Font("Raleway", Font.BOLD,14));
            textPin.setBounds(300, 590,400,30);
            add(textPin);

            JLabel labelState= new JLabel("State : ");
            labelState.setFont(new Font("Raleway", Font.BOLD,20));
            labelState.setBounds(100,640,200,30);
            add(labelState);
            
            textState = new JTextField();
            textState.setFont(new Font("Raleway", Font.BOLD,14));
            textState.setBounds(300, 640,400,30);
            add(textState);

            next = new JButton("Next");
            next.setFont(new Font("Raleway",Font.BOLD, 16));
            next.setBackground(Color.BLACK);
            next.setForeground(Color.white);
            next.setBounds(620,710,80,30);
            next.addActionListener(this);
            add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    
    

    



    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name= textName.getText();
        String fname= textFname.getText();
        String dob= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else{
            gender= "Female";
        }
        String email= textEmail.getText();
        String marital= null;
        if(m1.isSelected()){
            marital= "Unmarried";
        }else if(m2.isSelected()){
            marital = "Married";
        }else if(m3.isSelected()){
            marital= "Others";
        }

        String address= textAdd.getText();
        String city= textCity.getText();
        String pincode = textPin.getText();
        String state= textState.getText();
        try {
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else{
                Conn con= new Conn();
                String q=  "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                con.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }
        } catch (Exception E) {
            E.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new Signup();
    }
}
