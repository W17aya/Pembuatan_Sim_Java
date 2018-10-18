import javax.swing.*;
import java.awt.*;


class FrameTabel extends JFrame
{
 String[] header={"Senin","Selasa","Rabu"};
 String[][] data =
 {{"100","300","150"},{"500","600","450"},{"290","690","360"}}; 
   
   JTable tabel1=new JTable(data,header);
  FrameTabel()
 {
 setLocation(200,100);
 setSize(300,100);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
  
 void KomponenVisual()
 {
 getContentPane().add(tabel1);
 setVisible(true);
 }
} 

class AplikasiTabel
{
    public static void main(String args[])
    {
        FrameTabel t = new FrameTabel();
        t.KomponenVisual();
    }
}