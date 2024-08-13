package view;
import javax.swing.JOptionPane;
import controller.Ex05;


public class mainEx05 {
	public static void main (String args[]) {
		Ex05 m = new Ex05();
		
		int a =0; 
		int b = 0;
		double resp = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o b"));
		
		resp = m.MDC(a, b);
		System.out.println(resp);
		
		
	}

}

