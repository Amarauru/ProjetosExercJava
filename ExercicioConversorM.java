import java.util.Scanner;

public class ExercicioConversorM {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira quantos metros deseja:");
		double M = scan.nextDouble();
		double CM;
		
		CM = M*100;
		
		System.out.println("Em centimetros, daria: " + CM + "cm");
		
		
		/*ou poderia ser feito assim também:
		
		System.out.println("Insira quantos metros deseja:");
		double M = scan.nextDouble();
		double CM = M*100;
		System.out.println("Em centimetros, daria: " + CM + "cm"); */
		
	}

}
