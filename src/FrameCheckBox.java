import javax.swing.*;
import java.awt.*;


public class FrameCheckBox extends JFrame
{
    JCheckBox cek1=new JCheckBox("Pilihan 1");
    JCheckBox cek2=new JCheckBox("Pilihan 2");
    JCheckBox cek3=new JCheckBox("Pilihan 3");
    
    FrameCheckBox()
    {
        setLocation(200,100);
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    void KomponenVisual()
    {
      getContentPane().add(cek1); 
        getContentPane().add(cek2);
        getContentPane().add(cek3);
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
}

class AplikasiCheckBox
{
 public static void main(String args[])
 {
     FrameCheckBox cb=new FrameCheckBox();
     cb.KomponenVisual();
 }
}
