import javax.swing.*;
import java.awt.*;

class FrameAbout extends JFrame
{
 JLabel picture=new JLabel(new ImageIcon("foto.jpg"));
 FrameAbout()
 {
 picture.setPreferredSize(new Dimension(200,200));
 setLocation(500,300);
 setSize(150,200);
 getContentPane().add(picture);
 setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
 setVisible(true);
 }
}
class tersebut kita tempatkan pada method aksiReaksi() pada class
AplikasiEvent8 dengan cara :
 about.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 new FrameAbout();
 }
 }); 