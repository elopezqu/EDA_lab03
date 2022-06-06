import java.util.Scanner;

public class Ejemplo {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		cola<String> col = new cola<String>();
		System.out.print("Colas \n");
	    int opc = 0;

		while(opc!=4) {
			mostrarMenu();
			System.out.print("Ingresar una opcion : ");
		    opc = scan.nextInt();
	        System.out.print("\n");

			switch (opc) {
	        case 1:
	            System.out.print("Insertar un dato: \n");
	            String str = scan.next();
	            col.Insertar(str);
	            break;
	        case 2:
	            System.out.println("Se ha eliminado el elemento "+col.Extraer()+"\n");
	            break;
	        case 3:
	            col.MostrarContenido();
	            break;
	        case 4:
	            System.out.println("Programa Finalizado");
	            break;
	        default:
	            System.out.println("Opción no dispobible.");
	            break;	
		}
    }
		
		
	}

	public static void mostrarMenu() {

	System.out.print("Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Extraer un nodo\n"
                        + "3. Mostrar contenido de la Cola\n"
                        + "4. Terminar ejemplo.\n\n");
	}
}
