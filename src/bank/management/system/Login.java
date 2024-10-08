package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JLabel label1, label2, label3, label4;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;
    Login(){
            super("Bank Management System"); //gives the title 
            ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); //locating the file 
            Image i2= i1.getImage().getScaledInstance(100,100 , Image.SCALE_DEFAULT);  //scaling the image
            ImageIcon i3 = new ImageIcon(i2); //Creating a New ImageIcon with the Scaled Image
            //This ImageIcon can now be used as a graphical element for the Swing components, i.e for JLabel.
            JLabel image = new JLabel(i3);
            image.setBounds(350, 10, 100, 100);
            add(image);

            ImageIcon ii1= new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
            Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            ImageIcon ii3 = new ImageIcon(ii2);
            JLabel iimage= new JLabel(ii3);
            iimage.setBounds(650,350, 100, 100);
            add(iimage);

            label1 = new JLabel("WELCOME TO ATM");
            label1.setForeground(Color.WHITE);
            label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
            label1.setBounds(230,125, 450, 40);
            add(label1);

            label2 = new JLabel("CARD NO:");
            label2.setForeground(Color.WHITE);
            label2.setFont(new Font("Ralway", Font.BOLD, 28));
            label2.setBounds(120,190, 375, 30);
            add(label2);

            textField2 = new JTextField(15);
            textField2.setBounds(325, 190, 230,30);
            textField2.setFont(new Font("Arial", Font.BOLD, 14));
            add(textField2);
            
            label3= new JLabel("PIN:");
            label3.setForeground(Color.white);
            label3.setFont(new Font("Ralway", Font.BOLD, 28));
            label3.setBounds(120, 250, 375, 30);
            add(label3);

            passwordField3 = new JPasswordField(15);
            passwordField3.setBounds(325,250,230,30);
            passwordField3.setFont(new Font("Arial", Font.BOLD,14));
            add(passwordField3);
            
            button1 = new JButton("SIGN IN");
            button1.setFont(new Font("Arial",Font.BOLD, 14));
            button1.setForeground(Color.black);
            button1.setBounds(320,300,100,30);
            button1.addActionListener(this);
            add(button1);

            button2 = new JButton("CLEAR");
            button2.setFont(new Font("Arial",Font.BOLD, 14));
            button2.setForeground(Color.black);
            button2.setBounds(450,300,100,30);
            button2.addActionListener(this);
            add(button2);

            label4 = new JLabel("(Don't have an account?)") ;
            label4.setForeground(Color.white);
            label4.setFont(new Font("Ralway", Font.BOLD, 18));
            label4.setBounds(100, 350, 375, 30);
            add(label4);

            button3 = new JButton("SIGN UP");
            button3.setFont(new Font("Arial",Font.BOLD, 14));
            button3.setForeground(Color.white);
            button3.setBackground(new Color(32,32,32));
            button3.setBounds(380,350,100,30);
            button3.addActionListener(this);
            add(button3);



            ImageIcon iii1= new ImageIcon(ClassLoader.getSystemResource("icon/back.jpg"));
            Image iii2 = iii1.getImage().getScaledInstance(850, 490, Image.SCALE_DEFAULT);
            ImageIcon iii3 = new ImageIcon(iii2);
            JLabel iiimage= new JLabel(iii3);
            iiimage.setBounds(0,0, 850, 500);
            add(iiimage);
            



            setLayout(null);
            setSize(850,440);
            setLocation(430,200);   //x is distance of 430 from the left
            //setUndecorated(true);   it's used to hide min max close window
            setVisible(true);
    }

    
    public static void main(String[] args) {
         new Login();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == button1){

                Conn c= new Conn();
                String cardno= textField2.getText();
                String pin = passwordField3.getText();

                String q= "select * from login where card_no = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultset= c.statement.executeQuery(q);
                if(resultset.next()){
                    setVisible(false);
                    new main_class(pin);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
                  
            }else if(e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
                
            }else if(e.getSource() == button3){
                new Signup();
                setVisible(false);
            }
        } catch (Exception E) {
           E.printStackTrace();
        } 
    }


   
    
    
}

    
