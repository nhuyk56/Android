import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PhuongTrinhBac1 extends JFrame {
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	private float kq = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhuongTrinhBac1 frame = new PhuongTrinhBac1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PhuongTrinhBac1() {
		setTitle("Gi\u1EA3i ph\u01B0\u01A1ng tr\u00ECnh b\u1EADc 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblPT = new JLabel("Ax+B=C");
		lblPT.setBounds(187, 11, 46, 14);
		getContentPane().add(lblPT);
		
		JLabel lblA = new JLabel("A =");
		lblA.setBounds(31, 53, 46, 14);
		getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B =");
		lblB.setBounds(154, 53, 46, 14);
		getContentPane().add(lblB);
		
		txtA = new JTextField();
		txtA.setBounds(51, 50, 86, 20);
		getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(170, 50, 86, 20);
		getContentPane().add(txtB);
		txtB.setColumns(10);
		
		JButton btnGiai = new JButton("Gi\u1EA3i");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Object source = e.getSource();
			        if(source == btnGiai)
			        {   
			        	 float a = Float.parseFloat(txtA.getText());
			        	 float b = Float.parseFloat(txtB.getText());
			        	 kq =  -b/a;
			        	 txtKQ.setText(kq+"");
			        }
			}
		});
		btnGiai.setBounds(167, 89, 89, 23);
		getContentPane().add(btnGiai);
		
		JLabel lblKQ = new JLabel("K\u1EBFt qu\u1EA3 :");
		lblKQ.setBounds(266, 53, 46, 14);
		getContentPane().add(lblKQ);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setBounds(322, 50, 86, 20);
		getContentPane().add(txtKQ);
		txtKQ.setColumns(10);
	}
}
