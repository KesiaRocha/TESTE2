package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		// 3 primeiros multiplos de 3
		
		int qtd = 0;
		int num = 1;

		System.out.println("Os cinco primeiros m�ltiplos de 3 s�o:");
		while(qtd < 5){
			if (num%3 == 0) {
				System.out.println(num);
				qtd = qtd + 1;
				}
			num = num +1;
            
            
        }
	}

}
