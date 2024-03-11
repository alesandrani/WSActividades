package actividad20;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCoche {
	private ArrayList<Coche> coches;
	private Scanner sc;
		public MainCoche() {
			coches = new ArrayList<>();
			this.sc = new Scanner(System.in);
		}
		
	public void arrancarElPrograma () {
		int opcion ;
		do {
			System.out.println("-------Menu:)---------");
			System.out.println("1.Crear coche");
			System.out.println("2.Mostrar coches");
			System.out.println("3.Mostrar contador ID");
			System.out.println("4.Resetear contador ID");
			System.out.println("5.Salir del programa");
			System.out.println("Seeleccione una opcion: ");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				crearCoche();
				break;
			case 2:
				mostrarCoches();
				break;
			case 3:
				mostrarContador();
				break;
			case 4:
				resetearContador();
				break;
			case 5:
				System.out.println("saliendo del programa...");
				break;
				default: System.out.println("Opcion no valida");
			}
		}while(opcion != 5);
		
	}
	private void crearCoche() {
		System.out.println("introduzca la matricula");
		String matricula = sc.next();
		System.out.print("Introduzca la marca: ");
        String marca = sc.next();
        Coche coche = new Coche();
        coches.add(coche);
        System.out.println("Coche añadido correctamente");
	}   
	private void mostrarCoches() {
		if(coches.isEmpty()) {
			System.out.println("No hay coches para mostrar");
		}else {
			for (Coche c : coches) {
				System.out.println(c);
			}
		}
	
	}
	private void mostrarContador() {
		System.out.println(" el contador actual es: " + Coche.getContadorId());
	}
	private void resetearContador() {
		Coche.resetearValorActual();
		System.out.println("reseteado correctamente");
	}
	public static void main(String[] args) {
		MainCoche mainCoches = new MainCoche();
		mainCoches.arrancarElPrograma();
	}
}