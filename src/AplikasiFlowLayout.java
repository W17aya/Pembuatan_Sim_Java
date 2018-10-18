import javax.swing.*;
import java.awt.*;

public class AplikasiFlowLayout extends JFrame
{
 JLabel nama=new JLabel("Nama");
 JLabel nim =new JLabel("Nim");
 JTextField txnama=new JTextField(20);
 JTextField txnim=new JTextField(7);
 JButton tombolSimpan=new JButton("Simpan");
 
 AplikasiFlowLayout()
 {
   setLocation(200,100);
    setSize(450,120);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}

void KomponenVisual()
{
getContentPane().setLayout(new FlowLayout());
getContentPane().add(nama);
getContentPane().add(txnama);
getContentPane().add(nim);
getContentPane().add(txnim);
getContentPane().add(tombolSimpan);
setVisible(true);
}
public static void main(String argas[])
{
    AplikasiFlowLayout fl=new AplikasiFlowLayout();
    fl.KomponenVisual();
}
}
