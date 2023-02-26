import java.util.Scanner;
public class ExercicioConversorFarenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira a temperatura em Farenheit");
		double fTemp = scan.nextDouble();
		
		double cTemp;
		
		cTemp = (fTemp - 32) / 1.8;
		
		System.out.println(fTemp + "F em Celsius e: " + cTemp + "º"); 
		
		// de Celsius para farenheit 
		
		/*  System.out.println ("Insira a temperatura em Celsius");
		double cTemp = scan.nextDouble();
		
		double fTemp;
		
		fTemp = (cTemp * 1.8) + 32;
		
		System.out.println (cTemp + "Cº em Farenheit e: " + fTemp);*/
	}

}
