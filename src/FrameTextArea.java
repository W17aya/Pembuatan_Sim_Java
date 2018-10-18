import javax.swing.*;
import java.awt.*;


public class FrameTextArea extends JFrame{
   private JLabel label=new JLabel("Nama");
   private JTextArea area1=new JTextArea(3,20);
   
   FrameTextArea()
   {
       setLocation(200,100);
       setSize(300,100);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       getContentPane().add(label);
       getContentPane().add(area1);
       getContentPane().setLayout(new FlowLayout()); 
       show();
       
   }
}
class AplikasiTextArea
{
    public static void main (String args[])
    {
        FrameTextArea tf=new FrameTextArea();
    }
}
