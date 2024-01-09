class Logica{

	public static void main (String [] args){
		int platanos = 6;
		boolean melocotones = true;
		/*if(platanos == 6 && melocotones == true){
			platanos = 4;
		 System.out.println("Paco a comprado "+platanos);
		}
		else{
		System.out.println("Paco a comprado "+platanos);
		}*/
	//Método 2 Operador ternario
	platanos = (platanos == 6 && melocotones == true) ? 4:6;
	System.out.println("Paco a comprado "+platanos);
	}
}