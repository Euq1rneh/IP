public class SquareRoots {
    public static void main(String[] args) {
        System.out.println(RaizInteira(4));
        System.out.println(guessCheckSqrt(2, 0.001));
        System.out.println(newtonSqrt(2, 0.001));
    }

    public static int RaizInteira(int n){
        int sqrRoot = 0;
        for(int i = 1; i*i <= n; i++){
            sqrRoot = i;
        }
        return sqrRoot;
    }

    public static String guessCheckSqrt(int n, Double epsilon){
        Double min = Double.valueOf(RaizInteira(n)), max = min + 1;
        Double squrt = (min+max)/2.0;
        int iteracoes = 0;

        while(Math.abs(squrt*squrt - n) >= epsilon){
            iteracoes++;
            if(squrt*squrt < n)
                min = squrt;
            else
                max = squrt;
            
            squrt = (min+max) / 2.0;
        }
        return "Raiz quadrada: " + squrt + "\nIteracoes: " + iteracoes;
    }

    public static String newtonSqrt(int n, Double epsilon){
        Double x = Double.valueOf(n), y;
        int iteracoes = 0;
        while(Math.abs(x*x-n) >= epsilon){
            y = x-(x*x-n)/(2*x);
            x = y;
            iteracoes++;
        }
        return "Raiz quadrada: " + x + "\nIteracoes: " + iteracoes;
    }
}

