/*
 * 1) Escolha a opção adequada ao tentar compilar e rodar o código a seguir:
 */

public class Exercicio01 {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		System.out.println(i);
	}

}

/*
*a)Erro de compilação.
*b)Compila e roda, imprimindo de 0 até 19 e depois 19.
*c)Compila e roda, imprimindo de 0 até 19, depois ocorre um erro de execução.

*Resposta: Letra a, não se pode utilizar uma variável que não está no escopo, a variável
"i"  está no escopo do laço for.
*/
