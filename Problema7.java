//O problema 7 nos desafia a achar o 10001 numero primo.

public class Inicializacao {
	
	public static void main(String[] args) {
		int soma=0;
		for(int c=2;c<2000000000; c++) {
			if(enumeroprimo(c)) {
				soma++;
			}
			if(soma==10001) {
				soma=c;
				break;
			}
		}
		System.out.println(soma);
	}
	
	public static boolean enumeroprimo(int numero){
		for(int c=1;c<=numero; c++) {
			if(numero%c==0 && c!=1 && c!=numero) {
				return false;
			}
		}
		return true;
	}
}
