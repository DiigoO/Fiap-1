import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Exercicio 5
		 */
				
		String numero = JOptionPane.showInputDialog(null,"Digite um n�mero para c�lcular seu fatorial?","Pergunta",JOptionPane.PLAIN_MESSAGE);
		int valor = Integer.parseInt(numero);
		int fatorial = 1;
		
		for( int i = 2; i <= valor; i++ )
		{ 
			fatorial *= i;
		}
		
		JOptionPane.showMessageDialog(null, "O fatorial de " + valor + " � igual a " + fatorial);
	}

}
