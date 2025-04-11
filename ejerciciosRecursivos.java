public class ejerciciosRecursivos {
    public int fibonanci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonanci(n - 1) + fibonanci(n - 2);
    }

    public int sumaConsecutivos(int n){
    
        if (n == 1) {
            return 1; 
        }
        return n + sumaConsecutivos(n - 1); 
    }

    public int getPotencia(int base, int exponente){
        if (exponente == 0){
            return 1;
        }else{
            return base * getPotencia(base, exponente-1);
        }      
    }

    public int Sumatoria2(int n){
        if (n <= 10){
            return n;
        }
        return (n%10) + Sumatoria2(n/10);
    }

    public void nhasta1(int n){
        if (n < 0){
            return;
        }

        System.out.println(n);
        nhasta1(n-1);
    }

    public int reversa(int n) {
        return reversaaux(n, 0);
    }

    private int reversaaux(int n, int acumulado) {
        if (n == 0) {
            return acumulado;
        }
        int ultimo = n % 10;
        acumulado = acumulado * 10 + ultimo;
        return reversaaux(n / 10, acumulado);
    }
}
