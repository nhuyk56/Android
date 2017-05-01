import java.awt.*;         
import java.awt.event.*;   
public class AWTCounter56131778 extends Frame implements WindowListener{
   private Label lbldemTangDan;    
   private TextField tfHienThi;   
   private Button btndemTangDan;    
   private int demTangDan = 0;      
   
   public AWTCounter56131778 () {
      setLayout(new FlowLayout());
      lbldemTangDan = new Label("Bộ đếm: ");   
      add(lbldemTangDan);    
      tfHienThi = new TextField("0", 10);  
      tfHienThi.setEditable(false);        
      add(tfHienThi);   
      btndemTangDan = new Button("Đếm");   
      add(btndemTangDan); 
      btndemTangDan.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
        	  demTangDan = demTangDan + 1;  
    	      tfHienThi.setText(demTangDan + ""); 
           }
        });
      setTitle("AWT Bộ Đếm");   
      setSize(300, 100);        
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
   public static void main(String[] args) {
      AWTCounter56131778 Bai1_56131778 = new AWTCounter56131778(); 
   }
}