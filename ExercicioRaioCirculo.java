import java.util.Scanner;

public class ExercicioRaioCirculo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);

		
		//Peça o raio de um circulo,calcule a área de um circulo e mostre sua área.
		
		System.out.println("Insira o raio do circulo");
		double raio = scan.nextDouble();
		double area;
		
		area = Math.PI * (raio * raio);
		//ou area = Math.PI * Math.pow (raio,2);
		
		System.out.println("o valor da area e: " + area);
		
		
		
	}

}
