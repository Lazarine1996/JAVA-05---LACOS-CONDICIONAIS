package atividadejava05;

import java.util.Scanner;

public class AtividadeSwitch5 {

	public static void main(String[] args) {
	    float valor = 0.0f;
	    String iten = null;
	    int quantidade;
	    
		Scanner Scanner = new Scanner(System.in);
	
		
		System.out.println("Digite um número de 1 a 6: ");
	     int num = Scanner.nextInt();
	     
	     switch (num) {
	     
	     case 1:
		    	
		    	System.out.println("Digite a quantidade de itens desejados: ");
		    	quantidade = Scanner.nextInt();
		        valor = quantidade * 10.00f;
		        iten = "Cachorro Quente";
		        System.out.printf("Produto %s \nValor Total: %.2f", iten, valor);
		    	break;
		        
	     case 2:
		    	
	    	    System.out.println("Digite a quantidade de itens desejados: ");
		    	quantidade = Scanner.nextInt();
		        valor = quantidade * 15.00f;
		        iten = "X Salada";
		        System.out.printf("Produto %s \nValor Total: %.2f", iten, valor);
		    	break;
		        
	     case 3:
		    	
	    	    System.out.println("Digite a quantidade de itens desejados: ");
		    	quantidade = Scanner.nextInt();
		        valor = quantidade * 18.00f;
		        iten = "X Bacon";
		        System.out.printf("Produto %s \nValor Total: %.2f", iten, valor);
		    	break;
		        
	     case 4:
		    	
	    	    System.out.println("Digite a quantidade de itens desejados: ");
		    	quantidade = Scanner.nextInt();
		        valor = quantidade * 12.00f;
		        iten = "Bauru";
		        System.out.printf("Produto %s \nValor Total: %.2f", iten, valor);
		    	break;
		        
	     case 5:
		    	
	    	 System.out.println("Digite a quantidade de itens desejados: ");
		    	quantidade = Scanner.nextInt();
		        valor = quantidade * 8.00f;
		        iten = "Refrigerante";
		        System.out.printf("Produto %s \nValor Total: %.2f", iten, valor);
		    	break;
		    	
	     case 6:
		    	
	    	 System.out.println("Digite a quantidade de itens desejados: ");
		    	quantidade = Scanner.nextInt();
		        valor = quantidade * 8.00f;
		        iten = "Suco de Laranja";
		        System.out.printf("Produto %s \nValor Total: %.2f", iten, valor);
		    	break;
		    	
		        
	     default:
			   System.out.println("PRODUTO NÃO ENCONTRADO!");
			   break;
		}
	


Scanner.close();

	}

}
