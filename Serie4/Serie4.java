import java.util.Scanner;
import java.util.Random;

public class Serie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //MyFirstReader(sc);
        //readIntegerInInterval(0, 10, sc);
        //AprovacaoIP(sc);
        //System.out.println(OcurrencesOf("ola", sc));
        //TextLineObsfuscation(sc);
        //System.out.println(PtCarPlateGenerator());
        //System.out.println(RandomWalker(15, 10));
        gameOfLuck(sc);
        sc.close();
    }

    public static void MyFirstReader(Scanner reader){
        String name = reader.next(), surName = reader.next();
        int num1 = reader.nextInt(), num2 = reader.nextInt();
        double media = (double) (num1 + num2)/2;

        System.out.println("Caro " + name +" " + surName  + ", somar " + num1 + " com " +  num2  + " da uma media de " + media);
    }

    public static double readIntegerInInterval(int n, int m, Scanner canal){
        double value;

        do{
            value = canal.nextDouble();
            if(value<n || value >m)
                System.out.print("Por favor insira um valor entre " + n + " e " + m + ": ");
        }while(value<n || value >m);

        return value;
    }

    public static void AprovacaoIP(Scanner reader){
        Double notaAvContinua, notaTrabalho, notaExame;

        System.out.print("Insira a nota da Av Continua: ");
        notaAvContinua = readIntegerInInterval(0, 20, reader);
        

        System.out.print("Insira a nota do Trabalho: ");
        notaTrabalho = readIntegerInInterval(0, 20, reader);
        

        System.out.print("Insira a nota do Exame: ");
        notaExame = readIntegerInInterval(0, 20, reader);
        

        Double formula = 0.1 * notaAvContinua + 0.2* notaTrabalho + 0.7 * notaExame;
        int notaFinal =(int) Math.round(formula);

        if(notaExame < 9.5 || formula < 9.5){
            System.out.println("Infelizmente nao obteve aprovacao na disciplina.");
        }
        else{
            System.out.println("Parabens, obteve aprovacao a disciplina com " + notaFinal + " como nota final.");
        }
    }

    public static int OcurrencesOf(String word, Scanner reader){
        System.out.print("Insira uma letra: ");
        char letter = reader.next().charAt(0);
        int len = word.length();
        int occurrences = 0;

        for(int index = 0; index<len; index++){
            if(word.charAt(index) == letter)
                occurrences++;
        }
        return occurrences;
    }

    public static void TextLineObsfuscation(Scanner reader){
        System.out.println("Insira uma linha de texto: ");
        String line = reader.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean lowerCase = false;

        int lineLen = line.length();
        int counter = 0;

        for(int index = 0; index<lineLen; index++){
            char nextLetter = line.charAt(index);
            if(nextLetter != ' '){
                if(lowerCase){
                    sb.append(Character.toLowerCase(nextLetter));
                }
                else{
                    sb.append(Character.toUpperCase(nextLetter));
                }
                counter++;

                if(counter%5 == 0){
                    lowerCase = !lowerCase;
                }
            }
        }
        System.out.println(sb);
    }

    public static String PtCarPlateGenerator(){
        StringBuilder matricula = new StringBuilder();
        String letters = "ABDEFGHIJKLMNOPQRSTUV";
        Random num = new Random();

        matricula.append(num.nextInt(10) + "" + num.nextInt(10) + "-" + letters.charAt(num.nextInt(10))+ letters.charAt(num.nextInt(10)) + "-" + num.nextInt(10) + num.nextInt(10));

        return matricula.toString();
    }

    private static String moveSequencePrinter(int iterations){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<iterations; i++){
            sb.append(" ");
        }
        sb.append("*\n");
        return sb.toString();
    }
    public static String RandomWalker(int steps, int startingPoint){
        StringBuilder sb = new StringBuilder();
        Random rd = new Random();
        int nextStep = startingPoint;

        sb.append(moveSequencePrinter(startingPoint));
        steps-=1;

        while(steps!=0){
            int moveDirection = rd.nextInt(2);

            if(moveDirection == 0)
                nextStep-=1;
            else
                nextStep+=1;

            sb.append(moveSequencePrinter(nextStep));
            steps-=1;
        }
        return sb.toString();
    }

    private static int rollDice(){
        Random rd = new Random();
        return rd.nextInt(6)+1;
    }

    public static void gameOfLuck(Scanner reader){
        Double bank = (double)1500;
        Double bet, winnings = 0.0, loss = 0.0;
        int d1, d2;
        System.out.print("Insira o seu nome: ");
        String name = reader.nextLine();

        do{
            System.out.println("Quanto e que quer apostar? (aposta nao pode exceder " + bank + ") Para sair introduza zero como aposta" );
            bet = reader.nextDouble();

            if(bet>bank)
                System.out.println("A sua aposta excede o limite (" + bank + ")");

            d1 = rollDice();
            d2 = rollDice();

            
            if(d1+d2 == 7){
                winnings = 2*bet;
                System.out.println(name + "os valores dos dados sao " + d1 + " e " + d2 + " parabens");
            }
            else{
                bank+=bet;
                loss+= bet;
                System.out.println(name + "os valores dos dados sao " + d1 + " e " + d2 + " o banco ganha");
            }
            
        }while(bet>bank || bet >0);

        System.out.println("Ganhou: " + winnings + "\nPerdeu: " + loss + "\nSaldo: " + (winnings-loss));
        
    }
}
