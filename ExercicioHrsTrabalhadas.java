import java.util.Scanner;

public class ExercicioHrsTrabalhadas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário referido no mês.
		
		System.out.println("Quanto você ganha por hora?");
		double qntHoras = scan.nextDouble();
		System.out.println("Quantas horas você trabalha no mês?");
		double nHrsTrab = scan.nextDouble();
		
		double salario = qntHoras * nHrsTrab;
		
		System.out.println ("Seu salário final é: " + salario);
		
		
		
	}

}
