public class ejerciciosRecursivos {
    public int fibonanci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonanci(n - 1) + fibonanci(n - 2);
    }

    public int sumaConsecutivos(int n){
        if (n == 1){
            return 1;
        }  
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = n + resultadoParcial;
        return resultado;
    }
}

