public class EjerciciosTema4{
	public static void main(String[] args){
		
	//1. if:
		int numeroIf = -1;

		if (numeroIf > 0){
			System.out.println("numeroIf es positivo");
		}else if(numeroIf < 0){
			System.out.println("numerIf es negativo");
		}else {
			System.out.println("nuemroIf es cero");
		}

	//2. while:
		int numeroWhile = 0;

		while(numeroWhile < 3){
			numeroWhile++;
			System.out.println("numeroWhile es: " + numeroWhile);
		}

	//3. do while:
		int numeroDoWhile = 2;

		do{
			numeroDoWhile++;
			System.out.println("numeroDoWhile es: " + numeroDoWhile);
		}while(numeroDoWhile < 3);

	//4. for:
		for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
			System.out.println("numeroFor es: " + numeroFor);
		}

	//5. switch case:
		String estacion = "primavera";

		switch(estacion){
			case "primavera":
			case "verano":
			case "invierno":
			case "otoño":
				System.out.println("La estación actual es: " + estacion);
				break;
			default:
				System.out.println(estacion + " no es una estación");
		}

	}
}
