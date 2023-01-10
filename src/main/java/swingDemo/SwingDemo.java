package swingDemo;
import javax.swing.*;

public class SwingDemo {
    SwingDemo(){
        //1. create jFrame container
        JFrame jFrame  = new JFrame("First Swing Application");
        //2. give jframe a size
        jFrame.setSize(275 ,100);
        //3. Terminate the program when user closes
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //5. show the frame
        jFrame.setVisible(true);

        //6 add jlabel - alows to add text to the frame
        JLabel jLabel = new JLabel("This is great");
        //7 add jlabel to frame
        jFrame.add(jLabel);

    }

    public static void main(String[] args) {
//4. create a thread to let jframe run
        //create the frame on event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
