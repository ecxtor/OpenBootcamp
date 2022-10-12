public class EjerciciosTema8{
	public static void main(String[] args){
		Persona persona = new Persona();
			persona.setEdad(16);
			persona.setNombre("Jesús");
			persona.setTelefono(500440088);

			System.out.println("Mi edad es " + persona.getEdad());
			System.out.println("Mi nombre es " + persona.getNombre());
			System.out.println("Mi teléfono es " + persona.getTelefono());
	}
}
class Persona{
		private int edad;
		private String nombre;
		private int telefono;

		public void setEdad(int edad){
			this.edad = edad;
		}
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		public void setTelefono(int telefono){
			this.telefono = telefono;
		}

		public int getEdad(){
			return this.edad;
		}
		public String getNombre(){
			return this.nombre;
		}
		public int getTelefono(){
			return this.telefono;
		}
}	