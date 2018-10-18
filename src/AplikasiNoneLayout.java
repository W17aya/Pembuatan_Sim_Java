import javax.swing.*;
import java.awt.*;

public class AplikasiNoneLayout extends JFrame 
{
    JLabel nama=new JLabel("Nama");
    JLabel nim=new JLabel("Nim");
    JTextField txnama=new JTextField(20);
    JTextField txnim=new JTextField(7);
    JButton tombolSimpan=new JButton("Simpan");

    AplikasiNoneLayout()
    {
        setLocation(200,100);
        setSize(450,120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void KomponenVisual()
 {
 getContentPane().setLayout(null);
 getContentPane().add(nama);
 nama.setBounds(10,10,100,25);
 getContentPane().add(txnama);
 txnama.setBounds(150,10,200,20);
 getContentPane().add(nim);
 nim.setBounds(10,30,100,25);
 getContentPane().add(txnim);
 txnim.setBounds(150,30,100,20); 
 getContentPane().add(tombolSimpan);
 tombolSimpan.setBounds(150,50,100,25);
 setVisible(true);
 }
 public static void main(String args[])
 {
 AplikasiNoneLayout fl=new AplikasiNoneLayout();
 fl.KomponenVisual();
 }
} 
