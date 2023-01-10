package TextFieldProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField implements ActionListener {
    JTextField jTextField;
    JButton reverseBtn;
    JLabel promptLabel;
    JLabel contentLabel;

    public TextField(){
        JFrame jFrame  = new JFrame("Enter text");
        jFrame.setLayout(new FlowLayout());
        jFrame.setVisible(true);
        jFrame.setSize(250, 120);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create textfield
        //columns wide
          jTextField = new JTextField(10);
          jTextField.setActionCommand("textField");

          //create button
        reverseBtn = new JButton("Reverse");

        //Add Listeners
        jTextField.addActionListener(this);
        reverseBtn.addActionListener(this);

        //create prompt labe;
        promptLabel = new JLabel("Enter Text");
        contentLabel = new JLabel("");

        //ADD TO FRAME
        jFrame.add(promptLabel);
        jFrame.add(reverseBtn);
        jFrame.add(jTextField);
        jFrame.add(contentLabel);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Reverse")){
            //reverse the string
            String originalString = jTextField.getText();
            String holder = "";
            for(int i = originalString.length()- 1 ; i >= 0 ; i--){
                holder += originalString.charAt(i) ;
                contentLabel.setText(holder);
            }
        }else{
            //enter was pressed while focused
            contentLabel.setText("You pressed enter. Text is " + jTextField.getText());
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextField();
            }
        });
    }


}
