import java.util.ArrayList;

public class guiao44 {
    public static void main(String[] args) {
        System.out.println(ImprimeSobreN(58, FatorarialDeN(58), DivDeN(58), NumDivN(DivDeN(58)), SomaDivDeN(DivDeN(58))));
    }

    static Double FatorarialDeN(int n){
        Double fat = 1.0;
        for(int i = 1; i<=n; i++){
            fat*= i;
        }
        return fat;
    }

    static ArrayList<Integer> DivDeN(int n){
        ArrayList<Integer> divisoresN = new ArrayList<>();
        int numHolder = n, divisor = 1;

        while(numHolder!=1){
            if(numHolder%divisor == 0){
                numHolder/=divisor;
                divisoresN.add(divisor);
                divisor++;
            }  
            else{
                divisor++;
            }
        }
        return divisoresN;
    }

    static int NumDivN(ArrayList<Integer> listaDiv){
        return listaDiv.size();
    }

    static int SomaDivDeN(ArrayList<Integer> listaDivisores){
        int sumDiv=0;

        for(int i = 0; i < listaDivisores.size() ;i++){
            sumDiv+=listaDivisores.get(i);
        }
        return sumDiv;
    }

    static StringBuilder ImprimeSobreN(int n, Double fat, ArrayList<Integer> listaDivN, int numDiv, int sumDiv){
        StringBuilder msgFinal = new StringBuilder();

        msgFinal.append( "O fatorial de " + n +" e " + fat + "\n");
        msgFinal.append("Os divisores de " + n + " sao " + listaDivN.toString() + "\n");
        msgFinal.append("O numero de divisores de " + n + " e " + numDiv + "\n");
        msgFinal.append("A soma dos divisores de " + n + " e " + sumDiv);
        return msgFinal;
    }
    
}
