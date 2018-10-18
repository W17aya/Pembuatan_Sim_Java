import javax.swing.*;
import java.awt.*;


public class AplikasiPanel1 extends JFrame {
    JPanel panel1=new JPanel();
    JLabel label1=new JLabel("Nama");
    JTextField text1=new JTextField(20);

    AplikasiPanel1()
    {
        setLocation(300,100);
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    void KomponenVisual()
    {
        panel1.add(label1);
        panel1.add(text1);
        getContentPane().add(panel1);
        setVisible(true);

    }
   public  static void main (String args[])
    {
        AplikasiPanel1 p1=new AplikasiPanel1();
        p1.KomponenVisual();
        
    }
}
