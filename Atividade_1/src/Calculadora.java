import java.util.Scanner;

public class Calculadora {
	
	 public static void main (String args[]){ 
          
    	Calculadora c = new Calculadora();  
        
        int opcao = 5;  
        double num1;  
        double num2;  
		
        Scanner input = new Scanner(System.in);
       
        System.out.println("Escolha uma opera��o");  
        System.out.println("1. Soma");    
        System.out.println("2. Subtra��o");    
        System.out.println("3. Multiplica��o");    
        System.out.println("4. Divis�o");    
        System.out.println("0. Sair");    
        System.out.println("Opera��o: ");    
        
        opcao = input.nextInt();  
        
        while (opcao != 0) {
			Scanner input1 = new Scanner(System.in);    
			System.out.println("Digite o primeiro numero: ");  
			num1 = input1.nextDouble();  
			System.out.println("Digite o segundo numero: ");  
			num2 = input1.nextDouble();
			if ( opcao == 1 ) {
				double operacao = c.soma(num1, num2);
                System.out.printf("\nResultado da soma �: %f\n", operacao);  
                break;  
            }  
            else if (opcao == 2) { 
            	double operacao = c.subtracao(num1, num2);
				System.out.printf("\nResultado da subtra��o �: %f\n", operacao);  
				break;  
			}  
			else if (opcao == 3) {
				double operacao = c.multiplicacao(num1, num2); 
				System.out.printf("\nResultado da multiplica��o �: %f\n", operacao);    
				break;  
			}  
			else if (opcao == 4) {  
				double operacao = c.divisao(num1, num2);  
				System.out.printf("\nResultado da divis�o �: %f\n", operacao);   
				break;  
			}  
			else{  
				System.out.println("?");  
				break;  
			}      
        } 
    }  
    
    public double soma(double num1, double num2) {
        return num1 + num2;
    }  
    public double subtracao(double num1, double num2){
        return num1 - num2;
    }  
    public double divisao(double num1,double num2){
        return num1 / num2;
    }  
    public double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
}
