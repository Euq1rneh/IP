public class RepresentacaoBin {
    public static void main(String[] args) {
        //Imprime os valores de 1 a 15 em binario
        for(int i = 1; i<16; i++){
            System.out.println(toBin(i));
        }
    }

    public static String toBin(int n){
        StringBuilder binaryNum = new StringBuilder();
        int nHolder = n;

        if(n == 1)
            return "1";

        while(nHolder!=1){
            binaryNum.append(nHolder%2);
            nHolder/=2;
        }
        binaryNum.append(1);

        return binaryNum.reverse().toString();
    }
}
