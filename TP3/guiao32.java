
public class guiao32 {
    public static void main(String[] args) {

        int ano = 2000, hora = 2 , minuto = 21 , segundo = 13;
        
        if(ano % 400 == 0 || ano % 4 == 0 && ano %100 != 0){
            System.out.println("O ano " + ano + " e bissexto");
        }
        else{
            System.out.println("O ano "+ ano+ " nao e bissexto");
        }

        System.out.println("Sao "+ hora +"h " + minuto +"m " + segundo + "s. Passaran "+ ParaSegundos(hora, minuto, segundo) + " segundos desde a meia-noite");
        System.out.println("Sao "+ hora +"h " + minuto +"m " + segundo + "s. Faltam "+ AteMeiaNoite(ParaSegundos(hora, minuto, segundo)) + " segundos ate a meia-noite");
        System.out.println("Sao "+ hora +"h " + minuto +"m " + segundo + "s. Ja passou " + PercentagemDia(ParaSegundos(hora, minuto, segundo)) + "% do dia");
        System.out.println(SegundosParaHoraMinSeg(ParaSegundos(hora, minuto, segundo)));
    }

    static int ParaSegundos(int h, int m, int s){
        int emSegundos;
        int horasParaSegundos = h *60*60;
        int minutosParaSegundos = m*60;

        emSegundos = horasParaSegundos + minutosParaSegundos + s;

        return emSegundos;
    }
    

    static int AteMeiaNoite(int segundos){
        int ateMeiaNoite;
        int segundosDia = 24*60*60;

        ateMeiaNoite = segundosDia - segundos;

        return ateMeiaNoite;
    }

    static double PercentagemDia(int segundos){
        double percentagem;
        int segundosDia = 24*60*60, jaPassou = segundos;

        percentagem = (jaPassou / (double) segundosDia) * 100;

        return percentagem;
    }

    static String SegundosParaHoraMinSeg(int segundos){
        String emHorMinSeg;
        int horas, min, seg;

        horas = segundos/3600;
        min = (segundos % 3600) / 60;
        seg = segundos % 60;

        emHorMinSeg = "Passaram "+ segundos + " segundos desde a meia-noite, logo sao " + horas + "h " + min + "m " + seg + "s.";

        return emHorMinSeg;
    }
}
