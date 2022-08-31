package estructuradecontrol;

public class Condicionales {
	public static void main(String []args) {
		
		//condiconal if (simple)
		
		byte edad = 38;
		String Nombre = "Danilo";
		boolean esUnvengador = true;
		
		if (edad > 0  && edad < 100 ||( Nombre == "Leandro" && esUnvengador)) {
			//Se ejecuta esto si la expresion es verdadera 
			
			
			System.out.println(Nombre + " tiene " + edad + " a\u00f1os de edad");
			
			
		}
		
		System.out.println("Fin del porgrama");
		
		
		//condicional if else if (anidada)
		char semaforo = 'n';
		
		
		if(semaforo == 'r') {
			System.out.println("ALTO");
		}else if (semaforo == 'a') {
			System.out.println("Pase con precaucion");
	    }else if (semaforo == 'v') {
			System.out.println("SIGA");
	    }else {
		    System.out.println("No hay energia - Semaforo apagado");
		}
	}

	}
