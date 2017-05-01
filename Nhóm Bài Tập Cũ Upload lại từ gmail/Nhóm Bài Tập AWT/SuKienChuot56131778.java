import java.awt.*;
import java.awt.event.*;
public class SuKienChuot56131778 extends Frame implements MouseListener , WindowListener { 
   private TextField tfToaDoChuottX;  
   private TextField tfToaDoChuottY;  
   public SuKienChuot56131778() {
      setLayout(new FlowLayout());  
      add(new Label("Tọa độ X: "));  
      tfToaDoChuottX = new TextField(10);  
      tfToaDoChuottX.setEditable(false);   
      add(tfToaDoChuottX);                
      add(new Label("Tọa độ Y:"));  
      tfToaDoChuottY = new TextField(10);
      tfToaDoChuottY.setEditable(false);   
      add(tfToaDoChuottY);                 
      addMouseListener(this); 
      setTitle("Bắt Sự Kiện Nhấp Chuột");  
      setSize(500, 100);            
      addWindowListener(this);
      setVisible(true);
   }
   public void windowOpened(WindowEvent arg0){}
   public void windowClosing(WindowEvent arg0)
   {
	   System.exit(0);
   }
   public void windowClosed(WindowEvent arg0){}
   public void windowIconified(WindowEvent arg0){}
   public void windowDeiconified(WindowEvent arg0){}
   public void windowActivated(WindowEvent arg0){}
   public void windowDeactivated(WindowEvent arg0){}
   public void mouseClicked(MouseEvent evt) {
      tfToaDoChuottX.setText(evt.getX() + "");
      tfToaDoChuottY.setText(evt.getY() + "");
   }
   public void mousePressed(MouseEvent evt) { }
   public void mouseReleased(MouseEvent evt) { }
   public void mouseExited(MouseEvent evt) { }
   public void mouseEntered(MouseEvent e) {}
   public static void main(String[] args) {
	   SuKienChuot56131778 SuKienChuot = new SuKienChuot56131778();   
   }
}