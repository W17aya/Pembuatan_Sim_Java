import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AplikasiEvent8 extends JFrame
{
 JMenuBar mb=new JMenuBar();
 JMenu data=new JMenu("Data");
 JMenu help=new JMenu("Help");
 JMenuItem input=new JMenuItem("Input Data");
 JMenuItem edit=new JMenuItem("Edit Data");
 JMenuItem quit=new JMenuItem("Keluar");
 JMenuItem about=new JMenuItem("About");
 AplikasiEvent5 isidata=new AplikasiEvent5();
 AplikasiEvent8()
 {
 setTitle("Menu Utama");
 setSize(320,160);
 setLocation(300,200);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void KomponenVisual() 
 {
 setJMenuBar(mb);
 mb.add(data);
 mb.add(help);
 data.add(input);
 data.add(edit);
 data.addSeparator();
 data.add(quit);
 help.add(about);
 
 setVisible(true);
 }
  void AksiReaksi()
 {
 input.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 JOptionPane.showInputDialog(null,"Masukkan nama anda","Data Personalia",JOptionPane.INFORMATION_MESSAGE);
 }
 });
 edit.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 isidata.KomponenVisual();
 isidata.AksiReaksi();
 }
 });
 quit.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 System.exit(0);
 }
 });
 about.addActionListener(new ActionListener()
 { 
 public void actionPerformed(ActionEvent e)
 {
 new FrameAbout(); 
 }
 });
 }
 public static void main(String args[])
 {
 AplikasiEvent8 e8=new AplikasiEvent8();
 e8.KomponenVisual();
 e8.AksiReaksi();
 }
} 
 