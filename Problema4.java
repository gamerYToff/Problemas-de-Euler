//O problema 4 nos desafia a encontra o maior palindromo de 3 digitos.
/*Um palindromo é uma palavra ou numero que se invertemos continua igual, alguns exemplos são: a palavra ama que ao ser invertida fica igual e o numero 2020 que ao
invertemos continua 2020. Sendo assim devemos encontra qual o maior numero resultante da multiplicação de dois numeros de 3 digitos.
*/

public class Inicializacao {

	public static void main(String[] args) {
		int maiorPalindromo=0;
		String n1="";
		String n2="";
		for(int c=0; c<999; c++) {
			for(int d=0; d<999; d++) {
				if(c*d==inverteNumero(c*d) && c*d>maiorPalindromo) {
					maiorPalindromo=c*d;
					n1= Integer.toString(c);
					n2= Integer.toString(d);
				}
			}
		}
		System.out.println("O maior palíndromo de 3 digitos é "+maiorPalindromo+" ele é o produto de "+n1+"X"+n2);
	}
	
	public static int inverteNumero(int numero) {
		String numerostring =Integer.toString(numero);
		String numeroinvertido="";
		for(int c=numerostring.length(); c>0; c--) {
			numeroinvertido+= numerostring.charAt(c-1);
		}
		return Integer.parseInt(numeroinvertido);
	}
	
}
