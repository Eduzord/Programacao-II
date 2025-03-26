package primeirospassos;

import javax.swing.JOptionPane;

public class IO3 {
	public static void main(String[] args) {
		String nome = "";
		nome = JOptionPane.showInputDialog(nome);
		String msg = ("Olá, seja bem vindo, "+ nome+"!");
		JOptionPane.showMessageDialog(null, msg);
		
	}

}
