//O problema 6 nos desafia a tenta descobrir a diferença entre a soma dos quadrados dos primeiros 100 numeros(1^2+2^2+3^2 etc...) e o quadrado da soma dos primeiros 100
//numeros (1+2+3+4+5+6 etc...)^2

public class Inicializacao {

	public static void main(String[] args) {
		int soma=0;
		int somaDosQuadrados=0;
		for(int c=0; c<=100; c++) {
			soma+=c*c;
		}
		for(int c=0; c<=100; c++) {
			somaDosQuadrados+=c;
		}
		if(somaDosQuadrados*somaDosQuadrados>soma) {
			System.out.println("a diferença é de: "+(somaDosQuadrados*somaDosQuadrados-soma));
		}else {
		System.out.println("a diferença é de: "+(soma-somaDosQuadrados*somaDosQuadrados));
		}
	}
}
