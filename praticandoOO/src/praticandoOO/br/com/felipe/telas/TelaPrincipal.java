package praticandoOO.br.com.felipe.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame{
	
	JFrame f;  
	public void novaTela(){
		
		final JTextField tf=new JTextField();  
		tf.setBounds(50,50, 150,20);
		
		JButton b=new JButton(new ImageIcon("C:\\Users\\fbmac\\eclipse-workspace\\praticandoOO\\img\\button-icon.png"));//JButton b=new JButton(new ImageIcon("D:\\icon.png"));    
		b.setBounds(50,100,136,45);  

		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				tf.setText(tf.getText() + "aaa");  
			}  
		});
		
		
		add(b);//adding button on frame
		add(tf);
		setSize(400,500);  
		setLayout(null);  
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
