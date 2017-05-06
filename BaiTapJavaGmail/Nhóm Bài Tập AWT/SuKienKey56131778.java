import java.awt.*;
import java.awt.event.*;
public class SuKienKey56131778 extends Frame implements KeyListener, WindowListener {
   private TextField tfNhap; 
   private TextArea taHienThi; 
   public SuKienKey56131778() {
      setLayout(new FlowLayout());
      add(new Label("Nhập một đoạn text: "));
      tfNhap = new TextField(10);
      add(tfNhap);
      taHienThi = new TextArea(5, 40); 
      taHienThi.setEditable(false); 
      add(taHienThi);
      tfNhap.addKeyListener(this);
      setTitle("Sự Kiện Key"); 
      setSize(400, 200);         
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
  
   public void keyTyped(KeyEvent evt) {
	      taHienThi.append("Bạn đã đánh máy: " + evt.getKeyChar() + "\n");
	   }
   public void keyPressed(KeyEvent evt) { }
   public void keyReleased(KeyEvent evt) { }
   public static void main(String[] args) {
	   SuKienKey56131778 SuKienKey = new SuKienKey56131778();   
   }
}