import javax.swing.*;
import java.awt.*;

public class AplikasiPanel3 extends JFrame 
{
JPanel panel1=new JPanel();
JLabel label1=new JLabel("Nama");
JTextField text1=new JTextField(20);
JPanel panel2=new JPanel();
JButton tombol1=new JButton("Simpan");
JButton exit=new JButton("Exit");

AplikasiPanel3()
{
    setLocation(300,100);
    setSize(300,150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

void KomponenVisual()
{
   panel1.add(label1);
 panel1.add(text1);
 panel1.setLayout(new GridLayout(2,1));
 getContentPane().add(panel1, BorderLayout.NORTH);
 panel2.setLayout(new BorderLayout());
 panel2.add(tombol1,"Center");
 panel2.add(exit,"East");
 getContentPane().add(panel2, BorderLayout.SOUTH);
 setVisible(true); 

}
public static void main (String args[])
{
    AplikasiPanel3 p3=new AplikasiPanel3();
    p3.KomponenVisual();
}
}
