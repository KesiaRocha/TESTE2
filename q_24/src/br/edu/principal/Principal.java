package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

int NumeroOp = 0;
int NumOpMaior = 0;
double Salario = 0;
double TotFolha = 0;
int Pe�aMensal = 0;
double MediaMasc = 0;
double MediaFem = 0;
int NumeroMaiorSal = 0;
char Sexo = ' ';
int TotPe�as = 0;
int contFem = 0;
int contMasc = 0;
double SalMaior = 0.0;


Scanner sc = new Scanner(System.in);

for(int cont = 1; cont <= 5; cont++) {

System.out.println("\n ========F�BRICA FELIZ=======\n");
System.out.println("Digite seu n�mero de oper�rio:");
NumeroOp = sc.nextInt();

System.out.println("Digite a quantidade de pe�as feitas por m�s:");
Pe�aMensal = sc.nextInt();

System.out.println("Digite o seu sexo (M ou F) :");
Sexo = sc.next().toUpperCase().charAt(0);

if (Pe�aMensal<=30){
	Salario = 150;
	}
else if (Pe�aMensal >= 31 & Pe�aMensal <=35 ){
	Salario = 150 + (0.03 * Salario) * (Pe�aMensal - 30);
}
else if (Pe�aMensal > 35){
Salario = 150 + (0.05 * Salario) * (Pe�aMensal - 30);
}

System.out.println("O sal�rio equivalente ser�: "+ Salario);

// FOLHA DE PAGAMENTO

TotFolha = TotFolha + Salario;
System.out.println("A folha de pagamento ser�: "+ TotFolha);

// TOTAL DE PE�AS

TotPe�as = TotPe�as + Pe�aMensal;
System.out.println("O total de pe�as ser�: "+ TotPe�as);

if (Sexo == 'M') {
	
	MediaMasc = MediaMasc + Pe�aMensal;
	contMasc = contMasc + 1;
	
}
else {
	MediaFem = MediaFem + Pe�aMensal;
	contMasc = contFem + 1;
}


if(cont == 1) {
	SalMaior = Salario;
	NumOpMaior = NumeroOp;
	
}
else {
	if(Salario > SalMaior) {
		SalMaior = Salario;
		NumOpMaior = NumeroOp;
	}
}

}

// FORA DO FOR

if (contMasc == 0) {
	MediaMasc = 0;
}
else {
	MediaMasc = MediaMasc/contMasc;
}
	
if (contFem == 0) {
	MediaFem = 0;
}
else {
	MediaFem = MediaFem/contFem;
}
	
System.out.println(" A m�dia de pe�as fabricadas por mulheres � igual a: "+ MediaFem);
System.out.println(" A m�dia de pe�as fabricadas por homens � igual a: "+ MediaMasc);

System.out.println(" O n�mero do oper�rio com maior sal�rio �:  "+ NumOpMaior);

}
}
