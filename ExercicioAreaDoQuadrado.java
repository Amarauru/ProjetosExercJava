import java.util.Scanner;

public class ExercicioAreaDoQuadrado {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		//calcular a area de um quadrado e mostrar o dobro para o usuário.
		
		System.out.println("Digite o lado do quadrado");
		double lado = scan.nextDouble();
		double dobroQuad;
		
		lado = (lado * lado);
		
		dobroQuad = lado * 2; 
		
		System.out.println ("a area do quadrado e: " + lado);
		System.out.println ("o dobro da area do quadrado e:" +  dobroQuad);

		
		/* ou também pode ser feito desta forma
		System.out.println("Digite o lado do quadrado");
		double lado = scan.nextDouble();
		
		double area = Math.pow (lado,2);
		
		System.out.println ("A area do quadrado e: " + area);
		System.out.println ("O dobro da area do quadrado e " + (area*2)); */
	}
	
}
