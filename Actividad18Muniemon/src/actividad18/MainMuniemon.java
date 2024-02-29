package actividad18;

import java.util.Scanner;

public class MainMuniemon {

	//private static Muniemon m;
	//private static int edad;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		menu();
		
		
	}
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		//m = null;
		Muniemon muniemon = null;
		int opcion;
		do {
			System.out.println("-------Menu:)---------");
			System.out.println("1.Dar de alta Muniemon");
			System.out.println("2.Mostar Muniemon");
			System.out.println("3.Salir del programa");
			System.out.println("-----Seleccione una opcion!-----");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				muniemon = altaMuniemon(sc);
				break;
			case 2:	
				mostrarMuniemon(muniemon);
				break;
			case 3:
				System.out.println("Salir del programa..");
				break;
				default:
					System.out.println("Opcion no es valida. Por favor, seleccione una opcion valida");
			}
		
	} while (opcion != 3);
		
	}
	public static Muniemon altaMuniemon(Scanner sc) {
		sc.nextLine();
		System.out.println("Introduzca el nombre de su Mueniemon: ");
		String nombre= sc.nextLine();
		System.out.println("Introduzca la vida del Muniemon: ");
		int vida = sc.nextInt();
		System.out.println("Introduzca el ataque del Muniemon");
		int ataque = sc.nextInt();
		System.out.println("Introduzca la defensa del Muniemon");
		int defensa = sc.nextInt();
		System.out.println("Introduzca el tipo de su Muniemon:");
		for(int i=0;i < TipoMuniemon.values().length;i++) {
			System.out.println(i +"-"+TipoMuniemon.values()[i]);
		}
		int seleccion =sc.nextInt();
		TipoMuniemon tm = TipoMuniemon.values()[seleccion];
		System.out.println("usted ha seleccionado : " + tm);
		Muniemon muniemon = new Muniemon (nombre, vida, ataque, defensa, tm);
		System.out.println("MUNIEMON CREADO!OLE!");
		return muniemon;
	}
	
	public static void mostrarMuniemon(Muniemon muniemon) {
		if(muniemon!= null) {
			System.out.println("--------Datos del Munuemon-----------");
			System.out.println("Nombre: " + muniemon.getNombre());
			System.out.println("Vida: " + muniemon.getVida());
			System.out.println("Ataque: " + muniemon.getAtaque());
			System.out.println("Defensa: " + muniemon.getDefensa());
			System.out.println("Tipo: " + muniemon.getMuniemon());
		}else {
			System.out.println("No hay muniemon  creado aun");
		}
	}
}
