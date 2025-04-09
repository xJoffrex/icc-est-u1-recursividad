public class App {
    public static void main(String[] args) {

        /*
        int n = 5;
        int resultadoFinal = factorial(n);
        System.out.println("Resultado: " + n);
        */ 

        ejerciciosRecursivos ejercicios = new ejerciciosRecursivos();
        int fibo = ejercicios.fibonanci(3);
        System.out.println("Resultado del Fibonacci de 3: " + fibo);

        int sumac = ejercicios.sumaConsecutivos(5);
        System.err.println("Resultado suma" + sumac);
    }
     
    
    /* 
    public static int factorial(int n){
        if(n == 0){
            System.out.println("Alcance el base");
            return 1;
        }
        int resultadoParcial = n * factorial(n-1);
        System.out.println("Calculando Factorial de: " + n + " Factorial (" + (n - 1) + " - 1)");
         return resultadoParcial;
    }
         */
}
    