import java.awt.*;     
import java.awt.event.*; 
public class AWTAccumulator56131778 extends Frame implements ActionListener, WindowListener {
   private Label lnlNhap;     
   private Label lblXuat;   
   private TextField tfNhap;  
   private TextField tfXuat; 
   private int tongCongDon = 0;        
   public AWTAccumulator56131778() {
      setLayout(new FlowLayout());
        
      lnlNhap = new Label("Nhập một số nguyên: "); 
      add(lnlNhap);       
      tfNhap = new TextField(10); 
      add(tfNhap);               
 
      tfNhap.addActionListener(this);
      lblXuat = new Label("Tổng cộng dồn là: "); 
      add(lblXuat);             
      tfXuat = new TextField(10); 
      tfXuat.setEditable(false);  
      add(tfXuat);               
 
      setTitle("AWT Cộng Dồn"); 
      setSize(350, 120); 
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
   public void actionPerformed(ActionEvent evt) {
	      int numberIn = Integer.parseInt(tfNhap.getText());
	      tongCongDon += numberIn;     
	      tfNhap.setText("");  
	      tfXuat.setText(tongCongDon + ""); 
	   }
   public static void main(String[] args) {
	   AWTAccumulator56131778 AWTAccumulator = new AWTAccumulator56131778();
   } 
}