

/*
 * 3) Escolha a opção adequada ao tentar compilar e rodar o código a seguir:
 */

public class Exercicio03 {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		int i = 15;
		System.out.println(i);
	}

}

/*
 * a) Erro de compilação na linha 6. A variável i não pode ser redeclarada. 
 * b) Erro de compilação na linha 7. A variável i é ambígua. 
 * c) Compila e roda, imprimindo de 0 até 19 e depois 15. 
 * d) Compila e roda, imprimindo de 0 até 19, depois ocorre um erro de execução na linha 6.
 * e) Compila e roda, imprimindo de 0 até 19 e depois 19 novamente.
 */

/*
 *Resposta: letra c, a variável "i" no escopo do laço for imprime de 0 a 19
 *e a variável que está fora do escopo do laço imprime o numero 15. 
 */
