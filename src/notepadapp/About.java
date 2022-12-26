
package notepadapp;
import java.awt.Font;
import javax.swing.*;

public class About extends JFrame {
    
    About(){
        setBounds(100,100,500,400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon=new ImageIcon(getClass().getResource("notepad.png"));
        setIconImage(icon.getImage());
        
        setLayout(null);
        
        JLabel iconLabel=new JLabel(new ImageIcon(getClass().getResource("notepad.png")));
        iconLabel.setBounds(100,50,80,80);
        add(iconLabel);
        
        JLabel textLabel=new JLabel("<html>Notepad is a word processing program, which allows changing of text in a computer file.<br> Notepad was created by the Microsoft corporation.</html>");
        textLabel.setBounds(100,50,350,300);
        textLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,13));
        add(textLabel);
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
    
}
