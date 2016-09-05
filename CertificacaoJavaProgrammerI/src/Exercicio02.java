

/*
 * 2) Escolhaaopção adequada ao tentar compilar e rodar o código a seguir:
*/
public class Exercicio02 {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++)
			System.out.println(i);
		System.out.println(i);
		System.out.println("finished");
	}

}

/*
 *a) Erro de compilação. 
 *b) Compila e roda, imprimindo de 0 até 19 e depois 19. 
 *c) Compila e roda,imprimindo de 0 até 19, depois 19,depois finished. 
 *d) Compila e roda, imprimindo de 0 até 19, depois ocorre um erro de execução. 
 */

/*Resposta: Letra a, no laço for a omissão de chaves determina a execução somente da primeira linha,
 *  ou seja, o segundo println esta fora do escopo do laço for e consequentemente a um erro
 *  de compilação.   
 */