package ACT5;
import java.util.Scanner;

public class operaciones {

	public static void main(String[] args) {
	//Llamamos al objeto scanner para capturar resultados 
	Scanner sc = new Scanner (System.in);
	double x, y;

	System.out.println("ACTIVIDAD 5 Oscar David Feregrino Hernandez");
	System.out.println("Ingresa el numero x");
	x = sc.nextDouble(); 
	
	System.out.println("Ingresa el numero y");
	y = sc.nextDouble();
	
	System.out.println("El valor del primer atributo es");
	System.out.println(x);
	System.out.println("El valor del segundo atributo es");
	System.out.println(y);
	
	//Pintamos en pantalla los resultados de las operaciones
	System.out.println("resultado suma atributos");
	System.out.println(x+y);
	System.out.println("resultado resta atributos");
	System.out.println(x-y);
	System.out.println("resultado producto atributos");
	System.out.println(x*y);
	System.out.println("resultado division atributos");
	System.out.println(x/y);
	System.out.println("resultado módulo atributos}");
	System.out.println(x%y);
	
	}

}
