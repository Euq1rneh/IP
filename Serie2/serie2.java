import java.util.HashMap;
import java.util.Map;

public class serie2 {
    public static void main(String[] args) {
        System.out.println(Modulo());
        System.out.println(EVogal('u'));
        System.out.println(Maximo());
        System.out.println(Positivos());
        System.out.println(Iguais());
        System.out.println(Mes(4));
        System.out.println(IguaisDecimaisEm3Casas(3.145, 3.145));
        System.out.println(AprovacaoIP());
        System.out.println(ImprimePorExtenso(12, 1, 2009));
        System.out.println(NumerosPorExtenso(16));
        System.out.println(Linhas(5));
        System.out.println(Fatorial(10));
        LinhasAsteriscos(5);
    }

// Exercicio 1

    static int Modulo(){
        int modulo, x = 5, y = 2;

        if((x-y) < 0){
            modulo = -(x-y);
        }
        else{
            modulo = x-y;
        }
        return modulo;
    }

// Exercicio 2

    static boolean EVogal(char letra){
        boolean isVowel;
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            isVowel = true;
        }     
        else{
            isVowel = false;
        }
        return isVowel;
    }

// Exercicio 3

    static String Maximo(){
        int n = 1, m = 5, k = 10, max = -1;
        int[] paraComparar = {n, m, k};

        for(int i = 1; i < paraComparar.length; i++){
            if(paraComparar[i-1] < paraComparar[i]){
                max = paraComparar[i];
            }
            else{max = paraComparar[i-1];}
        }
        return "O maximo entre " + m  + ", " + n + ", " + k + " e " + max;
    }

// Exercicio 4

    static String Positivos(){
        int n = -1, m = 2, k = -10, contadorPositivos = 0, contadorNegativos = 0;
        int[] quaisPositivos = {n, m, k};
        for(int i = 0; i < quaisPositivos.length; i++){
            if(quaisPositivos[i] > 0){
                contadorPositivos++;
            }
            else{contadorNegativos++;}
        }
        return "Existem " + contadorPositivos + " numero(s) positivos" + " e existem " + contadorNegativos + " numero(s) negativos";
    }
// Exercicio 5

    static String Iguais(){
        int m = 1, n = 1, k = 1, contador = 0, iguais = 0;
        int[] quaisIguais = {m, n, k};

        for(int i = 1; i< quaisIguais.length; i++){
            if(quaisIguais[i-1] == quaisIguais[i]){
                contador++;
            }
        }
        if(contador == 1){
            iguais = 2;
        }
        else if(contador == 0){
            iguais = 0;
        }
        else{iguais = 3;}

        return "Existe(m) " + iguais + " numeros iguais";
    }

// Exercicio 6

    static String Mes(int mes){
        String MES;

        if(mes == 1){
            MES = "janeiro";
        }
        else if(mes == 2){
            MES = "fevereiro";
        }
        else if(mes == 2){
            MES = "marco";
        }
        else if(mes == 2){
            MES = "abril";
        }
        else if(mes == 2){
            MES = "maio";
        }
        else if(mes == 2){
            MES = "junho";
        }
        else if(mes == 2){
            MES = "julho";
        }
        else if(mes == 2){
            MES = "agosto";
        }
        else if(mes == 2){
            MES = "setembro";
        }
        else if(mes == 2){
            MES = "outubro";
        }
        else if(mes == 2){
            MES = "novembro";
        }
        else {
            MES = "dezembro";
        }

        return MES;
    }

// Exercicio 7
    
    static boolean IguaisDecimaisEm3Casas(Double x, Double y){
        boolean saoIguais = false;
        x *= 1000;
        y*= 1000;

        if(x.equals(y)){
            saoIguais = true;
        }

        return saoIguais;
    }

// Exercicio 8

    static String AprovacaoIP(){
        Double notaAvContinua = 18.1, notaTrabalho = 10.3, notaExame = 9.1;
        Double formula = 0.1 * notaAvContinua + 0.2* notaTrabalho + 0.7 * notaExame;
        int notaFinal =(int) Math.ceil(formula);
        if(notaExame < 9.5 || formula < 9.5){
            return "Infelizmente nao obteve aprovacao na disciplina.";
        }
        else{
            return "Parabens, obteve aprovacao a disciplina com " + notaFinal + " como nota final.";
        }
    }

// Exercicio 9

    static String ImprimePorExtenso(int dia, int mes, int ano){
        return dia + " de " + Mes(mes) + " de " + ano;
    }

//Exercicio 10 - Demasiado Extenso

    static String NumerosPorExtenso(int num){
        String numero = String.valueOf(num);
        Map<String, String> numerosPorExtenso = new HashMap<String, String>(); 
        numerosPorExtenso.put("1", "um");
        numerosPorExtenso.put("2", "dois");
        numerosPorExtenso.put("3", "tres");
        numerosPorExtenso.put("4", "quatro");
        numerosPorExtenso.put("5", "cinco");
        numerosPorExtenso.put("6", "seis");
        numerosPorExtenso.put("7", "sete");
        numerosPorExtenso.put("8", "oito");
        numerosPorExtenso.put("9", "nove");
        numerosPorExtenso.put("10", "dez");
        numerosPorExtenso.put("11", "onze");
        numerosPorExtenso.put("12", "doze");
        numerosPorExtenso.put("13", "treze");
        numerosPorExtenso.put("14", "quatorze");
        numerosPorExtenso.put("15", "quinze");
        numerosPorExtenso.put("16", "dezasseis");
        numerosPorExtenso.put("17", "dezassete");
        numerosPorExtenso.put("18", "dezoito");
        numerosPorExtenso.put("19", "desanove");
        numerosPorExtenso.put("20", "vinte");

        return numerosPorExtenso.get(numero);
    }

// Exercicio 11

// Exercicio 12

    static String Linhas(int n){
        int i = 0;
       
        StringBuilder sbAsteriscos = new StringBuilder();
        StringBuilder sbAteN = new StringBuilder();
        StringBuilder sbNImpar = new StringBuilder();

        while(i< n){
            sbAsteriscos.append("*");
            sbAteN.append(String.valueOf(i+1 + " "));
            sbNImpar.append(String.valueOf((2*i+1)  + " "));
            i++;
        }
        return sbAsteriscos.toString() + "\n" + sbAteN.toString() + "\n" + sbNImpar.toString();
    }

// Exercicio 12

    static String Fatorial(int n){
        int fact = 1, contador = 1;
        StringBuilder sb = new StringBuilder();
        //fatorial
        for(int i = 1; i<=n; i++){
            fact*= i;
        }
        sb.append(fact + "\n");

        /*fatorial Duplo
        for(int ii = 0; ii<n; ii++){
            if(n%2 == 0){
                factDuplo *= (2*ii -1) ;
            }
            else{
                factDuplo *= 2*ii;
            }
        }
        sb.append(factDuplo + "\n");
        */

        //divisores
        while(contador != n){
            if(n%contador == 0){
                sb.append(String.valueOf(contador + " "));
            }
            contador++;
        }
        sb.append(String.valueOf(n));
      return sb.toString();
    }
// Exercicio 15

    static void LinhasAsteriscos(int n){

        for(int lin = 1; lin <= n ; lin++){
            for(int coll = 0 ; coll < lin; coll++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int lin2 = 1; lin2 <= n ; lin2++){
            for(int coll2 = 0 ; coll2 < lin2; coll2++){
                if(coll2 == lin2-1){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println("");
        }
        for(int lin3 = 1; lin3 <= n ; lin3++){
            for(int coll3 = 0 ; coll3 < lin3; coll3++){
                System.out.print(coll3);
                
            }
            System.out.println("");
        }
    }
}
