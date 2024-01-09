
class Lambda {    

    public static void main(String[] args) {
        ILambda lambda = nombre -> System.out.println("Hola " + nombre);
        lambda.saluda("Pau");

        ILambda lambda2 = nombre -> {
            String saludo = (nombre.equals("Pau")) ? "Hola Gisela" : "Hola " + nombre;
        };
        lambda.saluda("Gisela");
        lambda.saluda("Paco");

        // Promedio con expresión lambda

        IPromedio promedio = (vector) -> {
            double suma = 0;
            for (int i = 0; i < vector.length; i++) {
                suma += vector[i];
            }
            System.out.println("La suma es: " + suma);
            System.out.println("El total el vector es " + vector.length);
            System.out.println("El promedio es: " + suma / vector.length);
        };

        promedio.promedio(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

        // Factorial con expresión lambda

        IFactorial factorial = numero -> {
            int n = 1;
            for (int i = numero; i > 0; i--) {
                n *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + n);
        };

        factorial.factorial(1);

        // Número Par con expresión lambda

        INumeroPar npar = numero -> {
            String n = (numero % 2 == 0) ? "El numero "+numero+" es par" : "El numero "+ numero +" es impar";
            System.out.println(n);

        };
        npar.numeroPar(121);

        // Número mayor de un vector con expresión lambda

        INumMayor inm = vector -> {
            int mayor = vector[0];
            for (int i = 0; i < vector.length; i++){
                if (vector[i] > mayor){
                    mayor = vector[i];
                }               
            }    
             System.out.println("El numero mayor del arreglo es: " + mayor);        
        };
        inm.numeroMayor(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });

        // Número menor de un vector con expresión lambda
         INumMenor inmenor = vector -> {
            int menor = vector[0];
            for (int i = 0; i < vector.length; i++){
                if (vector[i] < menor){
                    menor = vector[i];
                }               
            }    
             System.out.println("El numero menor del arreglo es: " + menor);        
        };
        inmenor.numeroMenor(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });

        //Numero que mas se repite en un vector con expresión lambda

        INumMasRepetido inrep = vector ->{
            int numero = 0;
            int repeticiones = 0;
            int repeticionesMax = 0;
            for (int i = 0; i < vector.length; i++){
                for (int j = 0; j < vector.length; j++){
                    if (vector[i] == vector[j]){
                        repeticiones++;
                    }
                }
                if (repeticiones > repeticionesMax){
                    repeticionesMax = repeticiones;
                    numero = vector[i];
                }
                repeticiones = 0;
            }
            System.out.println("El numero que mas se repite es: " + numero + " con " + repeticionesMax + " repeticiones");

        };
        inrep.numeroMasRepetido(new int[] {0, 1, 2, 3, 4, 6, 6, 17, 16, 9, 10, 23, 12, 13, 14, 15, 16, 17, 18, 4, 20, 4, 22, 4, 24, 4, 23});
        
        //Dado 3 numeros retorna el mayor con expresión lambda

        IMayorTres imayortres = (num1, num2, num3) -> {
            int mayor = num1;
            if(mayor > num2 && mayor > num3){
                System.out.println("El numero mayor es: " + mayor);
            }else if(num2 > mayor && num2 > num3){
                System.out.println("El numero mayor es: " + num2);
            }else{
                System.out.println("El numero mayor es: " + num3);
            }
        };
        imayortres.mayorTres(5, 10, 7);

        //Dado un string y un numero retorna el string repetido con expresión lambda

        IStringRepetido istring = (string, numero) -> {
            String palabra = string;
            for (int i = 0; i < numero; i++){
                palabra += string;
            }
            System.out.println(string+" se repite "+numero+" veces: "+palabra);
        };
        istring.stringRepetido("Hola", 5);

    }

}