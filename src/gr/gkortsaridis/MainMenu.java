package gr.gkortsaridis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yoko on 08/04/16.
 */
public class MainMenu extends JFrame{
    private JButton button1;
    private JPanel panel1;

    public MainMenu(){
        super("UoWM Hacker");
        setContentPane(panel1);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);

        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                HackForm hf = new HackForm();
                MainMenu.this.dispose();
            }
        });

        setVisible(true);
    }

}
