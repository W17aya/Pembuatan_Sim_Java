import javax.swing.*;
import java.awt.*;


public class FrameScrollPane2 extends JFrame{
    String[]header = {"Senin","Selasa","Rabu"};
    String[][]data={{"100","300","150"},{"500","600","450"},{"290","690","360"}};
    
    FrameScrollPane2()
    {
        setLocation(200,100);
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void KomponenVisual()
    {
        JTable tabel1=new JTable(data,header);
        JScrollPane scrollPane = new JScrollPane(tabel1);
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        setVisible(true);
        
    }
}
class AplikasiScrollPane2
{
    public static void main(String args[])
    {
        FrameScrollPane2 t= new FrameScrollPane2();
        t.KomponenVisual();
    }
}