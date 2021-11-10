public class serie3 {
    public static void main(String[] args) {
        /*Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Double.parseDouble(args[2]);
        System.out.println(QuadraticEquationSolver.Solver(a, b, c));*/
        System.out.println(isPerfect(6));
        System.out.println(howManyPerfectNumbers(7));
        System.out.println(gcd(23732, 180));
        System.out.println(mmc(36, 6));
        System.out.println(QuadraticEquationSolver.Solver(1.0, -3.0, 2.0));
    }

    static boolean isPerfect(int n){
        int nHolder = n, divisores = 1, soma = 0;
        boolean isPerfect = false;

        while(divisores<n){
            if(n%divisores == 0){
                soma+=divisores;
            }
            divisores++;
        }
        if(soma == nHolder){
            isPerfect = true;
        }
        return isPerfect;
    }

    static int howManyPerfectNumbers(int n){
        int manyNumbers = 0;
        for(int i = 1; i < n; i++){
            if(isPerfect(i)){
                manyNumbers++;
            }
        }
        return manyNumbers;
    }

    static int gcd(int m, int n){
        if(n==0){
            return m;
        }
        else{
            return gcd(n, m%n);
        }
    }

    static int moduloNumero(int num){
        if(num<0)
            return -num;
        else 
            return num;
    }
    static int mmc(int m, int n){
        return moduloNumero(n*m)/gcd(m, n);
    }

    public static class QuadraticEquationSolver{

        public static String Solver(Double a , Double b, Double c){
            Double sol1, sol2;
            sol1 = (-b + Math.sqrt(Math.pow(b, 2)- 4*a*c))/2*a;
            sol2 = (-b - Math.sqrt(Math.pow(b, 2)- 4*a*c))/2*a;

            return "Solucoes: \n" + sol1 + "; " +  sol2;
        }
    }    
}
