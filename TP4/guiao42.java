import java.util.Arrays;

public class guiao42 {
    public static void main(String[] args) {
        System.out.println(MediaMelhorTestes(15, 10, 20));
    }

    static int MediaMelhorTestes(int t1, int t2, int t3){
        int media;
        int[] notas = {t1, t2, t3};        
        Arrays.sort(notas);
        media = (notas[1]+notas[notas.length-1]) / 2;
        return media;
    }
}
