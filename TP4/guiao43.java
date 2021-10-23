public class guiao43 {
    public static void main(String[] args) {
        System.out.println(Imprimir(MultiplosDeTres(3), NNumerosImpares(3), NPotenciasDez(3)));
    }

    static String Imprimir(String msg1, String msg2, String msg3){
        return msg1 + "\n" + msg2 + "\n" + msg3;
    }

    static String MultiplosDeTres(int num){
        StringBuilder sb = new StringBuilder();
        String msg;

        for(int i = 0; i < num; ++i){
            sb.append(num + "x3=" + num*3 + "  ");
        }
        msg = sb.toString();
        return msg;
    }

    static String NNumerosImpares(int num){
        StringBuilder sb = new StringBuilder();
        String msg;

        for(int i = 0; i <= num; ++i){
            sb.append(i*2 + 1 + " ");
        }
        msg = sb.toString();
        return msg;
    }

    static String NPotenciasDez(int num){
        StringBuilder sb = new StringBuilder();
        String msg;

        for(int i = 1; i <= num; ++i){
            sb.append((int) Math.pow(10, i) + " ");
        }
        msg = sb.toString();
        return msg;
    }

}
