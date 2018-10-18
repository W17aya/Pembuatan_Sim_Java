import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AplikasiViewData extends JFrame 
{
    String[]
    headers={"NIM,","Nama","Kelas","Kelompok","Tugas1","Tugas2","Tugas3","Tugas4","Tugas5","UTS","UAS"};
    Object[][]data=new Object[0][0];
    JTable tableView;
    int in;
    AplikasiViewData()
    {
        super("View Data");
        setLocation(200,100);
        setSize(300,100);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    void KomponenVisual()
    {
        tableView=new JTable(data,headers);
        JScrollPane scrollpane=new JScrollPane(tableView);
        scrollpane.setPreferredSize(new Dimension(500,80));
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(BorderLayout.CENTER,scrollpane);
        pack();
        setVisible(true);
    }

    void KoneksiDatabase()
{
try {
   Class.forName("sun.jdbc.odbc".JdbcOdbcDriver"); 
}
   
};
}

