package ButtonDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo implements ActionListener{
    JLabel myLabel = new JLabel();
    public ButtonDemo() {

        //3. create jFrame
        JFrame jFrame = new JFrame("Button");
        //4. Specify the flowlayout
        jFrame.setLayout(new FlowLayout());

        //5. give size to the frame
        jFrame.setSize(220, 80);

        //6. close the frame
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //7 create the button
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        //making label
        myLabel = new JLabel(" press a button");

        //9 using interface to add event listeners on the object (this)
        upButton.addActionListener(this);
        downButton.addActionListener(this);



        //        //8 add event listeners also i implemented ActionListener interface
//        upButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello up clicked ");
//            }
//        });
//       downButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello Down Clicked");
//            }
//        });


        jFrame.add(upButton);
        jFrame.add(downButton);
        jFrame.add(myLabel);




        //set the frame visibility
        jFrame.setVisible(true);

    }


    @Override
        public void actionPerformed (ActionEvent e){
            if (e.getActionCommand().equals("Up")) {
                myLabel.setText("You pressed Ups");
            } else {
                myLabel.setText("You pressed down");
            }

        }


        public static void main (String[]args){
            //1. create the frame on the event dispatching thread
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    //2 initialize constructor
                    new ButtonDemo();

                }
            });
        }


}
