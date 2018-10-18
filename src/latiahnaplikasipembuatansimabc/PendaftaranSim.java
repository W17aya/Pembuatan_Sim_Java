import javax.swing.*;

public class PendaftaranSim extends JFrame 
{
 JLabel lblnama=new JLabel("Nama Pendaftar :");
 JTextField txnama=new JTextField(20);
 
 PendaftaranSim()
 {
  setTitle("Pendaftaran SIM");
  setLocation(300,100);
  setSize(450,500);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }
 void komponenVisual()
 {
     getContentPane().setLayout(null);
     getContentPane().add(lblnama);
     lblnama.setBounds(10,10,100,20);
     getContentPane().add(txnama);
     txnama.setBounds(150,10,100,20);
     setVisible(true);
 }
 
 public static void main(String args[])
 {
  PendaftaranSim ps=new PendaftaranSim();
  ps.komponenVisual();
 }   
}
