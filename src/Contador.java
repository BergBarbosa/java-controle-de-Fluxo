import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
	
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("⚠️ Erro: " + e.getMessage());
		}
		
		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.print(i);
			if (i < contagem) {
				System.out.print(", ");				
			}
		}
	}

}

class ParametrosInvalidosException extends Exception {
	private static final long serialVersionUID = 1L;
	public ParametrosInvalidosException(String mensagem) {
  	  super(mensagem);
    }
}
