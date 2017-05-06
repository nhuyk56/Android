import java.awt.*;
import java.awt.event.*;
public class AWTCounter3B56131778 extends Frame implements WindowListener {
   private TextField tfDem;
   private Button tfDemTang, btnDemGiam, btnLamLai;
   private int tmpDem = 0;
   public AWTCounter3B56131778 () {
      setLayout(new FlowLayout());
      add(new Label("Bộ đếm 3 chức năng: "));   
      tfDem = new TextField("0", 10);
      tfDem.setEditable(false);  
      add(tfDem);                
      tfDemTang = new Button("Tăng");
      add(tfDemTang);
      tfDemTang.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ++tmpDem;
            tfDem.setText(tmpDem + "");
         }
      });
      btnDemGiam = new Button("Giảm");
      add(btnDemGiam);
      btnDemGiam.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            tmpDem--;
            tfDem.setText(tmpDem + "");
         }
      });
      btnLamLai = new Button("Làm lại");
      add(btnLamLai);
      btnLamLai.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            tmpDem = 0;
            tfDem.setText("0");
         }
      });
      setTitle("AWT Bộ Đếm Phiên Bản 3 Nút Bấm");
      setSize(450, 100);
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
	   AWTCounter3B56131778 AWTCounter3B = new AWTCounter3B56131778(); 
   }
}