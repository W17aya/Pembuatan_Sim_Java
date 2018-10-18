import javax.swing.*;
import java.awt.*;

public class AplikasiGridLayout extends JFrame{
    JLabel nama=new JLabel("Nama");
    JLabel nim=new JLabel("Nim");
    JTextField txnama=new JTextField(20);
    JTextField txnim=new JTextField(7);
    JButton tombolSimpan=new JButton("Simpan");
    
    AplikasiGridLayout()
    {
        setLocation(200,100);
        setSize(450,120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void KomponenVisual()
    {
        getContentPane().setLayout(new GridLayout(4,2));
        getContentPane().add(nama);
         getContentPane().add(nim);
          getContentPane().add(txnama);
           getContentPane().add(txnim);
            getContentPane().add(tombolSimpan);
            setVisible(true);
    }
    public static void main (String args[])
    {
        AplikasiGridLayout fl=new AplikasiGridLayout();
        fl.KomponenVisual();
        
    }
}
