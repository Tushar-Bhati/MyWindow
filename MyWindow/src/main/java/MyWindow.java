import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow {
    public static void main(String[] args){

        //window : object Frame
        /* BELOW 3 LINES ARE RESPONSIBLE TO MAKE windows AND EXIT BUTTON
        JFrame frame = new JFrame("MyWindow");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); */

        JFrame frame = new JFrame("MyWindow");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        //ADDING BUTTONS and ADD JFRAME

        JButton button = new JButton("Click me!!");
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //adding action listener in classic way
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
                JOptionPane.showMessageDialog(null,"hey!! button click");
            }
        });*/

        button.addActionListener((ActionEvent e) -> {
            System.out.println("Button Click");
            JOptionPane.showMessageDialog(null,"Heyy!! Button Clicked");
        });

        //in addmousemotionliatener we use anonymous class as it can override two or more methods
        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

    }
}
