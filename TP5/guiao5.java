public class guiao5{
    public static void main(String[] args) {
        MeiaPiramide();
        NAsteriscos();
        Linhas();
        ImprimeValores();
    }

    static void MeiaPiramide(){
        int n = 5;
        for(int linhas = 0; linhas<n; linhas++){
            for(int colunas = 0; colunas <= 2*linhas; colunas++){
                
                System.out.print("*");
            }
            
            System.out.println("");
        }
        System.out.println("");   
    }

    static void NAsteriscos(){
        int n = 5;
        for(int linhas = 0; linhas<n; linhas++){
            for(int espacos = 0; espacos<n-linhas ;espacos++){
                System.out.print(" ");
            }
            for(int colunas = 0; colunas <= 2*linhas; colunas++){
                
                System.out.print("*");
            }
            
            System.out.println("");
        }
        System.out.println("");
    }

    static void Linhas(){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i%j==0 || j%i==0){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println(i);
        }
        System.out.println("");
    }

    static void ImprimeValores(){
        int k = 5, m = 2, n = 8;
            System.out.println("O logaritmo inteiro de base 2 de " + n + " e " + logInteiro(n));
            System.out.println("O menor natural cujo fatorial e maior do que " + k + " e igual a " + fatorialMaiorK(k));
            System.out.println("O quociente inteiro de " + n + " por " + m + " e igual a " + quocienteInteiro(m, n));
            System.out.println("Este quociente e calculado subtraindo o divisor ao dividendo sucessivamente");
        }

    static int logInteiro(int valor){
        int base = 2, log = 0;

        while(valor>=base){
            log++; 
            valor/=base;
        }
        return log;
    }
    
    static int fatorialMaiorK(int k){
        int min = 0, fat = 1, i=0;

        while(fat<=k){
            i++;
            fat*=i;
        }
        min = i;
        return min;
    }
    
    static int quocienteInteiro(int divisor, int dividendo){
        int quotient = 0;
        if(divisor>dividendo){
            System.out.println("O resto da divisao inteira de " + dividendo + " por " + divisor + " e " + quotient);
        }     
        if(divisor == 0){
            System.out.println("Atencao esta a dividir por zero");
        }   
        else{
            while(dividendo>=divisor){
                dividendo-=divisor;
                ++quotient;
            }
        }
        return quotient;
    }
}
