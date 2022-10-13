public class EjerciciosTema9{
	public static void main(String[] args){
		Cliente cliente = new Cliente();
			cliente.edad = 20;
			cliente.nombre = "Julio";
			cliente.telefono = 44556677;
			cliente.credito = 1000;

			System.out.println("El cliente tiene " + cliente.edad + " años");
			System.out.println("El cliente se llama " + cliente.nombre);
			System.out.println("El teléfono del cliente es " + cliente.telefono);
			System.out.println("El crédito del cliente es por €" + cliente.credito);

		Trabajador trabajador = new Trabajador();
			trabajador.edad = 30;
			trabajador.nombre = "Manuel";
			trabajador.telefono = 55667788;
			trabajador.salario = 900;

			System.out.println("El trabajador tiene " + trabajador.edad + " años");
			System.out.println("El trabajador se llama " + trabajador.nombre);
			System.out.println("El teléfono del trabajador es " + trabajador.telefono);
			System.out.println("El salario del trabajador es €" + trabajador.salario);
	}
}

class Persona{
	int edad;
	String nombre;
	int telefono;
}

class Cliente extends Persona{
	int credito;
}

class Trabajador extends Persona{
	int salario;
}