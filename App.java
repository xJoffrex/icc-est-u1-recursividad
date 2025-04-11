public class App {
    public static void main(String[] args) {
        int n = 6;

        int resultadoFinal = factorial(n);
        System.out.println("Resultado: " + resultadoFinal);


        int base = 2;
        
        int exponente = 3;
        ejerciciosRecursivos ejercicios = new ejerciciosRecursivos(); 

        int resultadoConsecutivos = ejercicios.sumaConsecutivos(n);
        System.out.println("La suma total es: " + resultadoConsecutivos);

        int resultadoPotencia = ejercicios.getPotencia(base, exponente);
        System.out.println("Potencia de " + base + " elevado a " + exponente + ": " + resultadoPotencia);

        int resultadoSuma = ejercicios.Sumatoria2(n);
        System.out.println("La suma de todo es "+resultadoSuma);



    }
        
    public static int factorial(int n){
        if(n == 0){
            System.out.println("Alcance el base");
            return 1;
        }
        int resultadoParcial = n * factorial(n-1);
        System.out.println("Calculando Factorial de: " + n + " Factorial (" + (n - 1) + " - 1)");
        return resultadoParcial;
    }
        
}
