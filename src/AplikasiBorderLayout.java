import javax.swing.*;
        import  java.awt.*;

public class AplikasiBorderLayout extends JFrame {
    JLabel nama=new JLabel("Nama");
    JLabel nim=new JLabel("Nim");
    JTextField txnama=new JTextField(20);
    JTextField txnim=new JTextField(7);
    JButton tombolSimpan=new JButton("Simpan");
    
    AplikasiBorderLayout()
    {
        setLocation(200,100);
        setSize(450,120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    void KomponenVisual()
    {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(nama,"North");
        getContentPane().add(txnama, "East");
        getContentPane().add(nim, "Center");
        getContentPane().add(txnim, "West");
        getContentPane().add(tombolSimpan,"South");
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        AplikasiBorderLayout fl=new AplikasiBorderLayout();
        fl.KomponenVisual();
        
    }
}
